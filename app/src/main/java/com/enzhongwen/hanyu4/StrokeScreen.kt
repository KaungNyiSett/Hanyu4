package com.enzhongwen.hanyu4

import android.media.MediaPlayer
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.enzhongwen.hanyu4.data.b4all
import com.enzhongwen.hanyu4.db.VocabData
import com.enzhongwen.hanyu4.ui.theme.BlueDark
import com.enzhongwen.hanyu4.ui.theme.BlueLight
import com.enzhongwen.hanyu4.ui.theme.CustomPurple

@Composable
fun StrokeScreen(
    id1: Int,
    darkTheme: Boolean,
    navController: NavController,
    darkMode: () -> Unit,
    endActivity: () -> Unit
) {

    val scaffoldState = rememberScaffoldState()

    val scrollState = rememberScrollState()
    Scaffold(
        topBar = {
            AppBarTop(
                title = "Stroke",
                darkTheme = darkTheme,
                navIcon = Icons.Default.ArrowBack,
                navClick = {
                    navController.navigateUp()
                },
            )
        },
        drawerContent = {
            DrawerContent(
                scaffoldState = scaffoldState,
                navController = navController,
                darkTheme = darkTheme,
                darkMode = darkMode,
                endActivity = endActivity
            )
        }
    ) {
        StrokeContent(
            id1 = id1,
            darkTheme = darkTheme,
            scrollState = scrollState
        )
    }
}

@Composable
fun StrokeContent(
    id1: Int,
    darkTheme: Boolean,
    scrollState: ScrollState
) {
    val context = LocalContext.current

    val vocabData: VocabData = b4all[id1 - 499]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = if (darkTheme) {
                    Color.Black
                } else {
                    Color.White
                }
            )
    ) {
        BannerAd(
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(
            modifier = Modifier.padding(
                5.dp
            )
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    15.dp
                )
                .verticalScroll(
                    state = scrollState
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = vocabData.word,
                        fontSize = 34.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (darkTheme) {
                            Color.White
                        } else {
                            Color.Black
                        }
                    )
                    Text(
                        text = vocabData.pinyin,
                        fontSize = 17.sp,
                        color = if (darkTheme) {
                            Color.White
                        } else {
                            Color.Black
                        }
                    )
                    Text(
                        text = stringResource(id = vocabData.definition),
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        color = if (darkTheme) {
                            BlueLight
                        } else {
                            BlueDark
                        },
                        modifier = Modifier.padding(
                            top = 5.dp
                        )
                    )
                }
                IconButton(
                    onClick = {
                        val a = MediaPlayer.create(context, vocabData.sound)
                        a.start()
                        a.setOnCompletionListener {
                            a.release()
                        }
                    },
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.sound),
                        contentDescription = "Sound",
                        modifier = Modifier.size(
                            25.dp
                        ),
                        tint = if (darkTheme) {
                            BlueLight
                        } else {
                            CustomPurple
                        }
                    )
                }
            }
            Spacer(
                modifier = Modifier.padding(10.dp)
            )
            if (vocabData.stroke1 != null) {
                GifImage(imageID = vocabData.stroke1)
            }
            Spacer(
                modifier = Modifier.padding(10.dp)
            )
            if (vocabData.stroke2 != null) {
                GifImage(imageID = vocabData.stroke2)
            }
            Spacer(
                modifier = Modifier.padding(10.dp)
            )
            if (vocabData.stroke3 != null) {
                GifImage(imageID = vocabData.stroke3)
            }
            Spacer(
                modifier = Modifier.padding(10.dp)
            )
            if (vocabData.stroke4 != null) {
                GifImage(imageID = vocabData.stroke4)
            }
        }
    }
}