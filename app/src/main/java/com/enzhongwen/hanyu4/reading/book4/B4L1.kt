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
import com.enzhongwen.hanyu4.BannerAd
import com.enzhongwen.hanyu4.R
import com.enzhongwen.hanyu4.reading.Background
import com.enzhongwen.hanyu4.reading.Space
import com.enzhongwen.hanyu4.reading.TextGp
import com.google.android.gms.ads.AdSize

@Composable
fun B4L1(
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
                sentence = "学校有多少学生？",
                pinyin = "Xuéxiào yǒu duōshǎo xuéshēng?",
                definition = R.string.b4l1s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "这件衣服多少钱？",
                pinyin = "Zhè jiàn yīfú duōshǎo qián?",
                definition = R.string.b4l1s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "学校有四百零八个学生。",
                pinyin = "Xuéxiào yǒu sìbǎi líng bā gè xuéshēng. ",
                definition = R.string.b4l1s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "这件衣服一百九十八块钱。",
                pinyin = "Zhè jiàn yīfú yībǎi jiǔshíbā kuài qián. ",
                definition = R.string.b4l1s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "桌子上放着两本书。",
                pinyin = "Zhuōzi shàng fàng zhe liǎng běn shū.",
                definition = R.string.b4l1s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "公共汽车上坐着十几个乘客。",
                pinyin = "Gōnggòng qìchē shàng zuòzhe shí jǐ gè chéngkè.",
                definition = R.string.b4l1s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "学校有多少学生",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "我们学校一共有四百零八个学生，五十位老师。学校里有一座教学楼，教学楼里有很多明亮的教室。",
                    pinyin = "Wǒmen xuéxiào yīgòng yǒu sìbǎi líng bā gè xuéshēng, wǔshí wèi lǎoshī. Xuéxiào li yǒu yīzuò jiàoxué lóu, jiàoxué lóu li yǒu hěnduō míngliàng de jiàoshì.",
                    definition = R.string.b4l1s7,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "每天，我们在教室里读书，写字。教学楼的前边是操场，后边种着很多树。我们常常在树下活动。",
                    pinyin = "Měitiān, wǒmen zài jiàoshì lǐ dúshū, xiězì. Jiàoxué lóu de qiánbian shì cāochǎng, hòubian zhòngzhe hěnduō shù. Wǒmen chángcháng zài shù xià huódòng.",
                    definition = R.string.b4l1s8,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      我们学校一共有四百零八个学生，五十位老师。学校里有一座教学楼，教学楼里有很多明亮的教室。每天，我们在教室里读书，写字。教学楼的前边是操场，后边种着很多树。我们常常在树下活动。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L1(){
    B4L1(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}