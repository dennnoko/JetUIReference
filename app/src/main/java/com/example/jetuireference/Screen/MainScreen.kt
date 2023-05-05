package com.example.jetuireference.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetuireference.components.AppTitle
import com.example.jetuireference.components.MainContentsList

@Composable
fun MainScreen(navController: NavController) {
    Column {
        Spacer(modifier = Modifier.height(50.dp))
        //AppTitle
        AppTitle()
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "  Jetpack Composeについて",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(0.dp, 3.dp)
                .background(Color.LightGray)
                .fillMaxWidth()
        )
        MainContentsList(navController = navController, str1 = "Jetpack Compose", tostr1 = "jetpack", str2 = "Composable", tostr2 = "composable", co = Color(255, 200, 0))

        Text(
            text = "  黄色のコンテンツをタップして詳細へ",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(0.dp, 3.dp)
                .background(Color.LightGray)
                .fillMaxWidth()
        )

        MainContentsList(navController = navController, str1 = "Layout", tostr1 = "columnRow", str2 = "Text", tostr2 = "text")
        MainContentsList(navController = navController, str1 = "Button", tostr1 = "button", str2 = "Image", tostr2 = "Image")
        MainContentsList(navController = navController, str1 = "modifier", tostr1 = "modifier", str2 = "Screen transition", tostr2 = "moveScreen")
        MainContentsList(navController = navController, str1 = "Text field", tostr1 = "textField", str2 = "Checkbox", tostr2 = "checkbox")
    }
}