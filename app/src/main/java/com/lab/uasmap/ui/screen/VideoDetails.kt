package com.lab.uasmap.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lab.uasmap.ui.screen.components.VideoDetailsSection

@Composable
fun VideoDetailsScreen(
    modifier: Modifier = Modifier
){
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier.verticalScroll(scrollableState)
    ){
        VideoDetailsSection()
    }
}