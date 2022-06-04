package com.enzhongwen.hanyu4

import android.media.MediaPlayer
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.enzhongwen.hanyu4.db.SavedDatabase
import com.enzhongwen.hanyu4.db.SavedRepository
import com.enzhongwen.hanyu4.db.VocabData
import com.enzhongwen.hanyu4.ui.theme.BlueDark
import com.enzhongwen.hanyu4.ui.theme.BlueLight
import com.enzhongwen.hanyu4.ui.theme.CustomPurple
import kotlinx.coroutines.launch

@Composable
fun VocabItems(
    modifier: Modifier = Modifier,
    saved: VocabData,
    darkTheme: Boolean,
    navController: NavController,
    onOff: Boolean,
    favourite: Boolean,
    saveOnClick: () -> Unit = {},
) {

    var shit by rememberSaveable {
        mutableStateOf(
            favourite
        )
    }

    val context = LocalContext.current

    val scope = rememberCoroutineScope()

    val cardColor = if (darkTheme) {
        Color.DarkGray
    } else {
        Color.White
    }
    val textColor = if (darkTheme) {
        Color.White
    } else {
        Color.Black
    }
    val iconColor = if (darkTheme) {
        Color.White
    } else {
        CustomPurple
    }
    val favouriteColor = if (shit) {
        Color.Red
    } else {
        iconColor
    }
    Card(
        modifier = modifier
            .padding(
                start = 15.dp,
                end = 15.dp,
                top = 12.dp
            )
            .fillMaxWidth()
            .clickable {
                navController.navigate(Screens.StrokeScreen.withArgs(saved.id1))
            },

        backgroundColor = cardColor
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 10.dp,
                    end = 10.dp,
                    top = 10.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    AnimatedVisibility(onOff) {
                        Text(
                            text = saved.pinyin,
                            color = textColor,
                            fontSize = 13.sp
                        )
                    }
                    Text(
                        text = saved.word,
                        color = textColor,
                        fontSize = 22.sp
                    )
                    AnimatedVisibility(onOff) {
                        Text(
                            text = stringResource(id = saved.definition),
                            color = if (darkTheme) {
                                BlueLight
                            } else {
                                BlueDark
                            },
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Italic,
                        )
                    }
                }
                IconButton(
                    onClick = {
                        val s = MediaPlayer.create(context, saved.sound)
                        s.start()
                        s.setOnCompletionListener {
                            s.release()
                        }
                    }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.sound),
                        contentDescription = null,
                        tint = iconColor,
                        modifier = Modifier.size(
                            25.dp
                        )
                    )
                }
            }
            Divider(
                thickness = 2.dp,
                modifier = Modifier.padding(
                    top = 5.dp
                ),
            )
            IconButton(
                onClick = {
                    saveOnClick()
                    if (!shit) {
                        scope.launch {
                            SavedRepository(
                                SavedDatabase.getDatabase(context).savedDao()
                            ).save(saved)
                        }
                        Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show()


                    } else {
                        scope.launch {
                            SavedRepository(
                                SavedDatabase.getDatabase(context).savedDao()
                            ).deleteItem(saved)
                        }
                        Toast.makeText(context, "Unsaved", Toast.LENGTH_SHORT).show()
                    }
                    shit = !shit
                }

            ) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    tint = favouriteColor,
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewVocabItems() {
    val context = LocalContext.current
    VocabItems(
        saved = VocabData("我爱你", "wǒ ài nǐ", R.string.app_name, 22),
        darkTheme = true,
        navController = NavController(context),
        onOff = true,
        favourite = false
    )
}