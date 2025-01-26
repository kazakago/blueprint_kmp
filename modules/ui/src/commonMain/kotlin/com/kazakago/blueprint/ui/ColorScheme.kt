package com.kazakago.blueprint.ui

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

val DarkColorScheme = darkColorScheme(
    primary = Blue200,
    secondary = Orange300,
)

val LightColorScheme = lightColorScheme(
    primary = Blue500,
    secondary = Orange300,
)

@Composable
expect fun getColorScheme(darkTheme: Boolean): ColorScheme
