package com.lab.uasmap.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val UnboundedFontFamily = FontFamily(
    Font(R.font.RobotoMono-Italic-VariableFont_wght, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.RobotoMono-Regular-VariableFont_wght, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.RobotoMono-VariableFont_wght, FontWeight.Light, FontStyle.Normal)
)

@Immutable
data class AppTypography(
    val headline: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val body: TextStyle,
    val bodySmall: TextStyle,
    val label: TextStyle
)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        headline = TextStyle.Default,
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleSmall = TextStyle.Default,
        body = TextStyle.Default,
        bodySmall = TextStyle.Default,
        label = TextStyle.Default
    )
}

val extendedTypography = AppTypography(
    headline = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    body = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    label = TextStyle(
        fontFamily = UnboundedFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 11.sp,
    )
)