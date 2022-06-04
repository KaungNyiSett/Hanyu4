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
fun B4L13(
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
                sentence = "弟弟要迟到了。",
                pinyin = "Dìdì yào chídàole.",
                definition = R.string.b4l13s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "手机要没电了。",
                pinyin = "Shǒujī yào méi diànle.",
                definition = R.string.b4l13s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "商店要关门了。",
                pinyin = "Shāngdiàn yào guānménle.",
                definition = R.string.b4l13s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "动画片快要开始了。",
                pinyin = "Dònghuà piàn kuàiyào kāishǐle",
                definition = R.string.b4l13s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华的生日快要到了。 ",
                pinyin = "Xiǎo huá de shēngrì kuàiyào dàole. ",
                definition = R.string.b4l13s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "姐姐快要上中学了。",
                pinyin = "Jiějiě kuàiyào shàng zhōngxuéle. ",
                definition = R.string.b4l13s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "叔叔明年就要结婚了。",
                pinyin = "Shūshu míngnián jiù yào jiéhūnle.",
                definition = R.string.b4l13s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "客人明天就要来了。",
                pinyin = "Kèrén míngtiān jiù yào láile.",
                definition = R.string.b4l13s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "学校一个月以后就要放假了。",
                pinyin = "Xuéxiào yīgè yuè yǐhòu jiù yào fàngjiàle.",
                definition = R.string.b4l13s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "新年快要到了",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "新年快要到了,同学们都互相送贺年卡。小华也想做一些贺年卡送给老师和同学。他准备了彩色的纸、画笔、胶水和剪刀。",
                    pinyin = "Xīnnián kuàiyào dàole, tóngxuémen dōu hùxiāng sòng hènián kǎ. Xiǎo huá yě xiǎng zuò yīxiē hènián kǎ sòng gěi lǎoshī hé tóngxué. Tā zhǔnbèile cǎisè de zhǐ, huàbǐ, jiāoshuǐ hé jiǎndāo.",
                    definition = R.string.b4l13s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "写完作业,他就开始做。他做了很多贺年卡,还在贺年卡上写了很多祝福的话。他祝老师身体健康,祝同学们新年快乐!",
                    pinyin = "Xiě wán zuòyè, tā jiù kāishǐ zuò. Tā zuòle hěnduō hènián kǎ, hái zài hènián kǎ shàng xiěle hěnduō zhùfú dehuà. Tā zhù lǎoshī shēntǐ jiànkāng, zhù tóngxuémen xīnnián kuàilè!",
                    definition = R.string.b4l13s11,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      新年快要到了,同学们都互相送贺年卡。小华也想做一些贺年卡送给老师和同学。他准备了彩色的纸、画笔、胶水和剪刀。写完作业,他就开始做。他做了很多贺年卡,还在贺年卡上写了很多祝福的话。他祝老师身体健康,祝同学们新年快乐!",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L13(){
    B4L13(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}