package com.enzhongwen.hanyu4

import android.util.Log
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.enzhongwen.hanyu4.data.b4all
import com.enzhongwen.hanyu4.db.VocabData

@Composable
fun AllVocab(
    darkTheme: Boolean,
    navController: NavController,
    darkMode:() -> Unit,
    endActivity:() -> Unit
) {
    Log.d("TAG","Composed")

    var onOff by rememberSaveable {
        mutableStateOf(true)
    }
    var barState by rememberSaveable {
        mutableStateOf(true)
    }
    var searchItem by rememberSaveable {
        mutableStateOf(
            ""
        )
    }

    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            DrawerContent(
                scaffoldState = scaffoldState,
                navController = navController,
                darkTheme = darkTheme,
                darkMode = darkMode,
                endActivity = endActivity
            )
        },
        topBar = {
            if (barState) {
                AppBarTop(
                    title = "Vocabulary",
                    navIcon = Icons.Default.ArrowBack,
                    navClick = {
                        navController.navigateUp()
                    },
                    action1Icon = R.drawable.studymode,
                    action1Click = {
                                   onOff = !onOff
                    },
                    action2Icon = R.drawable.search,
                    action2Click = {
                        barState = !barState
                    },
                    darkTheme = darkTheme
                )
            } else {
                SearchAppBar(
                    text = searchItem,
                    onTextChange = {
                        searchItem = it
                    },
                    onCloseClicked = {
                        barState = !barState
                        searchItem = ""
                    },
                    onSearchClicked = {},
                    darkTheme = darkTheme
                )
            }

        }
    )
    {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = if (darkTheme) {
                        Color.Black
                    } else {
                        Color.White
                    }
                )
        ) {
            BannerAd()

            VocabList(
                darkTheme = darkTheme,
                navController = navController,
                onOff = onOff,
                searchItem = searchItem
            )
        }
    }
}

@Composable
fun VocabList(
    darkTheme: Boolean,
    navController: NavController,
    onOff: Boolean,
    searchItem: String
) {
    val list = remember {
        mutableListOf<VocabData>()
    }

    val searchList = b4all.filter {
        val a = stringResource(id = it.definition)
        it.word.contains(searchItem)
                || searchItem.contains(it.word)
                || searchItem.contains(a)
                || a.contains(searchItem)
    }

    LazyColumn(
        modifier = Modifier
            .background(
                color = if (darkTheme) {
                    Color.Black
                } else {
                    Color.White
                }
            )
            .fillMaxSize()
    ) {
        items(
            items = if (searchItem == "") {
                b4all
            } else {
                searchList
            },
            key = {
                it.id1
            }
        ) {
            for(i in FAV_LIST){
                if(i.id1 == it.id1){
                    list.add(it)
                }
            }

            val animatedProgress = remember {
                Animatable(
                    initialValue = 0.8f
                )
            }

            LaunchedEffect(key1 = Unit) {
                animatedProgress.animateTo(
                    targetValue = 1f,
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearEasing
                    )
                )
            }

            val modifier = Modifier.graphicsLayer(
                scaleX = animatedProgress.value,
                scaleY = animatedProgress.value
            )

            VocabItems(
                saved = it,
                darkTheme = darkTheme,
                navController = navController,
                onOff = onOff,
                favourite = list.contains(it),
                modifier = modifier
            )
        }
    }
}