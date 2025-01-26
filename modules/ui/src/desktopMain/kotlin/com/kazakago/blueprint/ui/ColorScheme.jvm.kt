package com.kazakago.blueprint.ui

import androidx.compose.runtime.Composable

@Composable
actual fun getColorScheme(darkTheme: Boolean) = if (darkTheme) DarkColorScheme else LightColorScheme
