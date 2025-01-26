package com.kazakago.blueprint

import androidx.compose.runtime.Composable
import com.kazakago.blueprint.ui.AppTheme
import com.kazakago.blueprint.ui.RootNavHost

@Composable
fun App() {
    AppTheme {
        RootNavHost()
    }
}
