package com.enzhongwen.hanyu4

import android.content.res.Configuration
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.enzhongwen.hanyu4.data.*
import com.enzhongwen.hanyu4.db.VocabData
import com.enzhongwen.hanyu4.reading.book4.*
import com.enzhongwen.hanyu4.ui.theme.BlueDark
import com.enzhongwen.hanyu4.ui.theme.BlueLight
import com.enzhongwen.hanyu4.ui.theme.CustomPurple
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun EachLessonScreen(
    darkTheme: Boolean,
    lesson: Int,
    navController: NavController,
    onBack: () -> Unit,
) {
    var onOff by rememberSaveable {
        mutableStateOf(true)
    }

    val pagerState = rememberPagerState()

    val scope = rememberCoroutineScope()

    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBarTop(
                title = "Lesson $lesson",
                navIcon = Icons.Default.ArrowBack,
                navClick = {
                    onBack()
                    navController.navigateUp()
                },
                action1Icon = R.drawable.studymode,
                action1Click = {
                    onOff = !onOff
                },
                darkTheme = darkTheme
            )
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(
                    color = if (darkTheme) {
                        Color.Black
                    } else {
                        Color.White
                    }
                )
        ) {
            val configuration = LocalConfiguration.current

            if(configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                BannerAd()
            }

            HorizontalPager(
                count = 2,
                state = pagerState,
                modifier = Modifier.weight(1f)
            ) { page ->

                when(page){
                    0 -> LessonVocab(
                        darkTheme = darkTheme,
                        navController = navController,
                        lesson = lesson,
                        onOff = onOff,
                        modifier = Modifier
                    )

                    1 -> Reading(
                        lesson = lesson,
                        onOff = onOff,
                        darkTheme = darkTheme,
                        modifier = Modifier
                    )
                }
            }

            TabPart(
                state = pagerState.currentPage,
                darkTheme = darkTheme,
                selectedTab = pagerState.currentPage,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(it)
                    }
                }
            )
        }
    }
}

@Composable
fun TabPart(
    state: Int,
    darkTheme: Boolean,
    onClick: (Int) -> Unit,
    selectedTab: Int,
) {
    val titles = listOf(R.string.vocabulary, R.string.reading)

    val textColor = if (darkTheme) {
        BlueLight
    } else {
        CustomPurple
    }

    TabRow(
        selectedTabIndex = selectedTab,
        backgroundColor = if (darkTheme) {
            Color.DarkGray
        } else {
            Color.LightGray
        },
    ) {
        titles.forEachIndexed { index, title ->
            Tab(
                text = {
                    Text(
                        text = stringResource(id = title),
                        color = textColor,
                    )
                },
                selected = state == index,
                onClick = {
                    onClick(index)
                }
            )
        }
    }
}

@Composable
fun Reading(
    modifier: Modifier,
    lesson: Int,
    onOff: Boolean,
    darkTheme: Boolean
) {

    val animatedProgress = remember {
        Animatable(
            initialValue = 1.1f
        )
    }

    LaunchedEffect(Unit) {
        animatedProgress.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 300,
                easing = LinearEasing
            )
        )
    }

    val modifierValue = modifier.graphicsLayer(
        scaleX = animatedProgress.value,
        scaleY = animatedProgress.value,
    )

    when (lesson) {
        1 -> B4L1(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        2 -> B4L2(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        3 -> B4L3(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        4 -> B4L4(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        5 -> B4L5(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        6 -> B4L6(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        7 -> B4L7(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        8 -> B4L8(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        9 -> B4L9(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        10 -> B4L10(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        11 -> B4L11(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        12 -> B4L12(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        13 -> B4L13(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        14 -> B4L14(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
        15 -> B4L15(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifierValue
        )
    }
}

fun lessonVocab(lesson: Int): List<VocabData> {
    return when (lesson) {
        1 -> b4l1
        2 -> b4l2
        3 -> b4l3
        4 -> b4l4
        5 -> b4l5
        6 -> b4l6
        7 -> b4l7
        8 -> b4l8
        9 -> b4l9
        10 -> b4l10
        11 -> b4l11
        12 -> b4l12
        13 -> b4l13
        14 -> b4l14
        15 -> b4l15
        else -> b4l1
    }
}

@Composable
fun LessonVocab(
    darkTheme: Boolean,
    navController: NavController,
    lesson: Int,
    modifier: Modifier,
    onOff: Boolean
) {

    val list = remember {
        mutableListOf<VocabData>()
    }

    LazyColumn(
        modifier = modifier.background(
            color = if (darkTheme) {
                Color.Black
            } else {
                Color.White
            }
        )
    ) {
        items(
            items = lessonVocab(lesson),
            key = {
                it.id1
            }
        ) {
            for (i in FAV_LIST) {
                if (i.id1 == it.id1) {
                    list.add(it)
                }
            }

            val animatedProgress = remember {
                Animatable(
                    initialValue = 0.8f
                )
            }

            LaunchedEffect(Unit) {
                animatedProgress.animateTo(
                    targetValue = 1f,
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearEasing
                    )
                )
            }

            VocabItems(
                saved = it,
                darkTheme = darkTheme,
                navController = navController,
                onOff = onOff,
                favourite = list.contains(it),
                modifier = Modifier.graphicsLayer(
                    scaleX = animatedProgress.value,
                    scaleY = animatedProgress.value
                )
            )
        }
    }
}

@Preview
@Composable
fun PreviewEachLessonScreen() {
    EachLessonScreen(
        darkTheme = true,
        lesson = 1,
        navController = NavController(LocalContext.current),
        onBack = {}
    )
}