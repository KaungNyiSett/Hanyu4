package com.enzhongwen.hanyu4.reading.book4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.enzhongwen.hanyu4.R
import com.enzhongwen.hanyu4.reading.Background
import com.enzhongwen.hanyu4.reading.Space
import com.enzhongwen.hanyu4.reading.TextGp

@Composable
fun B4L10(
    onOff: Boolean,
    darkTheme: Boolean,
    modifier: Modifier,
){
    val textColor = if (darkTheme) {
        Color.White
    } else {
        Color.Black
    }
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(
                state = scrollState
            )
            .background(
                color = if (darkTheme) {
                    Color.Black
                } else {
                    Color.White
                }
            ),
    ) {
        Text(
            text = "我们要爱护牙齿",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "睡觉以前小明想吃一块糖。他问妈妈:“我可以吃糖吗?”妈妈说: “不行,这个习惯不好。睡觉以前吃东西,牙齿会长小虫子的。”",
                    pinyin = "Shuìjiào yǐqián xiǎomíng xiǎng chī yīkuài táng. Tā wèn māmā:“Wǒ kěyǐ chī táng ma?” Māmā shuō: “Bùxíng, zhège xíguàn bù hǎo. Shuìjiào yǐqián chī dōngxī, yáchǐ huì zhǎng xiǎo chóngzi de.”",
                    definition = R.string.b4l10s1,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "小明问: “疼吗?”妈妈点点头说:“疼,当然疼。”小明说:“好吧,我不吃了。”",
                    pinyin = "Xiǎomíng wèn: “Téng ma?” Māmā diǎndiǎn tóu shuō:“Téng, dāngrán téng.” Xiǎomíng shuō:“Hǎo ba, wǒ bù chīle.”",
                    definition = R.string.b4l10s2,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      睡觉以前小明想吃一块糖。他问妈妈:“我可以吃糖吗?”妈妈说: “不行,这个习惯不好。睡觉以前吃东西,牙齿会长小虫子的。”小明问: “疼吗?”妈妈点点头说:“疼,当然疼。”小明说:“好吧,我不吃了。”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
        Background(darkTheme = darkTheme){
            TextGp(
                sentence = "小华:妈妈,我可以上网吗?我想玩游戏。 ",
                pinyin = "Xiǎo huá: Māmā, wǒ kěyǐ shàngwǎng ma? Wǒ xiǎng wán yóuxì.",
                definition = R.string.b4l10s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妈妈:现在不能上网,已经九点了,睡觉吧。 ",
                pinyin = "Māmā: Xiànzài bùnéng shàngwǎng, yǐjīng jiǔ diǎnle, shuìjiào ba.",
                definition = R.string.b4l10s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华:好吧,我去睡觉了。 ",
                pinyin = "Xiǎo huá: Hǎo ba, wǒ qù shuìjiàole.",
                definition = R.string.b4l10s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妈妈:别忘记刷完牙再睡觉。",
                pinyin = "Māmā: Bié wàngjì shuā wán yá zài shuìjiào.",
                definition = R.string.b4l10s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华:好的,妈妈。晚安! ",
                pinyin = "Xiǎo huá: Hǎo de, māmā. Wǎn'ān!",
                definition = R.string.b4l10s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妈妈:晚安!",
                pinyin = "Māmā: Wǎn'ān!",
                definition = R.string.b4l10s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
    }
}

@Preview
@Composable
fun PreviewB4L10(){
    B4L10(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}