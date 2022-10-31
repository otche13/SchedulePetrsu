package ru.otche13.schedulepetrsu.data.ScheduleFirebase


class InstanceFireBase{

    @Volatile
    private var INSTANCE: InstanceFireBase? = null

    fun getInstance(): InstanceFireBase {
        return INSTANCE ?: synchronized(this) {

            val instance = InstanceFireBase()
            INSTANCE = instance
            instance
        }
    }
}