package com.enzhongwen.hanyu4

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.enzhongwen.hanyu4.ui.theme.CustomPurple
import com.enzhongwen.hanyu4.ui.theme.BlueLight

@Composable
fun LessonItems(
    lesson: Lessons,
    darkTheme: Boolean,
    itemOnClick: () -> Unit = {},
) {
    val textColor = if (darkTheme) {
        Color.White
    } else {
        Color.Black
    }

    val cardColor = if (darkTheme) {
        Color.DarkGray
    } else {
        Color.White
    }

    val buttonColor = if (darkTheme) {
        BlueLight
    } else {
        CustomPurple
    }

    Card(
        modifier = Modifier
            .padding(
                start = 15.dp,
                end = 15.dp,
                top = 12.dp
            )
            .fillMaxWidth(),
        backgroundColor = cardColor
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = stringResource(id = lesson.no),
                        color = textColor
                    )
                    Text(
                        text = lesson.heading,
                        color = textColor
                    )
                }
                Button(
                    onClick = {
                        itemOnClick()
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = buttonColor
                    )
                ) {
                    Text(
                        text = stringResource(id = R.string.learn),
                        color = Color.White
                    )
                }
            }
        }
    }
}

data class Lessons(
    @StringRes val no: Int,
    val heading: String,
    val id: Int
)

val hanyu4Lessons = listOf(
    Lessons(R.string.lesson1, "?????????????????????", 1),
    Lessons(R.string.lesson2, "???????????????", 2),
    Lessons(R.string.lesson3, "??????????????????", 3),
    Lessons(R.string.lesson4, "??????????????????", 4),
    Lessons(R.string.lesson5, "????????????", 5),
    Lessons(R.string.lesson6, "???????????????", 6),
    Lessons(R.string.lesson7, "??????????????????", 7),
    Lessons(R.string.lesson8, "?????????????????????", 8),
    Lessons(R.string.lesson9, "??????????????????????????????", 9),
    Lessons(R.string.lesson10, "?????????????????????", 10),
    Lessons(R.string.lesson11, "??????????????????", 11),
    Lessons(R.string.lesson12, "????????????????????????", 12),
    Lessons(R.string.lesson13, "??????????????????", 13),
    Lessons(R.string.lesson14, "?????????????????????", 14),
    Lessons(R.string.lesson15, "???????????????", 15),
)

@Preview
@Composable
fun PreviewLessonItems() {
    LessonItems(
        lesson = Lessons(R.string.lesson1, "????????????", 16),
        darkTheme = false,
    )
}
