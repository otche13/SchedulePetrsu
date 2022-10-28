package ru.otche13.schedulepetrsu.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.otche13.schedulepetrsu.repository.RepositoryFireBase

class ScheduleViewModel(private val repositoryFireBase: RepositoryFireBase)
    :ViewModel() {

    private val _schedulsDay = MutableLiveData<List<ScheduleItem>>()
    val schedulsDay : LiveData<List<ScheduleItem>> = _schedulsDay

    init {

        repositoryFireBase.getInstance()
        repositoryFireBase.loadSchedule(_schedulsDay)
        Log.i("DAAA","$schedulsDay")

    }
}