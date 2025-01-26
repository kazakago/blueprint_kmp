package com.kazakago.blueprint.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun RootNavHost(
    modifier: Modifier = Modifier,
) {
    NavHost(
        modifier = modifier,
        navController = rememberNavController(),
        startDestination = MainRoute,
    ) {
        composable<MainRoute> {
            MainScreen()
        }
    }
}
