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
fun B4L6(
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
                sentence = "小鸟会唱歌。",
                pinyin = "Xiǎo niǎo huì chànggē.",
                definition = R.string.b4l6s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小鸭子会游泳。",
                pinyin = "Xiǎo yāzi huì yóuyǒng.",
                definition = R.string.b4l6s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你会骑自行车吗？",
                pinyin = "Nǐ huì qí zìxíngchē ma?",
                definition = R.string.b4l6s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "你会查字典吗？",
                pinyin = "Nǐ huì chá zìdiǎn ma?",
                definition = R.string.b4l6s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "弟弟不会炒饭。",
                pinyin = "Dìdì bù huì chǎofàn.",
                definition = R.string.b4l6s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妹妹不会系鞋带。",
                pinyin = "Mèimei bù huì xì xié dài.",
                definition = R.string.b4l6s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你会不会说汉语？",
                pinyin = "Nǐ huì bù huì shuō hànyǔ?",
                definition = R.string.b4l6s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "你爸爸会不会开车？",
                pinyin = "Nǐ bàba huì bù huì kāichē?",
                definition = R.string.b4l6s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "小鸟会唱歌",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "美丽的小鸟会唱歌，她的歌声动听极了，每天她都给动物们唱歌。有一天，她问大家：“你们会唱歌吗？”大象回答：“我不会唱歌，我会搬木头。”",
                    pinyin = "Měilì de xiǎo niǎo huì chànggē, tā de gēshēng dòngtīng jíle, měitiān tā dōu gěi dòngwùmen chànggē. Yǒu yītiān, tā wèn dàjiā:“Nǐmen huì chànggē ma?” Dà xiàng huídá:“Wǒ bù huì chànggē, wǒ huì bān mùtou.”",
                    definition = R.string.b4l6s9,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "小鸭子说：“我也不会唱歌，我会游泳。小鸟，你会不会游泳？”小鸟说：“我不会游泳。大家都有自己的本领。”",
                    pinyin = "Xiǎo yāzi shuō:“Wǒ yě bù huì chànggē, wǒ huì yóuyǒng. Xiǎo niǎo, nǐ huì bù huì yóuyǒng?” Xiǎo niǎo shuō:“Wǒ bù huì yóuyǒng. Dàjiā dōu yǒu zìjǐ de běnlǐng.",
                    definition = R.string.b4l6s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      美丽的小鸟会唱歌，她的歌声动听极了，每天她都给动物们唱歌。有一天，她问大家：“你们会唱歌吗？”大象回答：“我不会唱歌，我会搬木头。”小鸭子说：“我也不会唱歌，我会游泳。小鸟，你会不会游泳？”小鸟说：“我不会游泳。大家都有自己的本领。”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L6(){
    B4L6(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}