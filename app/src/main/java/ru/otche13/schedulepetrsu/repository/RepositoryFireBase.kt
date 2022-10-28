package ru.otche13.schedulepetrsu.repository

import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import ru.otche13.schedulepetrsu.model.ScheduleItem
import ru.otche13.schedulepetrsu.db.GetScheduleItem
import ru.otche13.schedulepetrsu.db.ScheduleFireBase


class RepositoryFireBase(private val scheduleFireBase: ScheduleFireBase):GetScheduleItem {

    override fun loadSchedule(
        scheduleList: MutableLiveData<List<ScheduleItem>>
    ) {
        scheduleFireBase.databaseReference.addValueEventListener(object : ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {

                try {

                    val _scheduleList : List<ScheduleItem> = snapshot.children.map{
                            dataSnapshot ->  dataSnapshot.getValue(ScheduleItem::class.java)!!
                    }

                    scheduleList.postValue(_scheduleList)

                } catch (e:Exception){

                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

    }

    fun  getInstance(): ScheduleFireBase {
        return scheduleFireBase.getInstance()
    }


}