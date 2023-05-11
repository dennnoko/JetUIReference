package com.example.jetuireference.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainContentsList(
    navController: NavController,
    str1: String,
    tostr1: String,
    str2: String,
    tostr2: String,
    co: Color = Color.Yellow
) {
    Row() {
        Button(
            modifier = Modifier
                .clickable { true }
                .padding(5.dp)
                .width(200.dp)
                .height(80.dp)
                .border(2.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = co
            ),
            onClick = { navController.navigate(tostr1) } //画面遷移先をtostr1として渡しておく
        ) {
            Text(
                fontSize = 25.sp,
                text = str1
            )
        }

        Button(
            modifier = Modifier
                .clickable { true }
                .padding(5.dp)
                .width(200.dp)
                .height(80.dp)
                .border(2.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = co
            ),
            onClick = { navController.navigate(tostr2) } //画面遷移先をtostr2として渡しておく
        ) {
            Text(
                fontSize = 25.sp,
                text = str2
            )
        }
    }
}

