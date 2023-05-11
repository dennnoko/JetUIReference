package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun TextScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(5.dp)
    ) {
        BaseDetailScreen(
            sectionTitle = "Text",
            exText = "Textは、Jetpack Composeで使用されるコンポーザブル関数の一つであり、テキストを表示するために使用されます。テキストの内容やスタイルを指定し、UIにテキストを描画することができます。"
        )

        SectionName("コード")
        BaseText("Text(\n" +
                "    text = \"Hello, World!\", // 表示するテキストを指定\n" +
                "    color = Color.Black, // テキストの色を指定\n" +
                "    fontSize = 24.sp, // テキストのフォントサイズを指定\n" +
                "    fontWeight = FontWeight.Bold, // テキストのフォントの太さを指定\n" +
                "    fontStyle = FontStyle.Italic, // テキストのフォントスタイルを指定\n" +
                "    textAlign = TextAlign.Center, // テキストの配置方法を指定\n" +
                "    textDecoration = TextDecoration.LineThrough, // テキストの装飾を指定\n" +
                "    letterSpacing = 0.1.em, // テキストの文字間隔を指定\n" +
                "    lineHeight = 28.sp, // テキストの行の高さを指定\n" +
                "    modifier = Modifier.padding(8.dp) // テキストの余白を設定\n" +
                ")\n")
    }
}