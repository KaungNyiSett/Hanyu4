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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.enzhongwen.hanyu4.R
import com.enzhongwen.hanyu4.reading.Background
import com.enzhongwen.hanyu4.reading.Space
import com.enzhongwen.hanyu4.reading.TextGp

@Composable
fun B4L2(
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
            text = stringResource(id = R.string.sentences),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            TextGp(
                sentence = "奶奶从哪儿来？",
                pinyin = "Nǎinai cóng nǎ'er lái?",
                definition = R.string.b4l2s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "奶奶从老家来。",
                pinyin = "Nǎinai cóng lǎojiā lái.",
                definition = R.string.b4l2s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "小红从六岁开始学习弹钢琴。",
                pinyin = "Xiǎo hóng cóng liù suì kāishǐ xuéxí dàn gāngqín. ",
                definition = R.string.b4l2s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "学校从十号开始放假。",
                pinyin = "Xuéxiào cóng shí hào kāishǐ fàngjià. ",
                definition = R.string.b4l2s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "期末考试，他在我们班是第一名。",
                pinyin = "Qímò kǎoshì, tā zài wǒmen bān shì dì yī míng.",
                definition = R.string.b4l2s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "今天我们学习第二课。",
                pinyin = "Jīntiān wǒmen xuéxí dì èr kè.",
                definition = R.string.b4l2s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "你从哪儿来",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "开学的第一天，我们班来了两个新同学。老师介绍说：“李强和张艳是我们班的新同学。李强从上海来，张艳从西安来。从今天开始，我们班有三十二个同学了。”",
                    pinyin = "Kāixué de dì yī tiān, wǒmen bān láile liǎng gè xīn tóngxué. Lǎoshī jièshào shuō:“Lǐqiáng hé Zhāngyàn shì wǒmen bān de xīn tóngxué. Lǐqiáng cóng shànghǎi lái, zhāng yàn cóng xī'ān lái. Cóng jīntiān kāishǐ, wǒmen bān yǒu sānshí'èr gè tóngxuéle.”",
                    definition = R.string.b4l2s7,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "我们非常高兴，一起鼓掌欢迎新同学。从今天开始，我们有了两个新朋友！",
                    pinyin = "Wǒmen fēicháng gāoxìng, yīqǐ gǔzhǎng huānyíng xīn tóngxué. Cóng jīntiān kāishǐ, wǒmen yǒule liǎng gè xīn péngyǒu!",
                    definition = R.string.b4l2s8,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      开学的第一天，我们班来了两个新同学。老师介绍说：“李强和张艳是我们班的新同学。李强从上海来，张艳从西安来。从今天开始，我们班有三十二个同学了。”我们非常高兴，一起鼓掌欢迎新同学。\n" +
                            "       从今天开始，我们有了两个新朋友！",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L2(){
    B4L2(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}