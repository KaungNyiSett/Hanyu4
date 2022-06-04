package com.enzhongwen.hanyu4

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController = NavController(LocalContext.current),
    darkTheme: Boolean = isSystemInDarkTheme()
) {
    val configuration = LocalConfiguration.current

    if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Content(
                darkTheme = darkTheme,
                modifier1 = Modifier.weight(2f),
                modifier2 = Modifier.weight(1.5f)
            )
        }
    } else {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Content(
                darkTheme = darkTheme,
                modifier1 = Modifier.weight(2f),
                modifier2 = Modifier.weight(1.5f)
            )
        }
    }

    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate(Screens.LessonsScreen.route)
    }
}

@Composable
fun Content(
    darkTheme: Boolean,
    modifier1: Modifier,
    modifier2: Modifier
) {
    val bgColor = if (darkTheme) {
        Color.Black
    } else {
        Color.White
    }

    BoxLayout(
        modifier = modifier1,
        bgColor = bgColor
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash),
            contentDescription = null,
            modifier = Modifier.size(
                280.dp
            )
        )
    }
    BoxLayout(
        modifier = modifier2,
        bgColor = bgColor
    ) {
        LoadingCircles()
    }
}

@Composable
fun BoxLayout(
    modifier: Modifier,
    bgColor: Color,
    content: @Composable (BoxScope.() -> Unit)
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                color = bgColor
            ),
        contentAlignment = Alignment.Center,
        content = content
    )
}

@Preview
@Composable
fun PreviewSplashScreenLight() {
    SplashScreen(darkTheme = false)
}

@Preview
@Composable
fun PreviewSplashScreenDark() {
    SplashScreen(darkTheme = true)
}