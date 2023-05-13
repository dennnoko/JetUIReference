package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetuireference.components.BaseText
import com.example.jetuireference.components.SectionName

@Composable
fun ScreenTransitionScreen() {
    Column(
        modifier = Modifier
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {
        BaseDetailScreen(
            sectionTitle = "Screen transition",
            exText = "navigation composeによる画面遷移"
        )

        SectionName("navigation composeとは")
        BaseText(
            "Navigation Composeは、Jetpack Compose向けの画面遷移ライブラリです。Androidアプリケーショ" +
                    "ンの画面間のナビゲーションを簡単かつ効果的に管理するためのツールセットです。"
        )

        SectionName("実装手順")
        BaseText(
            "navigation-composeライブラリをアプリの依存関係に追加します。\n" +
                    "\n" +
                    "NavHostを定義するためのルートコンポーネントを作成します。これは、画面遷移の起点となるコンポーネントです。\n" +
                    "\n" +
                    "各画面を@Composable関数として実装し、NavHost内で使用するために定義します。\n" +
                    "\n" +
                    "NavGraphを作成し、画面遷移の定義やナビゲーションのルールを追加します。NavGraphは、NavHost内で使用されます。\n" +
                    "\n" +
                    "画面遷移を行うためのアクションや条件付き遷移などを設定します。これには、NavGraph内で適切な要素を使用します。\n" +
                    "\n" +
                    "画面遷移を実行するために、必要なコンポーネントやアクションを使用します。通常、ボタンやリストアイテムなどのクリックイベントと組み合わせて使用します。"
        )
        
        Spacer(modifier = Modifier.height(50.dp))
    }
}