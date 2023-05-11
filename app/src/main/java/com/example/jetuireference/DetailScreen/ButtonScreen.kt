package com.example.jetuireference.Screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetuireference.DetailScreen.BaseDetailScreen
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun ButtonScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
    ) {
        BaseDetailScreen(
            sectionTitle = "Button",
            exText = "Buttonは、Jetpack Composeで使用されるコンポーザブル関数の一つであり、クリック可能なボタンを作成" +
                    "するために使用されます。ユーザーがボタンをタップすると、指定したアクションやコールバックが実行されます。"
        )

        SectionName("コード")
        BaseText(
            "Button(\n" +
                    "    onClick: () -> Unit, // クリック時に実行されるアクションやコールバックを指定\n" +
                    "    modifier: Modifier = Modifier, // ボタンに適用する修飾子を指定（オプション）\n" +
                    "    enabled: Boolean = true, // ボタンが有効か無効かを指定（オプション）\n" +
                    "    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }, // ユーザーのインタラクションを追跡するためのInteractionSource（オプション）\n" +
                    "    elevation: ButtonElevation? = ButtonDefaults.elevation(), // ボタンのエレベーション（オプション）\n" +
                    "    shape: Shape = MaterialTheme.shapes.small, // ボタンの形状（オプション）\n" +
                    "    contentPadding: PaddingValues = ButtonDefaults.ContentPadding, // ボタンのコンテンツの余白（オプション）\n" +
                    "    content: @Composable RowScope.() -> Unit // ボタンの中に表示するコンテンツを指定\n" +
                    ")\n"
        )
        Spacer(modifier = Modifier.height(50.dp))
    }
}