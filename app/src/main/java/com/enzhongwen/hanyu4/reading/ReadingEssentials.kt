package com.enzhongwen.hanyu4.reading

import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.enzhongwen.hanyu4.R
import com.enzhongwen.hanyu4.ui.theme.BlueDark
import com.enzhongwen.hanyu4.ui.theme.BlueLight

@Composable
fun TextGp(
    sentence: String,
    pinyin: String,
    @StringRes definition: Int,
    onOff: Boolean,
    darkTheme: Boolean,
    modifier: Modifier = Modifier
) {
    val textColor = if (darkTheme) {
        Color.White
    } else {
        Color.Black
    }
    Column {
        AnimatedVisibility(onOff) {
            Text(
                text = pinyin,
                color = textColor,
                fontSize = 13.sp,
                modifier = modifier
            )
        }
        Text(
            text = sentence,
            color = textColor,
            fontSize = 18.sp,
            modifier = modifier
        )
        AnimatedVisibility(onOff) {
            Text(
                text = stringResource(id = definition),
                color = if (darkTheme) {
                    BlueLight
                } else {
                    BlueDark
                },
                fontSize = 15.sp,
                fontStyle = Italic,
                modifier = modifier
            )
        }
    }
}

@Composable
fun Space() {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                vertical = 10.dp
            )
    )
}

@Composable
fun Background(
    darkTheme: Boolean,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(
                10.dp
            )
            .background(
                color = if (darkTheme) {
                    Color.DarkGray
                } else {
                    Color.LightGray
                },
                shape = RoundedCornerShape(
                    10
                )
            )
            .padding(
                20.dp
            )
            .fillMaxWidth(),
        content = content,
        horizontalAlignment = horizontalAlignment
    )
}

@Preview(
    showBackground = true
)
@Composable
fun PreviewTextGp() {
    TextGp(
        sentence = "我爱你。",
        pinyin = "Wǒ ài nǐ.",
        definition = R.string.app_name,
        onOff = true,
        darkTheme = false
    )
}