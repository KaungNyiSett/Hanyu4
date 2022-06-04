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
fun B4L11(
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
                sentence = "妹妹睡觉了吗? ",
                pinyin = "Mèimei shuìjiàole ma?",
                definition = R.string.b4l11s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师来了吗? ",
                pinyin = "Lǎoshī láile ma?",
                definition = R.string.b4l11s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "飞机起飞了吗?",
                pinyin = "Fēijī qǐfēile ma? ",
                definition = R.string.b4l11s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "妹妹睡觉了。",
                pinyin = "Mèimei shuìjiàole.",
                definition = R.string.b4l11s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师来了。",
                pinyin = "Lǎoshī láile. ",
                definition = R.string.b4l11s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "飞机起飞了。",
                pinyin = "Fēijī qǐfēile.",
                definition = R.string.b4l11s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "妹妹没睡觉。",
                pinyin = "Mèimei méi shuìjiào.",
                definition = R.string.b4l11s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师没来。 ",
                pinyin = "Lǎoshī méi lái.",
                definition = R.string.b4l11s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "飞机没起飞。",
                pinyin = "Fēijī méi qǐfēi. ",
                definition = R.string.b4l11s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "我饱了。 ",
                pinyin = "Wǒ bǎole.",
                definition = R.string.b4l11s10,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "他明白了。",
                pinyin = "Tā míngbáile.",
                definition = R.string.b4l11s11,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华病了。",
                pinyin = "Xiǎo huá bìngle.",
                definition = R.string.b4l11s12,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "小华去医院了",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "星期一,小华没去学校,他感冒了。妈妈带他去医院,小华对医生 说:“我头疼,咳嗽,嗓子不舒服。”",
                    pinyin = "Xīngqí yī, xiǎo huá méi qù xuéxiào, tā gǎnmàole. Māmā dài tā qù yīyuàn, xiǎo huá duì yīshēng shuō:“Wǒ tóuténg, késòu, sǎngzi bú shūfú.”",
                    definition = R.string.b4l11s13,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "医生给小华做完检查,说:“你发烧了。 现在是冬天,天气冷了,你要多穿衣服、多喝水。”医生让小华按时吃药、多休息。三天以后,小华的病好了。",
                    pinyin = "Yīshēng gěi xiǎo huá zuò wán jiǎnchá, shuō:“Nǐ fāshāole. Xiànzài shì dōngtiān, tiānqì lěngle, nǐ yào duō chuān yīfú, duō hē shuǐ.” Yīshēng ràng xiǎo huá ànshí chī yào, duō xiūxí. Sān tiān yǐhòu, xiǎo huá de bìng hǎole.",
                    definition = R.string.b4l11s14,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      星期一,小华没去学校,他感冒了。妈妈带他去医院,小华对医生 说:“我头疼,咳嗽,嗓子不舒服。”医生给小华做完检查,说:“你发烧了。 现在是冬天,天气冷了,你要多穿衣服、多喝水。”医生让小华按时吃药、多休息。三天以后,小华的病好了。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L11(){
    B4L11(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}