package ru.otche13.schedulepetrsu.data.ScheduleFirebase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import ru.otche13.schedulepetrsu.domain.model.ScheduleItem
import ru.otche13.schedulepetrsu.utils.Resource
import java.io.IOException
import javax.inject.Inject

class GetScheduleListFb @Inject constructor(
    private val getReferenceFirebase: GetReferenceFirebase
    ){


     fun getScheduleList(): LiveData<Resource<List<ScheduleItem>>> {

        val scheduleList: MutableLiveData<Resource<List<ScheduleItem>>> = MutableLiveData()

        getReferenceFirebase.databaseReference.addValueEventListener(object : ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {

                try {
                    scheduleList.postValue(Resource.Loading())

                    val _scheduleList : List<ScheduleItem> = snapshot.children.map{
                            dataSnapshot ->  dataSnapshot.getValue(ScheduleItem::class.java)!!
                    }

                    scheduleList.postValue(Resource.Success(_scheduleList))


                } catch (e: IOException) {
                   scheduleList.postValue( Resource.Error<List<ScheduleItem>>("IOException"))

                } catch (e: Exception) {
                    scheduleList.postValue(Resource.Error<List<ScheduleItem>>("Exception"))
            }

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })

        return scheduleList
    }
}




