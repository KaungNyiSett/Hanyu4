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
    Lessons(R.string.lesson1, "学校有多少学生", 1),
    Lessons(R.string.lesson2, "你从哪儿来", 2),
    Lessons(R.string.lesson3, "跟老师学中文", 3),
    Lessons(R.string.lesson4, "为什么不试试", 4),
    Lessons(R.string.lesson5, "笨鸟先飞", 5),
    Lessons(R.string.lesson6, "小鸟会唱歌", 6),
    Lessons(R.string.lesson7, "我们要去爬山", 7),
    Lessons(R.string.lesson8, "我可以看电视吗", 8),
    Lessons(R.string.lesson9, "小玲的家在唐人街附近", 9),
    Lessons(R.string.lesson10, "我们要爱护牙齿", 10),
    Lessons(R.string.lesson11, "小华去医院了", 11),
    Lessons(R.string.lesson12, "妈妈买了很多苹果", 12),
    Lessons(R.string.lesson13, "新年快要到了", 13),
    Lessons(R.string.lesson14, "他们正在睡觉呢", 14),
    Lessons(R.string.lesson15, "聪明的公鸡", 15),
)

@Preview
@Composable
fun PreviewLessonItems() {
    LessonItems(
        lesson = Lessons(R.string.lesson1, "你爱我吗", 16),
        darkTheme = false,
    )
}
