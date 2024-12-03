package com.lab.uasmap.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Blue = Color(0xFF3345AB)
val Cyan = Color(0xFF00BCD4)
val White = Color(0xFFFFFFFF)
val LightGray = Color(0x5EFFFFF2)
val Dark = Color(0xFF3D4058)


@Immutable
data class AppColors(
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRegularSurface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val highlightSurface: Color,
    val onHighlightSurface: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        background = Color.Unspecified,
        onBackground = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        regularSurface = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified
    )
}

val extendedColors = AppColors(
    background = White,
    onBackground = Dark,
    surface = White,
    onSurface = Dark,
    secondarySurface = LightGray,
    onSecondarySurface = Dark,
    regularSurface = White,
    onRegularSurface = Dark,
    actionSurface = Blue,
    onActionSurface = White,
    highlightSurface = Cyan,
    onHighlightSurface = White
)