package ru.otche13.schedulepetrsu

sealed class Screen(val route: String) {
    object MainScreen: Screen("main_screen")
}