package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetuireference.R
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun ImageScreen() {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        BaseDetailScreen(
            sectionTitle = "Image",
            exText = "Imageは、Jetpack Composeで使用されるコンポーザブル関数の一つであり、画像を表示するために使" +
                    "用されます。Imageコンポーザブル関数を使用すると、リソースやURIから画像を読み込んで表示することができます。\n"
        )

        SectionName("例")
        Image(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "icon",
            modifier = Modifier
                .padding(50.dp)
                .fillMaxSize()
        )

        SectionName("コード")
        BaseText("Image(\n" +
                "    painter: Painter, // 表示する画像を指定するためのPainterオブジェクト\n" +
                "    contentDescription: String?, // 画像の内容を説明するテキスト（オプション）\n" +
                "    modifier: Modifier = Modifier, // 画像に適用する修飾子を指定（オプション）\n" +
                "    alignment: Alignment = Alignment.Center, // 画像の配置を指定（オプション）\n" +
                "    contentScale: ContentScale = ContentScale.Fit, // 画像のスケーリング方法を指定（オプション）\n" +
                "    alpha: Float = 1f // 画像の不透明度を指定（オプション）\n" +
                ")\n")
    }
}