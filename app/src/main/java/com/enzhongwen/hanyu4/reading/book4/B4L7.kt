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
fun B4L7(
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
                sentence = "周末我们要去爬山。",
                pinyin = "Zhōumò wǒmen yào qù páshān.",
                definition = R.string.b4l7s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "下午老师要开会。",
                pinyin = "Xiàwǔ lǎoshī yào kāihuì.",
                definition = R.string.b4l7s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "明天我们要看演出。",
                pinyin = "Míngtiān wǒmen yào kàn yǎnchū.",
                definition = R.string.b4l7s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "哥哥想当医生。",
                pinyin = "Gēgē xiǎng dāng yīshēng.",
                definition = R.string.b4l7s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我想去中国。",
                pinyin = "Wǒ xiǎng qù zhōngguó.",
                definition = R.string.b4l7s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我朋友想学汉语。",
                pinyin = "Wǒ péngyǒu xiǎng xué hànyǔ.",
                definition = R.string.b4l7s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "妹妹不想吃药。",
                pinyin = "Mèimei bùxiǎng chī yào.",
                definition = R.string.b4l7s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "弟弟不想照相。",
                pinyin = "Dìdì bùxiǎng zhàoxiàng.",
                definition = R.string.b4l7s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我不想喝茶，我想喝果汁。",
                pinyin = "Wǒ bùxiǎng hē chá, wǒ xiǎng hē guǒzhī.",
                definition = R.string.b4l7s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "我们要去爬山",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "明天是星期天，小明的老师要带同学们去爬山。小明对妈妈说：“明天我们要去爬山，老师让我们带午饭。”妈妈问小明：“你想带什么？想不想吃汉堡包？”",
                    pinyin = "Míngtiān shì xīngqítiān, xiǎomíng de lǎoshī yào dài tóngxuémen qù páshān. Xiǎomíng duì māmā shuō:“Míngtiān wǒmen yào qù páshān, lǎoshī ràng wǒmen dài wǔfàn.” Māmā wèn xiǎomíng:“Nǐ xiǎng dài shénme? Xiǎng bùxiǎng chī hànbǎobāo?”",
                    definition = R.string.b4l7s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "小明说：“我不想吃汉堡包，我想吃炒饭。”妈妈说：“好的，我给你准备。别忘记带水壶。”",
                    pinyin = "Xiǎomíng shuō:“Wǒ bùxiǎng chī hànbǎobāo, wǒ xiǎng chī chǎofàn.” Māmā shuō:“Hǎo de, wǒ gěi nǐ zhǔnbèi. Bié wàngjì dài shuǐhú.”",
                    definition = R.string.b4l7s11,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      明天是星期天，小明的老师要带同学们去爬山。小明对妈妈说：“明天我们要去爬山，老师让我们带午饭。”妈妈问小明：“你想带什么？想不想吃汉堡包？”小明说：“我不想吃汉堡包，我想吃炒饭。”妈妈说：“好的，我给你准备。别忘记带水壶。”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L7(){
    B4L7(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}