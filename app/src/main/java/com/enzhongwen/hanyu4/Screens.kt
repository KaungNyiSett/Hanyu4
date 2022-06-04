package com.enzhongwen.hanyu4

sealed class Screens(val route: String) {
    object LessonsScreen: Screens(route = "lessons")
    object EachLessonScreen: Screens(route = "eachLesson")
    object AllVocabScreen: Screens(route = "allVocab")
    object FavoritesScreen: Screens(route = "favorites")
    object SplashScreen: Screens(route = "splash")
    object StrokeScreen: Screens(route = "stroke")

    fun withArgs(vararg args: Int): String{
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
