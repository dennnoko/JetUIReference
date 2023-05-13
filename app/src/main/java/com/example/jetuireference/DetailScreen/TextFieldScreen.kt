package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun TextFieldScreen() {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        BaseDetailScreen(
            sectionTitle = "TextFieldScreen",
            exText = "TextFieldは、ユーザーがテキストを入力するためのコンポーザブル関数です。ユーザーからの入力を受け付" +
                    "けるためのテキストフィールドを作成する際に使用されます。"
        )

        SectionName("例")

        var text by remember { mutableStateOf("") }
        TextField(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(5.dp),
            value = text,
            onValueChange = { newText -> text = newText },
            label = { Text("Enter text") }
        )

        SectionName("コード")
        BaseText(
            "@Composable\n" +
                    "fun MyComposable() {\n" +
                    "    var text by remember { mutableStateOf(\"\") } // 状態変数textを定義し、初期値を空の文字列に設定\n" +
                    "\n" +
                    "    TextField(\n" +
                    "        value = text, // テキストフィールドの値に状態変数textをバインド\n" +
                    "        onValueChange = { newText -> text = newText }, // テキストが変更された時に呼ばれるコールバック関数で、入力された新しいテキストを状態変数textに代入\n" +
                    "        label = { Text(\"Enter text\") } // テキストフィールドのラベルとして表示されるテキストコンポーネント\n" +
                    "    )\n" +
                    "\n" +
                    "    Text(text = \"Entered text: $text\") // 入力されたテキストを表示するテキストコンポーネント\n" +
                    "}\n"
        )
        Spacer(modifier = Modifier.height(50.dp))
    }
}