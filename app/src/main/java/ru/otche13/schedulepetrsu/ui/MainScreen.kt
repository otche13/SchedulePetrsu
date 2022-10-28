package ru.otche13.schedulepetrsu.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.himanshoe.kalendar.Kalendar
import ru.otche13.schedulepetrsu.model.ScheduleViewModel



@Composable
fun MainScreen(
    navController: NavController,
    viewModel: ScheduleViewModel
){

//    val listSchedule = viewModel.schedulsDay.value



  Column(modifier = Modifier
      .fillMaxSize()
      .background(Color.White)) {
      Kalendar(
          Modifier.background(Color.Red),
          onCurrentDayClick ={kalendarDay, kalendarEvents -> Log.i("DAA","$kalendarDay") }
      )

//
//      LazyColumn{
//          item(listSchedule){
//              listSchedule!!.forEach { CustomScheduleItem(scheduleItem = it)  }
//          }
//      }
  }
}


