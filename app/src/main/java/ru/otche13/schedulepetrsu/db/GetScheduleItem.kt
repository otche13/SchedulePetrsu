package ru.otche13.schedulepetrsu.db

import androidx.lifecycle.MutableLiveData
import ru.otche13.schedulepetrsu.model.ScheduleItem

interface GetScheduleItem {

    fun loadSchedule(
        scheduleList: MutableLiveData<List<ScheduleItem>>
    )
}