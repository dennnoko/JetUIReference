package com.example.jetuireference.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppTitle() {
    Column() {
        Row() {
            Spacer(modifier = Modifier.width(30.dp))

            Text(
                modifier = Modifier
                    .background(Color(240,240,240))
                    .border(5.dp, Color.Black)
                    .padding(20.dp, 5.dp),
                text = "UI",
                fontSize = 120.sp,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.width(20.dp))

            Column() {
                Spacer(modifier = Modifier.height(80.dp))

                Text(
                    text = "reference",
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold,
                )

                Text(
                    text = "for Android",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                )
            }
        }
    }
}