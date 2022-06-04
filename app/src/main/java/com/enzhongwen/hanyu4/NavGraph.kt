package com.enzhongwen.hanyu4

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun NavGraph(
    navController: NavHostController,
    endActivity: () -> Unit,
    darkTheme: Boolean,
    darkMode: () -> Unit,
    onBack: () -> Unit = {}
) {
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route
    ) {
        composable(
            route = Screens.SplashScreen.route
        ) {
            SplashScreen(
                navController = navController
            )
            BackHandler {
                endActivity()
            }
        }
        composable(
            route = Screens.LessonsScreen.route,
        ) {
            BackHandler {
                endActivity()
            }
            Lessons(
                darkTheme = darkTheme,
                navController = navController,
                darkMode = darkMode,
                endActivity = endActivity,
            )
        }
        composable(
            route = Screens.EachLessonScreen.route + "/{lesson}",
            arguments = listOf(
                navArgument("lesson") {
                    type = androidx.navigation.NavType.IntType
                }
            )
        ) {
            EachLessonScreen(
                darkTheme = darkTheme,
                lesson = it.arguments!!.getInt("lesson"),
                navController = navController,
                onBack = onBack,
            )
            BackHandler {
                onBack()
                navController.navigateUp()
            }
        }
        composable(
            route = Screens.AllVocabScreen.route
        ) {
            AllVocab(
                darkTheme = darkTheme,
                navController = navController,
                darkMode = darkMode,
                endActivity = endActivity
            )
        }
        composable(
            route = Screens.FavoritesScreen.route
        ) {
            BackHandler {
                onBack()
                navController.navigateUp()
            }
            Favorites(
                darkTheme = darkTheme,
                navController = navController,
                modifier = Modifier,
                darkMode = darkMode,
                endActivity = endActivity,
                onBack = onBack
            )
        }
        composable(
            route = Screens.StrokeScreen.route + "/{id1}",
            arguments = listOf(
                navArgument("id1") {
                    type = androidx.navigation.NavType.IntType
                }
            )
        ) {
            StrokeScreen(
                id1 = it.arguments!!.getInt("id1"),
                darkTheme = darkTheme,
                navController = navController,
                darkMode = darkMode,
                endActivity = endActivity
            )
        }
    }
}
