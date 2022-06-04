package com.enzhongwen.hanyu4

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.enzhongwen.hanyu4.ui.theme.BlueLight
import com.enzhongwen.hanyu4.ui.theme.CustomPurple
import kotlinx.coroutines.launch

@Composable
fun Lessons(
    darkTheme: Boolean,
    darkMode: () -> Unit = {},
    navController: NavController,
    endActivity: () -> Unit,
) {

    val backgroundColor = if (darkTheme) {
        Color.Black
    } else {
        Color.White
    }
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            DrawerContent(
                scaffoldState = scaffoldState,
                navController = navController,
                darkTheme = darkTheme,
                darkMode = darkMode,
                endActivity = endActivity,
            )
        },
        topBar = {
            AppBarTop(
                title = "Hanyu 4",
                navIcon = Icons.Default.Menu,
                navClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                },
                action1Icon = R.drawable.day_night,
                action1Click = {
                    darkMode()
                },
                darkTheme = darkTheme,
            )
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = backgroundColor
                )
        ) {
            BannerAd()

            LazyColumn(
                modifier = Modifier
                    .background(
                        color = backgroundColor
                    )
                    .fillMaxWidth()
            ) {
                items(items = hanyu4Lessons) {
                    LessonItems(
                        lesson = it,
                        darkTheme = darkTheme,
                        itemOnClick = {
                            navController.navigate(Screens.EachLessonScreen.withArgs(it.id))
                        },
                    )
                }
                item {
                    ToAnotherApp(darkTheme = darkTheme)
                }
            }
        }
    }
}


@Composable
fun ToAnotherApp(
    darkTheme: Boolean
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        ,
        backgroundColor = if(darkTheme){
            Color.DarkGray
        }else{
            Color.White
        },
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(
            width = 1.dp,
            brush = Brush.horizontalGradient(
                colors = listOf(
                    CustomPurple, Color.Red
                )
            )
        ),
        elevation = 0.dp
    ) {

        val context = LocalContext.current

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(15.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.hanyu5),
                contentDescription = null,
                modifier = Modifier
                    .size(
                        55.dp
                    )
                    .clip(
                        shape = RoundedCornerShape(12.dp)
                    )
            )
            Text(
                text = "Hanyu 5",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = if(darkTheme){
                    BlueLight
                }else{
                    CustomPurple
                }
            )
            Button(
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.enzhongwen.hanyu5")
                    context.startActivity(intent)
                },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent
                ),
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier.size(
                    height = 40.dp,
                    width = 130.dp
                )
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    CustomPurple, Color.Red
                                )
                            )
                        )
                        .padding(
                            horizontal = 16.dp,
                            vertical = 8.dp
                        )
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Download",
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewToAnotherAppLight() {
    ToAnotherApp(false)
}

@Preview
@Composable
fun PreviewToAnotherAppDark() {
    ToAnotherApp(true)
}

