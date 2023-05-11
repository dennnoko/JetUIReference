package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.ContentsList
import com.example.jetuireference.components.SectionName

@Composable
fun ModifierScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
    ) {
        BaseDetailScreen(
            sectionTitle = "modifier",
            exText = "modifierは、Jetpack ComposeでUI要素に対して適用される修飾子（Modifier）の集合です。" +
                    "Modifierは、UI要素の見た目や動作を変更するために使用されます。\n" +
                    "Modifierは、UI要素に対してさまざまな操作を行うことができます。例えば、サイズの変更、位置の調整、" +
                    "余白の追加、クリッピング、背景色の設定などが可能です。"
        )

        SectionName("Column,Rowのスクロール")
        BaseText(
            "//縦方向のスクロールを実装する\nverticalScroll(rememberScrollState())" +
                    "//縦方向のスクロールを実装する\nhorizontalScroll(rememberScrollState())"
        )

        SectionName("TextやButtonの例")
        BaseText(
            "Text(\n" +
                    "    text = \"Hello, Compose!\",\n" +
                    "    modifier = Modifier\n" +
                    "        .padding(16.dp) // テキストの周囲に16dpの余白を追加\n" +
                    "        .background(Color.Yellow) // テキストの背景色を黄色に設定\n" +
                    "        .fillMaxWidth() // テキストを親コンポーネントの幅いっぱいに広げる\n" +
                    "        .align(Alignment.Center) // テキストを中央に配置する\n" +
                    "        .clickable { /* クリック時の処理 */ } // テキストにクリック可能な振る舞いを追加\n" +
                    ")\n"
        )
        Spacer(modifier = Modifier.height(50.dp))
    }
}