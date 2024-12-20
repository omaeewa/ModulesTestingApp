package com.miracle.modulestestingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.miracle.home.HomeScreen
import com.miracle.modulestestingapp.ui.theme.ModulesTestingAppTheme
import com.miracle.settings.SettingsScreen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val currentScreen = MutableStateFlow(Screen.Home)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModulesTestingAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(Modifier.padding(innerPadding)) {
                        val screen by currentScreen.collectAsState()

                        when (screen) {
                            Screen.Home -> {
                                HomeScreen(navigateToSettings = { currentScreen.update { Screen.Settings } })
                            }

                            Screen.Settings -> SettingsScreen {
                                currentScreen.update { Screen.Home }
                            }
                        }
                    }
                }
            }
        }
    }
}

enum class Screen {
    Home, Settings
}