package ru.otche13.schedulepetrsu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.otche13.schedulepetrsu.ui.main_screen.MainScreenViewModel
import ru.otche13.schedulepetrsu.ui.theme.SchedulePetrsuTheme
import ru.otche13.schedulepetrsu.utils.SetupNavigation

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val viewModel: MainScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SchedulePetrsuTheme {
                navController= rememberNavController()
                SetupNavigation(
                    navController = navController,
                    viewModel= viewModel
                )
            }
        }
    }
}
