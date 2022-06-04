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
import com.enzhongwen.hanyu4.reading.Background
import com.enzhongwen.hanyu4.reading.Space
import com.enzhongwen.hanyu4.reading.TextGp
import com.enzhongwen.hanyu4.R

@Composable
fun B4L3(
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
                sentence = "上课以前，我们预习功课。",
                pinyin = "Shàngkè yǐqián, wǒmen yùxí gōngkè. ",
                definition = R.string.b4l3s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "吃饭以前，我们洗手。",
                pinyin = "Chīfàn yǐqián, wǒmen xǐshǒu.",
                definition = R.string.b4l3s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "一个月以前，他在西安出差。",
                pinyin = " Yīgè yuè yǐqián, tā zài xī'ān chūchāi.",
                definition = R.string.b4l3s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "下课以后，我去操场打篮球。",
                pinyin = "Xiàkè yǐhòu, wǒ qù cāochǎng dǎ lánqiú.",
                definition = R.string.b4l3s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "下班以后，妈妈去市场买菜。",
                pinyin = "Xiàbān yǐhòu, māmā qù shìchǎng mǎi cài. ",
                definition = R.string.b4l3s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "长大以后，我打算去中国学习汉语。",
                pinyin = "Zhǎng dà yǐhòu, wǒ dǎsuàn qù zhōngguó xuéxí hànyǔ. ",
                definition = R.string.b4l3s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "爷爷以前是飞行员。",
                pinyin = "Yéyé yǐqián shì fēixíngyuán.",
                definition = R.string.b4l3s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "李强以前喜欢喝牛奶。",
                pinyin = "Lǐqiáng yǐqián xǐhuān hē niúnǎi.",
                definition = R.string.b4l3s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "陈老师以前教数学课。",
                pinyin = "Chén lǎoshī yǐqián jiào shùxué kè.",
                definition = R.string.b4l3s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "跟老师学中文",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "这学期，陈老师教我们中文课。上课以前，我们预习生词和课文。上课了，我们认真听老师讲课。",
                    pinyin = "Zhè xuéqí, chén lǎoshī jiào wǒmen zhōngwén kè. Shàngkè yǐqián, wǒmen yùxí shēngcí hé kèwén. Shàngkèle, wǒmen rènzhēn tīng lǎoshī jiǎngkè.",
                    definition = R.string.b4l3s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "下课以后，我们常常用汉语跟老师聊天，讨论问题。放学以后，我们认真复习功课。大家进步很快。陈老师夸我们说：“你们真是努力学习的好学生！”",
                    pinyin = "Xiàkè yǐhòu, wǒmen chángcháng yòng hànyǔ gēn lǎoshī liáotiān, tǎolùn wèntí. Fàngxué yǐhòu, wǒmen rènzhēn fùxí gōngkè. Dàjiā jìnbù hěn kuài. Chén lǎoshī kuā wǒmen shuō:“Nǐmen zhēnshi nǔlì xuéxí de hào xuéshēng!”",
                    definition = R.string.b4l3s11,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      这学期，陈老师教我们中文课。上课以前，我们预习生词和课文。上课了，我们认真听老师讲课。下课以后，我们常常用汉语跟老师聊天，讨论问题。放学以后，我们认真复习功课。大家进步很快。陈老师夸我们说：“你们真是努力学习的好学生！”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L3(){
    B4L3(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}