package com.kazakago.blueprint.ui.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import blueprint_kmp.modules.ui.generated.resources.Res
import blueprint_kmp.modules.ui.generated.resources.compose_multiplatform
import com.kazakago.blueprint.infra.getPlatform
import com.kazakago.blueprint.model.Greeting
import com.kazakago.blueprint.ui.theme.AppTheme
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Serializable
data object MainRoute

@Composable
fun MainScreen() {
    var showContent by remember { mutableStateOf(false) }
    Scaffold { paddngValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddngValues),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting(getPlatform().name).greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    AppTheme {
        MainScreen()
    }
}
