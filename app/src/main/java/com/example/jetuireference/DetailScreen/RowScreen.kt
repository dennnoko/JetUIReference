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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun RowScreen() {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
    ) {
        BaseDetailScreen(
            sectionTitle = "Row",
            exText = "Rowは、子要素を横方向に配置するためのComposeコンポーネントです。Columnと同様に、modifier、" +
                    "horizontalArrangement、verticalAlignment、contentなどのプロパティを使用して構成されます。\n" +
                    "列と異なり、横に要素を並べるために使用されます。"
        )

        SectionName("例")

        Row() {
            Spacer(modifier = Modifier.width(30.dp))

            Text(
                text = "1",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(40.dp, 40.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "2",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(40.dp, 40.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "3",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color.LightGray)
                    .padding(40.dp, 40.dp)
            )
        }

        SectionName("コード")

        BaseText(
            "Row(\n" +
                    "    modifier = Modifier,   // Rowに適用する修飾子を指定する\n" +
                    "    verticalArrangement = Arrangement,  // 子要素を縦方向に配置する方法を指定する\n" +
                    "    horizontalAlignment = Alignment,  // 子要素を横方向に配置する方法を指定する\n" +
                    "    content = @Composable () -> Unit  // Rowに含める子要素を指定する\n" +
                    ") {\n" +
                    "    /*並べたいものを記述*/\n" +
                    "}"
        )
    }
}