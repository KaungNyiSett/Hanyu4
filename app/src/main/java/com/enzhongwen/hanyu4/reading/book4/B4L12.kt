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
fun B4L12(
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
                sentence = "姐姐寄了两封信。",
                pinyin = "Jiějiě jìle liǎng fēng xìn.",
                definition = R.string.b4l12s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "弟弟做了十道题。",
                pinyin = "Dìdì zuòle shí dào tí.",
                definition = R.string.b4l12s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爸爸买了一副眼镜。",
                pinyin = "Bàba mǎile yī fù yǎnjìng.",
                definition = R.string.b4l12s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "姐姐寄没寄信? ",
                pinyin = "Jiějiě jì méi jì xìn?",
                definition = R.string.b4l12s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "弟弟做没做题?",
                pinyin = "Dìdì zuò méi zuò tí?",
                definition = R.string.b4l12s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爸爸买没买眼镜?",
                pinyin = "Bàba mǎi méi mǎi yǎnjìng? ",
                definition = R.string.b4l12s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "姐姐没有寄信。 ",
                pinyin = "Jiějiě méiyǒu jì xìn. ",
                definition = R.string.b4l12s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "弟弟没有做题。",
                pinyin = "Dìdì méiyǒu zuò tí. ",
                definition = R.string.b4l12s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爸爸没有买眼镜。",
                pinyin = "Bàba méiyǒu mǎi yǎnjìng.",
                definition = R.string.b4l12s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "妈妈买了很多苹果",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "妈妈买了很多新鲜的苹果。",
                    pinyin = "Māmā mǎile hěnduō xīnxiān de píngguǒ. ",
                    definition = R.string.b4l12s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "小丽挑了一个最大的苹果递给小明,说:“哥哥,你先吃。”小明摆了摆手,对小丽说:“你是妹妹,你先吃。”",
                    pinyin = "Xiǎo lì tiāole yīgè zuìdà de píngguǒ dì gěi xiǎomíng, shuō:“Gēgē, nǐ xiān chī.” Xiǎomíng bǎile bǎishǒu, duì xiǎo lì shuō:“Nǐ shì mèimei, nǐ xiān chī.” ",
                    definition = R.string.b4l12s11,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "小华看见了,他说:“爸爸妈妈最辛苦,他们应该先吃。”爸爸妈妈听了他们的话,笑了,说:“你们都是懂礼貌的乖孩子!”",
                    pinyin = "Xiǎo huá kànjiànle, tā shuō:“Bàba māmā zuì xīnkǔ, tāmen yīnggāi xiān chī.” Bàba māmā tīngle tāmen dehuà, xiàole, shuō:“Nǐmen dōu shì dǒng lǐmào de guāi háizi!”",
                    definition = R.string.b4l12s12,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      妈妈买了很多新鲜的苹果。\n" +
                            "       小丽挑了一个最大的苹果递给小明,说:“哥哥,你先吃。”小明摆了摆手,对小丽说:“你是妹妹,你先吃。”\n" +
                            "       小华看见了,他说:“爸爸妈妈最辛苦,他们应该先吃。”爸爸妈妈听了他们的话,笑了,说:“你们都是懂礼貌的乖孩子!”",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB4L12(){
    B4L12(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}