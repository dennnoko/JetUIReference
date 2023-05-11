package com.example.jetuireference.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetuireference.DetailScreen.*

@Composable
fun AppScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigation(backgroundColor = Color.LightGray) {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    selected = true,
                    onClick = { navController.navigate("main") }
                )
            }
        }
    ) {
        NavHost(navController = navController, startDestination = "main" ) {
            composable("main") {
                MainScreen(navController = navController)
            }

            composable("jetpack") {
                JetpackComposeScreen()
            }

            composable("composable") {
                ComposableScreen()
            }
            
            composable("columnRow") {
                ColumnRowScreen(navController = navController)
            }
            
            composable("text") {
                TextScreen()
            }
            
            composable("button") {
                ButtonScreen()
            }
            
            composable("picture") {
                PictureScreen(navController = navController)
            }

            //詳細画面
            composable("column") {
                ColumnScreen()
            }

            composable("row") {
                RowScreen()
            }

            composable("box") {
                BoxScreen()
            }

            composable("image") {
                ImageScreen()
            }

            composable("modifier") {
                ModifierScreen()
            }

            composable("navigation") {
                ScreenTransitionScreen()
            }
        }
    }
}

@Preview
@Composable
fun testScreen() {
    AppScreen()
}