package com.enzhongwen.hanyu4.reading.book4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.enzhongwen.hanyu4.R
import com.enzhongwen.hanyu4.ToAnotherApp
import com.enzhongwen.hanyu4.reading.Background
import com.enzhongwen.hanyu4.reading.Space
import com.enzhongwen.hanyu4.reading.TextGp

@Composable
fun B4L15(
    onOff: Boolean,
    darkTheme: Boolean,
    modifier: Modifier,
) {
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
            )
        ,
    ) {
        Text(
            text = "聪明的公鸡",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme) {
            if (onOff) {
                TextGp(
                    sentence = "公鸡正在路上走,遇见了一只狼。 狼看见公鸡,很高兴,他想:“我正想吃一只鸡呢。”  ",
                    pinyin = "Gōngjī zhèngzài lùshàng zǒu, yùjiànle yī zhǐ láng. Láng kànjiàn gōngjī, hěn gāoxìng, tā xiǎng:“Wǒ zhèng xiǎng chī yī zhǐ jī ne.” ",
                    definition = R.string.b4l15s1,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "狼问:“好朋友,你去哪儿?”公鸡说:“我去看朋友。”狼说:“我陪你去吧。” 公鸡想:糟糕,他要吃我,我不能上他的当!公鸡对狼说:“对不起,后面还有一只狗,我正等他呢。”",
                    pinyin = "Láng wèn:“Hǎo péngyǒu, nǐ qù nǎ'er?” Gōngjī shuō:“Wǒ qù kàn péngyǒu.” Láng shuō:“Wǒ péi nǐ qù ba.” Gōngjī xiǎng: Zāogāo, tā yào chī wǒ, wǒ bùnéng shàng tā dí dàng! Gōngjī duì láng shuō:“Duìbùqǐ, hòumiàn hái yǒuyī zhǐ gǒu, wǒ zhèng děng tā ne.”",
                    definition = R.string.b4l15s2,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "狼听了公鸡的话,急忙跑了。",
                    pinyin = "Láng tīngle gōngjī dehuà, jímáng pǎole.",
                    definition = R.string.b4l15s3,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            } else {
                Text(
                    text = "      公鸡正在路上走,遇见了一只狼。 狼看见公鸡,很高兴,他想:“我正想吃一只鸡呢。” \n" +
                            "       狼问:“好朋友,你去哪儿?”公鸡说:“我去看朋友。”狼说:“我陪你去吧。” 公鸡想:糟糕,他要吃我,我不能上他的当!公鸡对狼说:“对不起,后面还有一只狗,我正等他呢。”\n" +
                            "       狼听了公鸡的话,急忙跑了。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
        Background(darkTheme = darkTheme) {
            TextGp(
                sentence = "狼:一天没吃东西了,真饿啊! ",
                pinyin = "Láng: Yītiān méi chī dōngxīle, zhēn è a! ",
                definition = R.string.b4l15s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "公鸡:公鸡、公鸡真美丽,聪明、漂亮我第一! ",
                pinyin = "Gōngjī: Gōngjī, gōngjī zhēn měilì, cōngmíng, piàoliang wǒ dì yī!",
                definition = R.string.b4l15s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "狼:啊,多大的一只鸡呀!我正想吃鸡呢,哈哈......好朋友,你去哪儿? ",
                pinyin = "Láng: A, duōdà de yī zhǐ jī ya! Wǒ zhèng xiǎng chī jī ne, hāhā...... Hǎo péngyǒu, nǐ qù nǎ'er? ",
                definition = R.string.b4l15s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "公鸡:我去看小山羊。",
                pinyin = "Gōngjī: Wǒ qù kàn xiǎo shānyáng. ",
                definition = R.string.b4l15s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "狼:好极了!我也正想去看他,我们一起走吧! ",
                pinyin = "Láng: Hǎo jíle! Wǒ yě zhèng xiǎng qù kàn tā, wǒmen yīqǐ zǒu ba!",
                definition = R.string.b4l15s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "公鸡:他想做什么?他想吃我吗?我要想一想......",
                pinyin = "Gōngjī: Tā xiǎng zuò shénme? Tā xiǎng chī wǒ ma? Wǒ yào xiǎng yī xiǎng...... ",
                definition = R.string.b4l15s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "狼:好朋友,快走吧! ",
                pinyin = "Láng: Hǎo péngyǒu, kuàizǒu ba! ",
                definition = R.string.b4l15s10,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "公鸡:对不起,我正等我的朋友呢,他快要来了。",
                pinyin = "Gōngjī: Duìbùqǐ, wǒ zhèng děng wǒ de péngyǒu ne, tā kuàiyào láile. ",
                definition = R.string.b4l15s11,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "狼:谁呀? ",
                pinyin = "Láng: Shéi ya? ",
                definition = R.string.b4l15s12,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "公鸡:大黄狗。",
                pinyin = "Gōngjī: Dàhuáng gǒu.",
                definition = R.string.b4l15s13,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "狼:啊?那我先走了。",
                pinyin = "Láng: A? Nà wǒ xiān zǒule. ",
                definition = R.string.b4l15s14,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if (onOff) {
                Space()
            }
            TextGp(
                sentence = "公鸡:公鸡、公鸡真美丽,聪明、漂亮我第一!",
                pinyin = "Gōngjī: Gōngjī, gōngjī zhēn měilì, cōngmíng, piàoliang wǒ dì yī!",
                definition = R.string.b4l15s15,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = stringResource(id = R.string.levelAdd),
            color = textColor,
            modifier = Modifier.padding(
                horizontal = 10.dp
            )
        )
        ToAnotherApp(darkTheme = darkTheme)
    }
}
