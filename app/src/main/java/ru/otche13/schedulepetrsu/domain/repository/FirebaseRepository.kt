package ru.otche13.schedulepetrsu.domain.repository

import androidx.lifecycle.LiveData
import ru.otche13.schedulepetrsu.domain.model.ScheduleItem
import ru.otche13.schedulepetrsu.utils.Resource


interface FirebaseRepository{

    suspend fun getScheduleList():LiveData<Resource<List<ScheduleItem>>>

}