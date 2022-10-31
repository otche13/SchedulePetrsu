package ru.otche13.schedulepetrsu.data.repository

import androidx.lifecycle.LiveData
import ru.otche13.schedulepetrsu.data.ScheduleFirebase.GetScheduleListFb
import ru.otche13.schedulepetrsu.domain.model.ScheduleItem
import ru.otche13.schedulepetrsu.domain.repository.FirebaseRepository
import ru.otche13.schedulepetrsu.utils.Resource
import javax.inject.Inject

class FirebaseRepositoryImpl @Inject constructor(
    private val getScheduleListFb: GetScheduleListFb
):FirebaseRepository{

    override suspend fun getScheduleList(): LiveData<Resource<List<ScheduleItem>>>{
        return getScheduleListFb.getScheduleList()
    }

}