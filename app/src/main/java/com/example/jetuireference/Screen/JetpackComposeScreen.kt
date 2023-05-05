package com.example.jetuireference.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun JetpackComposeScreen() {
    Column(modifier = Modifier.padding(10.dp)) {
        Column(
            modifier = Modifier
                .background(Color(255, 200, 0))
                .border(3.dp, Color.Black)
        ) {
            Text(
                text = "Jetpack Compose",
                fontSize = 45.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            )
            Text(
                text = "Jetpack Composeの特徴",
                fontSize = 20.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            )
        }
        
        Column(modifier = Modifier.padding(5.dp, 20.dp)) {
            Text(
                text = "Jetpack Composeは、Kotlin言語でAndroidアプリのUIを構築するための、Declarative UIフ" +
                    "レームワークです。\n従来のAndroidのUI開発手法であるXMLファイルとJava/Kotlinのコードを組み合わせ" +
                    "る方法に代わり、UIの見た目と機能を同時に宣言的に記述することができます。\nJetpack Composeは、より" +
                    "簡潔で簡単にUIを作成することができるだけでなく、カスタマイズ性や再利用性にも優れています。",
                fontSize = 25.sp
            )
        }
    }
}