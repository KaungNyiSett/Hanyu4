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
fun B4L5(
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
            text = "笨鸟先飞",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "鸟妈妈有两个孩子，姐姐聪明，妹妹笨。她们一起学习飞行。姐姐觉得自己很聪明，不用功学。妹妹很努力，每天都先起床练习。",
                    pinyin = "Niǎo māmā yǒu liǎng gè háizi, jiějiě cōngmíng, mèimei bèn. Tāmen yīqǐ xuéxí fēixíng. Jiějiě juédé zìjǐ hěn cōngmíng, bùyòng gōng xué. mèimei hěn nǔlì, měitiān dōu xiān qǐchuáng liànxí.",
                    definition = R.string.b4l5s1,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "十天以后，妈妈让她们比赛，姐姐第一个飞，很快就飞不动了。妈妈问妹妹：“你行吗？”妹妹说：“我试试吧！”她飞啊飞，很快飞远了。妈妈问姐姐：“你为什么不学学妹妹？”",
                    pinyin = "Shí tiān yǐhòu, māmā ràng tāmen bǐsài, jiějiě dì yī gè fēi, hěn kuài jiù fēi bù dòngle. Māmā wèn mèimei:“Nǐ xíng ma?” Mèimei shuō:“Wǒ shì shì ba!” Tā fēi a fēi, hěn kuài fēi yuǎnle. Māmā wèn jiějiě:“Nǐ wèishéme bù xué xué mèimei?”",
                    definition = R.string.b4l5s2,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      鸟妈妈有两个孩子，姐姐聪明，妹妹笨。她们一起学习飞行。姐姐觉得自己很聪明，不用功学。妹妹很努力，每天都先起床练习。\n" +
                            "       十天以后，妈妈让她们比赛，姐姐第一个飞，很快就飞不动了。妈妈问妹妹：“你行吗？”妹妹说：“我试试吧！”她飞啊飞，很快飞远了。妈妈问姐姐：“你为什么不学学妹妹？”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
        Background(darkTheme = darkTheme){
            TextGp(
                sentence = "妈妈：你们班有多少同学？",
                pinyin = "Māmā: Nǐmen bān yǒu duōshǎo tóngxué? ",
                definition = R.string.b4l5s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华：以前三十四个，现在三十六个，有两个新同学。",
                pinyin = "Xiǎo huá: Yǐqián sānshísì gè, xiànzài sānshíliù gè, yǒu liǎng gè xīn tóngxué. ",
                definition = R.string.b4l5s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妈妈：他们都从哪儿来？",
                pinyin = "Māmā: Tāmen dōu cóng nǎ'er lái?",
                definition = R.string.b4l5s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华：他们都从中国来。",
                pinyin = "Xiǎo huá: Tāmen dōu cóng zhōngguó lái.",
                definition = R.string.b4l5s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妈妈：他们的汉语怎么样？",
                pinyin = "Māmā: Tāmen de hànyǔ zěnme yàng? ",
                definition = R.string.b4l5s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华：好极了。",
                pinyin = "Xiǎo huá: Hǎo jíle. ",
                definition = R.string.b4l5s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妈妈：以后，你多跟他们一起练习汉语吧。",
                pinyin = "Māmā: Yǐhòu, nǐ duō gēn tāmen yīqǐ liànxí hànyǔ ba. ",
                definition = R.string.b4l5s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华：好，我试试吧。",
                pinyin = "Xiǎo huá: Hǎo, wǒ shì shì ba.",
                definition = R.string.b4l5s10,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
    }
}

@Preview
@Composable
fun PreviewB4L5(){
    B4L5(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}