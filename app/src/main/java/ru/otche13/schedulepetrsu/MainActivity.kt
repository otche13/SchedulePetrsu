package ru.otche13.schedulepetrsu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.otche13.schedulepetrsu.model.ScheduleViewModel
import ru.otche13.schedulepetrsu.ui.theme.SchedulePetrsuTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val viewModel: ScheduleViewModel by viewModels()

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
