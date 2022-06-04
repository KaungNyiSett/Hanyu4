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
fun B4L4(
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
                sentence = "你读读这一段课文。",
                pinyin = "Nǐ dú dú zhè yīduàn kèwén. ",
                definition = R.string.b4l4s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "你讲讲这个故事。",
                pinyin = "Nǐ jiǎng jiǎng zhège gùshì.",
                definition = R.string.b4l4s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "你听听音乐吧。",
                pinyin = "Nǐ tīng tīng yīnyuè ba.",
                definition = R.string.b4l4s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "这段课文很有意思，你读一读。",
                pinyin = "Zhè duàn kèwén hěn yǒuyìsi, nǐ dú yī dú.",
                definition = R.string.b4l4s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "这件衣服很漂亮，你试一试。",
                pinyin = "Zhè jiàn yīfú hěn piàoliang, nǐ shì yī shì.",
                definition = R.string.b4l4s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "这本漫画很好看，你看一看。",
                pinyin = "Zhè běn mànhuà hěn hǎokàn, nǐ kàn yī kàn.",
                definition = R.string.b4l4s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你洗一下手。",
                pinyin = "Nǐ xǐ yīxiàshǒu.",
                definition = R.string.b4l4s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我用一下电话。",
                pinyin = "Wǒ yòng yīxià diànhuà.",
                definition = R.string.b4l4s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "你问一下老师。",
                pinyin = "Nǐ wèn yī xià lǎoshī.",
                definition = R.string.b4l4s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "为什么不试试",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "有一个人去鞋店买鞋。出门以前，他用绳子量了一下自己的脚，在绳子上做了一个记号。",
                    pinyin = "Yǒuyīgèrén qù xié diàn mǎi xié. Chūmén yǐqián, tā yòng shéng zǐ liàngle yīxià zìjǐ de jiǎo, zài shéngzi shàng zuòle yī gè jìhào. ",
                    definition = R.string.b4l4s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "到鞋店以后，他摸摸自己的口袋，说：“哎呀，我忘了拿绳子！”等他取了绳子再回鞋店，鞋店已经关门了。",
                    pinyin = "Dào xié diàn yǐhòu, tā mō mō zìjǐ de kǒudài, shuō:“Āiyā, wǒ wàngle ná shéngzi!” Děng tā qǔle shéngzi zài huí xié diàn, xié diàn yǐjīng guānménle. ",
                    definition = R.string.b4l4s11,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "回家后，他告诉妻子这件事情。妻子很生气，说：“你为什么不自己试试鞋呢？”",
                    pinyin = "Huí jiā hòu, tā gàosù qīzi zhè jiàn shìqíng. Qīzi hěn shēngqì, shuō:“Nǐ wèishéme bù zìjǐ shì shì xié ne?”",
                    definition = R.string.b4l4s12,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      有一个人去鞋店买鞋。出门以前，他用绳子量了一下自己的脚，在绳子上做了一个记号。\n" +
                            "       到鞋店以后，他摸摸自己的口袋，说：“哎呀，我忘了拿绳子！”等他取了绳子再回鞋店，鞋店已经关门了。\n" +
                            "       回家后，他告诉妻子这件事情。妻子很生气，说：“你为什么不自己试试鞋呢？”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L4(){
    B4L4(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}