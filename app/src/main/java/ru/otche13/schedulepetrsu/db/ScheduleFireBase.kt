package ru.otche13.schedulepetrsu.db

import com.google.firebase.database.*

open class ScheduleFireBase{

     val databaseReference: DatabaseReference = FirebaseDatabase
        .getInstance()
        .getReference("86201")

    @Volatile
    private var INSTANCE: ScheduleFireBase? = null

    fun getInstance(): ScheduleFireBase{
        return INSTANCE ?: synchronized(this) {

            val instance = ScheduleFireBase()
            INSTANCE = instance
            instance
        }
    }
}