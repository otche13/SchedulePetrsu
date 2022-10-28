package ru.otche13.schedulepetrsu

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.otche13.schedulepetrsu.db.ScheduleFireBase
import ru.otche13.schedulepetrsu.model.ScheduleViewModel
import ru.otche13.schedulepetrsu.repository.RepositoryFireBase
import ru.otche13.schedulepetrsu.ui.MainScreen

@Composable
fun SetupNavigation(
    navController: NavHostController,
    viewModel: ScheduleViewModel
) {
    NavHost(
        navController = navController, startDestination = Screen.MainScreen.route
    ) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController= navController, viewModel = ScheduleViewModel(
                RepositoryFireBase(scheduleFireBase = ScheduleFireBase())
            ))
        }
    }
}