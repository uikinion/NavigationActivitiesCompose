package com.example.navigationactivitiescompose.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.navigationactivitiescompose.ui.theme.screens.ScreenA
import com.example.navigationactivitiescompose.ui.theme.screens.ScreenB
import com.example.navigationactivitiescompose.ui.theme.screens.ScreenC

object Routes {
    const val A = "A"
    const val B = "B"
    const val C = "C"
}

@Composable
fun AppNavGraph(navController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = Routes.A
    ) {

        composable(Routes.A) {
            Log.d("NAV", "Opened screen A")
            ScreenA(onNext = {
                Log.d("NAV", "A → B")
                navController.navigate(Routes.B) })
        }

        composable(Routes.B) {
            Log.d("NAV", "Opened screen B")
            ScreenB(onNext = {
                Log.d("NAV", "B → C")
                navController.navigate(Routes.C) })
        }

        composable(Routes.C) {
            Log.d("NAV", "Opened screen C")
            ScreenC(onNext = {
                Log.d("NAV", "C → A")
                navController.navigate(Routes.A) {
                    popUpTo(0)
                }
            })
        }
    }
}