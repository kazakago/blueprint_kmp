package com.kazakago.blueprint

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "blueprint_kmp",
    ) {
        App()
    }
}