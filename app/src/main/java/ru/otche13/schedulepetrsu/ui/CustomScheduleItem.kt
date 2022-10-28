package ru.otche13.schedulepetrsu.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.otche13.schedulepetrsu.model.ScheduleItem


@Composable
fun CustomScheduleItem(scheduleItem: ScheduleItem){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(
            start = 4.dp,
            end = 4.dp,
            top = 4.dp,
            bottom = 4.dp
        )
    ) {
        Column {
            Text(text = scheduleItem.firstname.toString())
            Text(text = scheduleItem.lastname.toString())
            Text(text = scheduleItem.age.toString())
        }
       
    }

}