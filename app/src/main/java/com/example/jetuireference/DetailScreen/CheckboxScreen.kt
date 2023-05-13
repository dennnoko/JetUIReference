package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun CheckboxScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
    ) {
        BaseDetailScreen(
            sectionTitle = "Checkbox",
            exText = "Checkbox（チェックボックス）は、ユーザーがオンまたはオフの状態を選択できるUI要素です。一般的" +
                    "には、チェックボックスは小さな四角形のボックスで表示され、ユーザーがチェックを入れたり外したりす" +
                    "ることで状態を切り替えることができます。"
        )

        SectionName("例")
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            var isChecked by remember { mutableStateOf(false) }
            Checkbox(
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )

            Column() {
                Spacer(modifier = Modifier.height(15.dp))
                
                if (isChecked) {
                    Text("Checkbox is checked")
                } else {
                    Text("Checkbox is not checked")
                }    
            }
        }

        SectionName("コード")
        BaseText("Column {\n" +
                "        Checkbox(\n" +
                "            // Checkboxの状態をバインド\n" +
                "            checked = isChecked,\n" +
                "            // 状態変更時のコールバック関数を指定\n" +
                "            onCheckedChange = { isChecked = it }\n" +
                "        )\n" +
                "\n" +
                "        // 状態に応じてテキストを表示\n" +
                "        if (isChecked) {\n" +
                "            Text(\"Checkbox is checked\")\n" +
                "        } else {\n" +
                "            Text(\"Checkbox is not checked\")\n" +
                "        }\n" +
                "    }")
    }
}