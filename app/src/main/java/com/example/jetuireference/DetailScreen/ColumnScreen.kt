package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun ColumnScreen() {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
    ) {
        BaseDetailScreen(
            sectionTitle = "Column",
            exText = "Columnは、jetpack composeにおいて、縦方向にレイアウトを行うためのコンポーネントです。複数の" +
                    "子要素を持つことができ、子要素は上から下に順番に並びます。また、子要素のサイズや位置を指定すること" +
                    "ができます。Columnは、LinearLayoutのvertical属性に相当する機能を持ちます。"
        )

        SectionName("例")
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "1",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "2",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "3",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))

        SectionName("コード")
        BaseText(
            "Column(\n" +
                "    modifier = Modifier,   // Columnに適用する修飾子を指定する\n" +
                "    verticalArrangement = Arrangement,  // 子要素を縦方向に配置する方法を指定する\n" +
                "    horizontalAlignment = Alignment,  // 子要素を横方向に配置する方法を指定する\n" +
                "    content = @Composable () -> Unit  // Columnに含める子要素を指定する\n" +
                ") {\n " +
                "    /*並べたいものを記述*/\n" +
                "}"
        )
    }
}