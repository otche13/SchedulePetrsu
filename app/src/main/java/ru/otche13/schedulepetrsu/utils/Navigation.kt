package ru.otche13.schedulepetrsu.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.otche13.schedulepetrsu.Screen
import ru.otche13.schedulepetrsu.ui.main_screen.MainScreenViewModel
import ru.otche13.schedulepetrsu.ui.main_screen.MainScreen

@Composable
fun SetupNavigation (
    navController: NavHostController,
    viewModel: MainScreenViewModel
) {
    NavHost(
        navController = navController, startDestination = Screen.MainScreen.route
    ) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController= navController, viewModel = viewModel
            )
        }
    }
}