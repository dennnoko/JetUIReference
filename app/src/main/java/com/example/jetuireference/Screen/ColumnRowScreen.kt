package com.example.jetuireference.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetuireference.components.ContentsList

@Composable
fun ColumnRowScreen(navController: NavController) {
    Column(modifier = Modifier.padding(5.dp)) {
        ContentsList(
            navController = navController,
            conTitle = "Column",
            conDes = "コンテンツを縦に並べる",
            toDes = "column",
            overview = "Columnコンポーネントは、子要素を上から下に並べます。子要素のサイズが画面幅を超える場合、自動" +
                    "的に次の行に移動します。子要素の配置は、modifierパラメータを使用して変更することができます。"
        )

        ContentsList(
            navController = navController,
            conTitle = "Row",
            conDes = "コンテンツを横に並べる",
            toDes = "row",
            overview = "Rowコンポーネントは、子要素を左から右に並べます。子要素のサイズが画面幅を超える場合、自動的に" +
                    "次の列に移動します。子要素の配置は、modifierパラメータを使用して変更することができます。"
        )

        ContentsList(
            navController = navController,
            conTitle = "Box",
            conDes = "コンテンツを重ねる",
            toDes = "box",
            overview = "Boxは、縦方向や横方向のレイアウト、ビューの重ね合わせ、グリッドレイアウトなど、様々なUI設計に" +
                    "使用されます。Boxは、コンテナー要素のため、複数の子要素を持つことができ、重ね順を制御するためのzI" +
                    "ndex修飾子も提供されています。"
        )
    }
}