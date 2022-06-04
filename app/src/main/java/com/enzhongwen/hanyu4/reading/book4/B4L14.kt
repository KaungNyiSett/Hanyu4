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
fun B4L14(
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
                sentence = "他们吃蛋糕呢。",
                pinyin = "Tāmen chī dàngāo ne. ",
                definition = R.string.b4l14s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "他们听录音呢。",
                pinyin = "Tāmen tīng lùyīn ne.",
                definition = R.string.b4l14s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "他们做游戏呢。",
                pinyin = "Tāmen zuò yóuxì ne.",
                definition = R.string.b4l14s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "小明正在睡觉呢。",
                pinyin = "Xiǎomíng zhèngzài shuìjiào ne.",
                definition = R.string.b4l14s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师正在上课呢。",
                pinyin = " Lǎoshī zhèngzài shàngkè ne.",
                definition = R.string.b4l14s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爷爷正在打太极拳呢。",
                pinyin = "Yéyé zhèngzài dǎ tàijí quán ne.",
                definition = R.string.b4l14s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "小华做作业的时候,妈妈正在擦地板呢。 ",
                pinyin = "Xiǎo huá zuò zuo yè de shíhòu, māmā zhèngzài cā dìbǎn ne. ",
                definition = R.string.b4l14s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "哥哥打篮球的时候,弟弟正在读课文呢。",
                pinyin = "Gēgē dǎ lánqiú de shíhòu, dìdì zhèngzài dú kèwén ne.",
                definition = R.string.b4l14s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爸爸看电视的时候,小华正写贺年卡呢。",
                pinyin = "Bàba kàn diànshì de shíhòu, xiǎo huá zhèng xiě hènián kǎ ne.",
                definition = R.string.b4l14s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "他们正在睡觉呢",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "小明在跟小朋友做游戏的时候,太阳要落山了。他急忙喊:“太阳公公,您别走!您走了,我们就不能玩了!” ",
                    pinyin = "Xiǎomíng zài gēn xiǎopéngyǒu zuò yóuxì de shíhòu, tàiyáng yào luòshānle. Tā jímáng hǎn:“Tàiyáng gōnggōng, nín bié zǒu! Nín zǒule, wǒmen jiù bùnéng wánle!”",
                    definition = R.string.b4l14s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "太阳公公说:“再见,小朋友!地球的那边也有很多小朋友。你在外边玩的时候,他们正睡觉呢。我要去叫醒他们了。”",
                    pinyin = "Tàiyáng gōnggōng shuō:“Zàijiàn, xiǎopéngyǒu! Dìqiú de nà biān yěyǒu hěnduō xiǎopéngyǒu. Nǐ zài wàibian wán de shíhòu, tāmen zhèng shuìjiào ne. Wǒ yào qù jiào xǐng tāmenle.” ",
                    definition = R.string.b4l14s11,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "小明说:“好吧,太阳公公。明天早晨,请您也来叫我, 起床吧。”",
                    pinyin = "Xiǎomíng shuō:“Hǎo ba, tàiyáng gōnggōng. Míngtiān zǎochén, qǐng nín yě lái jiào wǒ, qǐchuáng ba.”",
                    definition = R.string.b4l14s12,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "        小明在跟小朋友做游戏的时候,太阳要落山了。他急忙喊:“太阳公公,您别走!您走了,我们就不能玩了!”  \n" +
                            "       太阳公公说:“再见,小朋友!地球的那边也有很多小朋友。你在外边玩的时候,他们正睡觉呢。我要去叫醒他们了。”\n" +
                            "       小明说:“好吧,太阳公公。明天早晨,请您也来叫我, 起床吧。”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L14(){
    B4L14(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}