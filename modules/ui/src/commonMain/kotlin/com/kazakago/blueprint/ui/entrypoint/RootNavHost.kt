package com.kazakago.blueprint.ui.entrypoint

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kazakago.blueprint.ui.main.MainRoute
import com.kazakago.blueprint.ui.main.MainScreen
import kotlin.Any

@Composable
fun RootNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: Any = MainRoute,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        composable<MainRoute> {
            MainScreen()
        }
    }
}
