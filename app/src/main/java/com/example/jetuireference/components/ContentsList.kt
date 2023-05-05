package com.example.jetuireference.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ContentsList(navController: NavController, conTitle: String, conDes: String, toDes: String, overview: String) {
    Column() {
        Button(
            onClick = { navController.navigate(toDes) },
            colors = ButtonDefaults.buttonColors(Color.Yellow),
            modifier = Modifier
                .padding(5.dp, 10.dp)
                .fillMaxWidth()
                .border(2.dp, Color.Black),
        ) {
            Column {
                Text(
                    text = conTitle,
                    fontSize = 45.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = conDes,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }

        Text(
            text = overview,
            fontSize = 20.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 0.dp)
        )
    }
}