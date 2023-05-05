package com.example.jetuireference.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComposableScreen() {
    Column(modifier = Modifier.padding(10.dp)) {
        Column(
            modifier = Modifier
                .background(Color(255, 200, 0))
                .border(3.dp, Color.Black)
        ) {
            Text(
                text = "Composable",
                fontSize = 45.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            )
            Text(
                text = "Composableとは",
                fontSize = 20.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
            )
        }

        Column(modifier = Modifier.padding(5.dp, 20.dp)) {
            Text(
                text = "ComposableはJetpack ComposeのUIフレームワークで使用される関数アノテーションであり、宣" +
                        "言的UIの構築を可能にするための重要な概念です。\nComposableアノテーションが付与された関数は、" +
                        "状態を持たず、関数の呼び出しによってUIが構築されるため、同じ入力に対して常に同じ出力を生成す" +
                        "る純粋な関数となります。\nこのような特徴によって、Composableを使用することで、UIの再利用性が" +
                        "高くなり、柔軟かつ効率的なUIの構築が可能になります。",
                fontSize = 25.sp
            )
        }
    }
}