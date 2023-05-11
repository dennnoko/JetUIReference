package com.example.jetuireference.DetailScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetuireference.components.BaseText

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


    }
}