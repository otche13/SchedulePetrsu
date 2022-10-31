package ru.otche13.schedulepetrsu.ui.main_screen

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.otche13.schedulepetrsu.domain.use_case.GetScheduleListUseCase
import ru.otche13.schedulepetrsu.utils.Resource
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
   private val getScheduleListUseCase: GetScheduleListUseCase
) :ViewModel() {

    private val _state= mutableStateOf(ScheduleListState())
   val state:State<ScheduleListState> = _state

   init {
      getScheduleList()
   }

   private fun getScheduleList(){
      getScheduleListUseCase().onEach { result->
         when(result){
            is Resource.Success->{
               _state.value= ScheduleListState(schedule = result.data ?: emptyList())
               Log.i("Eee","${result.data}")
            }
            is Resource.Loading->{
               _state.value= ScheduleListState(isLoading = true)
            }
            is Resource.Error->{
               _state.value= ScheduleListState(
                  error = result.message ?: "An unexpected error occured" )
            }
         }
      }.launchIn(viewModelScope)
   }


}