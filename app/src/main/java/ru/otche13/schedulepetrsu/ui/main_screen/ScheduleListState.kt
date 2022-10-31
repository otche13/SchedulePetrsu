package ru.otche13.schedulepetrsu.ui.main_screen

import ru.otche13.schedulepetrsu.domain.model.ScheduleItem

data class ScheduleListState(
    val isLoading: Boolean = false,
    val schedule: List<ScheduleItem> = emptyList(),
    val error: String = ""
)
