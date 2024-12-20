package com.miracle.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    navigateToSettings: () -> Unit
) {
    val userName = viewModel.userName

    Column {
        Text("Home screen $userName")
        Button(navigateToSettings) {

            Text("Navigate to settings")
        }

    }
}