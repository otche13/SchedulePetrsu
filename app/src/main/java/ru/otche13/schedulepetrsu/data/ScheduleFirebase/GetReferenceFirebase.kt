package ru.otche13.schedulepetrsu.data.ScheduleFirebase

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class GetReferenceFirebase {

    val databaseReference: DatabaseReference = FirebaseDatabase
        .getInstance()
        .getReference("86201")
}