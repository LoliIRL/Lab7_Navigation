package com.example.mycity

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

// Маршруты для навигации
sealed class Screen(val route: String) {
    object Categories : Screen("categories")
    object Places : Screen("places/{categoryIndex}") {
        fun createRoute(categoryIndex: Int) = "places/$categoryIndex"
    }
    object Details : Screen("details/{placeId}") {
        fun createRoute(placeId: Int) = "details/$placeId"
    }
}

@Composable
fun MyCityNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Categories.route) {
        composable(Screen.Categories.route) {
            CategoriesScreen(navController)
        }
        composable(Screen.Places.route) { backStackEntry ->
            val categoryIndex = backStackEntry.arguments?.getString("categoryIndex")?.toInt() ?: 0
            PlacesScreen(navController, categoryIndex)
        }
        composable(Screen.Details.route) { backStackEntry ->
            val placeId = backStackEntry.arguments?.getString("placeId")?.toInt() ?: 1
            DetailsScreen(navController, placeId)
        }
    }
}