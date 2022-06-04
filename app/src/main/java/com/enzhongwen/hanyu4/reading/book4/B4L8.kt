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
fun B4L8(
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
                sentence = "我可以看电视吗? ",
                pinyin = "Wǒ kěyǐ kàn diànshì ma?",
                definition = R.string.b4l8s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我可以借这本杂志吗? ",
                pinyin = "Wǒ kěyǐ jiè zhè běn zázhì ma?",
                definition = R.string.b4l8s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我可以跟你一起去机场吗?",
                pinyin = "Wǒ kěyǐ gēn nǐ yīqǐ qù jīchǎng ma? ",
                definition = R.string.b4l8s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "上课不能睡觉。 ",
                pinyin = "Shàngkè bùnéng shuìjiào. ",
                definition = R.string.b4l8s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "睡觉以前不能吃糖。",
                pinyin = "Shuìjiào yǐqián bùnéng chī táng.",
                definition = R.string.b4l8s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "飞机上不能用手机。",
                pinyin = "Fēijī shàng bùnéng yòng shǒujī.",
                definition = R.string.b4l8s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "我打完球再洗澡。 ",
                pinyin = "Wǒ dǎ wán qiú zài xǐzǎo. ",
                definition = R.string.b4l8s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我洗完澡再看电视。",
                pinyin = "Wǒ xǐ wán zǎo zài kàn diànshì.",
                definition = R.string.b4l8s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我看完电视再睡觉。",
                pinyin = "Wǒ kàn wán diànshì zài shuìjiào.",
                definition = R.string.b4l8s9,
                onOff = onOff,
                darkTheme = darkTheme
            )

        }
        Text(
            text = "我可以看电视吗",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "小华是个卡通迷。放学以后,小华问妈妈:“妈妈,我可以看电视吗?”妈妈摇摇头说:“现在不能看,做完作业再看吧。”",
                    pinyin = "Xiǎo huá shìgè kǎtōng mí. Fàngxué yǐhòu, xiǎo huá wèn māmā:“Māmā, wǒ kěyǐ kàn diànshì ma?” Māmā yáo yáotóu shuō:“Xiànzài bùnéng kàn, zuò wán zuòyè zài kàn ba.”",
                    definition = R.string.b4l8s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "小华说:“我看完电视再做作业, 可以吗?”妈妈说:“为什么?”小华说: “六点演动画片《孙悟空》,听说特别有意思,我很想看。”妈妈点点头说:“好吧。”",
                    pinyin = "Xiǎo huá shuō:“Wǒ kàn wán diànshì zài zuò zuo yè, kěyǐ ma?” Māmā shuō:“Wèishéme?” Xiǎo huá shuō: “Liù diǎn yǎn dònghuà piàn “sūnwùkōng”, tīng shuō tèbié yǒuyìsi, wǒ hěn xiǎng kàn.” Māmā diǎndiǎn tóu shuō:“Hǎo ba.”",
                    definition = R.string.b4l8s11,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      小华是个卡通迷。放学以后,小华问妈妈:“妈妈,我可以看电视吗?”妈妈摇摇头说:“现在不能看,做完作业再看吧。”小华说:“我看完电视再做作业, 可以吗?”妈妈说:“为什么?”小华说: “六点演动画片《孙悟空》,听说特别有意思,我很想看。”妈妈点点头说:“好吧。”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L8(){
    B4L8(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}