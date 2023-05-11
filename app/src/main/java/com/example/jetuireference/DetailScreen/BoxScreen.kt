package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun BoxScreen() {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
    ) {
        BaseDetailScreen(
            sectionTitle = "Box",
            exText = "Boxは、他のコンポーザブルを包含するために使用されるコンテナコンポーザブルで、配置、レイアウト、" +
                    "および背景色などのスタイルの設定に使用されます。Boxには、スタックされた要素に対して重ね合わせや配置を設定するためのModifierがあります。"
        )

        SectionName("例")
        Spacer(modifier = Modifier.height(15.dp))

        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Hello, World!",
                color = Color.Red,
                fontSize = 23.sp,
                modifier = Modifier.align(Alignment.Center)
            )
            Text(
                text = "Hello, World!",
                color = Color.Blue,
                fontSize = 25.sp,
                modifier = Modifier.align(Alignment.Center)
            )
            Text(
                text = "Hello, World!",
                color = Color.Black,
                fontSize = 27.sp,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        SectionName("コード")
        BaseText(
            "Box(\n" +
                    "    modifier = Modifier\n" +
                    "        .size(200.dp) // Boxのサイズを指定\n" +
                    "        .background(Color.LightGray) // Boxの背景色を指定\n" +
                    ") {\n" +
                    "    Text(\n" +
                    "        text = \"Hello, World!\",\n" +
                    "        color = Color.White,\n" +
                    "        fontSize = 24.sp,\n" +
                    "        modifier = Modifier.align(Alignment.Center) // テキストをBoxの中央に配置\n" +
                    "    )\n" +
                    "    Box(\n" +
                    "        modifier = Modifier\n" +
                    "            .size(100.dp) // 内部のBoxのサイズを指定\n" +
                    "            .background(Color.Blue) // 内部のBoxの背景色を指定\n" +
                    "            .align(Alignment.BottomEnd) // 内部のBoxを右下に配置\n" +
                    "    ) {\n" +
                    "        Text(\n" +
                    "            text = \"Nested Box\",\n" +
                    "            color = Color.White,\n" +
                    "            fontSize = 16.sp,\n" +
                    "            modifier = Modifier.padding(8.dp) // テキストの余白を設定\n" +
                    "        )\n" +
                    "    }\n" +
                    "}\n"
        )

    }
}