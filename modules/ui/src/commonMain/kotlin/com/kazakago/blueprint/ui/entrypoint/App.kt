package com.kazakago.blueprint.ui.entrypoint

import androidx.compose.runtime.Composable
import com.kazakago.blueprint.ui.theme.AppTheme

@Composable
fun App() {
    AppTheme {
        RootNavHost()
    }
}
