package com.lab.uasmap.ui.screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.lab.uasmap.R
import com.lab.uasmap.ui.theme.UASMAPTheme

@Composable
fun VideoDetailsSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ActionBar(
            headline = "Video Details",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
private fun VideoBackground(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(240.dp)
            .background(
                color =
            )
    )
}

@Composable
private fun ActionBar(
    modifier: Modifier = Modifier,
    headline: String
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = headline,
            style = UASMAPTheme.typography.headline,
            color = UASMAPTheme.colors.onSecondarySurface
        )
        CloseButton(
            modifier = Modifier.size(40.dp)
        )
    }
}

@Composable
private fun CloseButton(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.size(44.dp),
        shape = RoundedCornerShape(16.dp),
        color = UASMAPTheme.colors.actionSurface,
        contentColor = UASMAPTheme.colors.onActionSurface
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}
