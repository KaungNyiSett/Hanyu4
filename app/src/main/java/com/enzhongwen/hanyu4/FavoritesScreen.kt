package com.enzhongwen.hanyu4

import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.enzhongwen.hanyu4.db.SavedDatabase
import com.enzhongwen.hanyu4.db.SavedRepository
import com.enzhongwen.hanyu4.db.VocabData
import com.enzhongwen.hanyu4.ui.theme.CustomPurple
import com.enzhongwen.hanyu4.ui.theme.BlueLight
import kotlinx.coroutines.launch

@Composable
fun Favorites(
    darkTheme: Boolean,
    navController: NavController,
    modifier: Modifier = Modifier,
    darkMode:() -> Unit,
    endActivity: () -> Unit,
    onBack:() -> Unit
) {

    var list = FAV_LIST

    val deletedData = remember {
        mutableStateListOf<VocabData>()
    }

    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    var openDialog by rememberSaveable {
        mutableStateOf(false)
    }

    var onOff by rememberSaveable {
        mutableStateOf(
            true
        )
    }
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBarTop(
                title = "Favorites",
                navIcon = Icons.Default.ArrowBack,
                navClick = {
                    onBack()
                    navController.navigateUp()
                },
                action1Icon = R.drawable.studymode,
                action1Click = {
                    onOff = !onOff
                },
                darkTheme = darkTheme,
                action2Icon = R.drawable.delete,
                action2Click = {
                    openDialog = !openDialog
                }
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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.background(
                color = if (darkTheme) {
                    Color.Black
                } else {
                    Color.White
                }
            )
        ) {

            BannerAd()

            LazyColumn(
                modifier = modifier
                    .background(
                        color = if (darkTheme) {
                            Color.Black
                        } else {
                            Color.White
                        }
                    )
                    .fillMaxSize()
            ) {
                items(
                    items = list,
                    key = {
                        it.id1
                    }
                ) {
                    Log.d("SHIT","ListComposed")
                    AnimatedVisibility(
                        visible = !deletedData.contains(it),
                        enter = expandVertically(),
                        exit = shrinkVertically(
                            animationSpec = tween(
                                durationMillis = 1000
                            )
                        )
                    ) {
                        val animatedProgress = remember {
                            Animatable(
                                initialValue = 0.8f
                            )
                        }

                        LaunchedEffect(Unit) {
                            animatedProgress.animateTo(
                                targetValue = 1f,
                                animationSpec = tween(
                                    durationMillis = 300,
                                    easing = LinearEasing
                                )
                            )
                        }

                        VocabItems(
                            saved = it,
                            darkTheme = darkTheme,
                            navController = navController,
                            onOff = onOff,
                            favourite = list.contains(it),
                            saveOnClick = {
                                deletedData.add(it)
                            },
                            modifier = Modifier.graphicsLayer(
                                scaleX = animatedProgress.value,
                                scaleY = animatedProgress.value
                            )
                        )
                    }

                }
            }
            if (openDialog) {
                DeleteDialog(
                    plusOnClick = {
                        scope.launch {
                            SavedRepository(
                                SavedDatabase.getDatabase(context).savedDao()
                            ).deleteAll()
                        }
                        openDialog = !openDialog
                        list = mutableStateListOf()
                    },
                    minusOnClick = {
                        openDialog = !openDialog
                    },
                    darkTheme = darkTheme
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewFavorites() {
    Favorites(
        darkTheme = false,
        navController = NavController(LocalContext.current),
        darkMode = {},
        endActivity = {},
        onBack = {}
    )
}

@Composable
fun DeleteDialog(
    plusOnClick: () -> Unit = {},
    minusOnClick: () -> Unit = {},
    darkTheme: Boolean,
) {

    AlertDialog(
        onDismissRequest = {

        },
        confirmButton = {
            Button(
                onClick = {
                    plusOnClick()
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (darkTheme) {
                        BlueLight
                    } else {
                        CustomPurple
                    }
                )
            ) {
                Text(
                    text = stringResource(id = R.string.delete),
                    color = Color.White
                )
            }
        },
        dismissButton = {
            OutlinedButton(
                onClick = {
                    minusOnClick()
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent,
                ),
                border = BorderStroke(1.dp,if(darkTheme) Color.DarkGray else Color.LightGray)
            ) {
                Text(
                    text = stringResource(id = R.string.cancel),
                    color = if(darkTheme) Color.White else Color.Black
                )
            }
        },
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = null,
                    tint = Color.Red,
                )
                Text(
                    text = stringResource(id = R.string.DAheading),
                    modifier = Modifier.padding(
                        start = 10.dp
                    ),
                    color = if (darkTheme) {
                        Color.White
                    } else {
                        Color.Black
                    }
                )
            }
        },
        text = {
            Text(
                text = stringResource(id = R.string.DAtext),
                color = if (darkTheme) {
                    Color.White
                } else {
                    Color.Black
                }
            )
        },
        backgroundColor = if (darkTheme) {
            Color.DarkGray
        } else {
            Color.White
        }
    )
}
