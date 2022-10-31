package ru.otche13.schedulepetrsu.ui.main_screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import ru.otche13.schedulepetrsu.ui.main_screen.MainScreenViewModel


@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainScreenViewModel= hiltViewModel()
){


    viewModel.state
  }



