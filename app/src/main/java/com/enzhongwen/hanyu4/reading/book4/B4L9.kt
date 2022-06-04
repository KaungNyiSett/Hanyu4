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
fun B4L9(
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
                sentence = "小丽在教室里边。",
                pinyin = "Xiǎo lì zài jiàoshì lǐbian. ",
                definition = R.string.b4l9s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师在教室外边。 ",
                pinyin = "Lǎoshī zài jiàoshì wàibian.",
                definition = R.string.b4l9s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爸爸在妈妈旁边。 ",
                pinyin = "Bàba zài māmā pángbiān.",
                definition = R.string.b4l9s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妹妹在我和弟弟的中间。",
                pinyin = "Mèimei zài wǒ hé dìdì de zhōngjiān.",
                definition = R.string.b4l9s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "在动物园可以看到很多动物。",
                pinyin = "Zài dòngwùyuán kěyǐ kàn dào hěnduō dòngwù.",
                definition = R.string.b4l9s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "在学校可以认识很多新朋友。",
                pinyin = "Zài xuéxiào kěyǐ rènshí hěnduō xīn péngyǒu.",
                definition = R.string.b4l9s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "弟弟最喜欢荡秋千。",
                pinyin = "Dìdì zuì xǐhuān dàng qiūqiān.",
                definition = R.string.b4l9s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "长颈鹿的脖子最长。",
                pinyin = "Chángjǐnglù de bózi zuì zhǎng.",
                definition = R.string.b4l9s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "小玲的家在唐人街附近",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "星期天,我去小玲家玩。小玲的家在唐人街附近。唐人街有很多商店和饭店,特别热闹。唐人街前面有一个车站,车站旁边是一个中国饭店。",
                    pinyin = "Xīngqítiān, wǒ qù xiǎo líng jiā wán. Xiǎo líng de jiā zài tángrénjiē fùjìn. Tángrénjiē yǒu hěnduō shāngdiàn hé fàndiàn, tèbié rènào. Tángrénjiē qiánmiàn yǒu yīgè chēzhàn, chēzhàn pángbiān shì yīgè zhōngguó fàndiàn. ",
                    definition = R.string.b4l9s9,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "小玲的家在中国饭店旁边。在唐人街可以买到很多中国的东西。我最喜欢中国结。我送给小玲一个漂亮的中国结。",
                    pinyin = "Xiǎo líng de jiā zài zhōngguó fàndiàn pángbiān. Zài tángrénjiē kěyǐ mǎi dào hěnduō zhōngguó de dōngxī. Wǒ zuì xǐhuān zhōngguójié. Wǒ sòng gěi xiǎo líng yīgè piàoliang de zhōngguójié.\n",
                    definition = R.string.b4l9s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      星期天,我去小玲家玩。小玲的家在唐人街附近。唐人街有很多商店和饭店,特别热闹。唐人街前面有一个车站,车站旁边是一个中国饭店。小玲的家在中国饭店旁边。在唐人街可以买到很多中国的东西。我最喜欢中国结。我送给小玲一个漂亮的中国结。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L9(){
    B4L9(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}