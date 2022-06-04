package com.enzhongwen.hanyu4


import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.enzhongwen.hanyu4.ui.theme.BlueLight
import com.enzhongwen.hanyu4.ui.theme.CustomPurple
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(
    scaffoldState: ScaffoldState,
    navController: NavController,
    darkTheme: Boolean,
    darkMode: () -> Unit,
    endActivity: () -> Unit,
) {

    val context = LocalContext.current

    var openDialog by rememberSaveable {
        mutableStateOf(false)
    }

    val scrollState = rememberScrollState()

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
            .verticalScroll(state = scrollState)
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(220.dp)
        )
        Divide(darkTheme = darkTheme)
        ButtonContent(
            scaffoldState = scaffoldState,
            text = R.string.vocabulary,
            icon = R.drawable.vocab,
            darkTheme = darkTheme,
            onClick = {
                navController.navigate(Screens.AllVocabScreen.route)
            }
        )
        Divide(darkTheme = darkTheme)
        ButtonContent(
            scaffoldState = scaffoldState,
            text = R.string.favorites,
            icon = R.drawable.heart,
            darkTheme = darkTheme,
            onClick = {
                navController.navigate(Screens.FavoritesScreen.route)
            }
        )
        Divide(darkTheme = darkTheme)
        ButtonContent(
            scaffoldState = scaffoldState,
            text = R.string.languages,
            icon = R.drawable.language,
            darkTheme = darkTheme,
            onClick = {
                openDialog = !openDialog
            }
        )
        Divide(darkTheme = darkTheme)
        ButtonContent(
            scaffoldState = scaffoldState,
            text = R.string.rate,
            icon = R.drawable.star,
            darkTheme = darkTheme,
            onClick = {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.enzhongwen.hanyu4")
                context.startActivity(intent)
            }
        )
        Divide(darkTheme = darkTheme)
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomEnd,
        ) {
            Button(
                onClick = {
                    darkMode()
                },
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier
                    .padding(20.dp)
                    .size(40.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (darkTheme) {
                        Color.DarkGray
                    } else {
                        Color.White
                    }
                ),
                contentPadding = PaddingValues(0.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.day_night),
                    contentDescription = null,
                    modifier = Modifier.size(
                        20.dp
                    ),
                    tint = if (darkTheme) {
                        BlueLight
                    } else {
                        CustomPurple
                    }
                )
            }
        }
    }
    if (openDialog) {
        LanguageDialog(
            darkTheme = darkTheme,
            confirm = {
                openDialog = !openDialog
                endActivity()
                context.startActivity(Intent(context, MainActivity::class.java))
            },
            cancel = {
                openDialog = !openDialog
            }
        )
    }
}

@Composable
fun ButtonContent(
    scaffoldState: ScaffoldState,
    @StringRes text: Int,
    @DrawableRes icon: Int,
    onClick: () -> Unit = {},
    darkTheme: Boolean
) {
    val scope = rememberCoroutineScope()
    TextButton(
        onClick = {
            scope.launch {
                scaffoldState.drawerState.close()
            }
            onClick()
        },
        modifier = Modifier
            .fillMaxWidth()
            .size(60.dp),
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier
                .size(
                    25.dp
                ),
            tint = if (darkTheme) {
                BlueLight
            } else {
                CustomPurple
            }
        )
        Text(
            text = stringResource(id = text),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = if (darkTheme) {
                BlueLight
            } else {
                CustomPurple
            }
        )
    }
}

@Composable
fun Divide(darkTheme: Boolean) {
    Divider(
        color = if (darkTheme) {
            Color.DarkGray
        } else {
            Color.LightGray
        }
    )
}

@Preview(
    showBackground = true
)
@Composable
fun PreviewDrawerContent() {
    val context = LocalContext.current
    val scaffoldState = rememberScaffoldState()
    val navController = NavController(context)
    DrawerContent(
        scaffoldState,
        navController,
        darkTheme = false,
        darkMode = {},
        endActivity = {},
    )
}

@Composable
fun LanguageDialog(
    darkTheme: Boolean,
    confirm: () -> Unit,
    cancel: () -> Unit
) {


    val configuration = LocalConfiguration.current

    val context = LocalContext.current

    val myPreference = MyPreference(context)

    var selectedLanguage by rememberSaveable {
        mutableStateOf("")
    }
    Dialog(onDismissRequest = {
        cancel()
    }) {
        Surface(
            color = if (darkTheme) {
                Color.DarkGray
            } else {
                Color.White
            },
            modifier = Modifier.fillMaxHeight(
                fraction = if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
                    0.7f
                } else {
                    0.95f
                }
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 15.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.language),
                        contentDescription = null,
                        modifier = Modifier.size(
                            50.dp
                        ),
                        tint = if (darkTheme) {
                            BlueLight
                        } else {
                            CustomPurple
                        }
                    )
                    Text(
                        text = stringResource(id = R.string.languages),
                        fontSize = 25.sp,
                        color = if (darkTheme) {
                            Color.White
                        } else {
                            Color.Black
                        }
                    )
                }
                val eng = stringResource(id = R.string.english)
                val myan = stringResource(id = R.string.myanmar)
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = selectedLanguage == eng,
                        onClick = {
                            selectedLanguage = eng
                        },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = if (darkTheme) {
                                CustomPurple
                            } else {
                                BlueLight
                            },
                            unselectedColor = if (darkTheme) {
                                Color.White
                            } else {
                                Color.Black
                            }
                        )

                    )
                    Text(
                        text = eng,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = if (darkTheme) {
                            Color.White
                        } else {
                            Color.Black
                        }
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = selectedLanguage == myan,
                        onClick = {
                            selectedLanguage = myan
                        },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = if (darkTheme) {
                                CustomPurple
                            } else {
                                BlueLight
                            },
                            unselectedColor = if (darkTheme) {
                                Color.White
                            } else {
                                Color.Black
                            }
                        )
                    )
                    Text(
                        text = myan,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = if (darkTheme) {
                            Color.White
                        } else {
                            Color.Black
                        }
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Button(
                        enabled = selectedLanguage != "",
                        onClick = {
                            confirm()
                            when (selectedLanguage) {
                                eng -> myPreference.setLoginCount("en")
                                myan -> myPreference.setLoginCount("my")
                            }
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = if (darkTheme) {
                                BlueLight
                            } else {
                                CustomPurple
                            }
                        )
                    ) {
                        Text(
                            text = stringResource(id = R.string.confirm),
                            color = Color.White
                        )
                    }
                    OutlinedButton(
                        onClick = {
                            cancel()
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Transparent
                        )
                    ) {
                        Text(
                            text = stringResource(id = R.string.cancel),
                            color = if (darkTheme) {
                                BlueLight
                            } else {
                                CustomPurple
                            }
                        )
                    }
                }
            }
        }
    }
}


