package com.enzhongwen.hanyu4

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.enzhongwen.hanyu4.ui.theme.CustomPurple
import com.enzhongwen.hanyu4.ui.theme.BlueLight

@Composable
fun AppBarTop(
    modifier: Modifier = Modifier,
    darkTheme: Boolean,
    title: String = "Hanyu",
    navClick: () -> Unit = {},
    navIcon: ImageVector = Icons.Default.Menu,
    action1Click: () -> Unit = {},
    @DrawableRes action1Icon: Int? = null,
    action2Click: () -> Unit = {},
    @DrawableRes action2Icon: Int? = null
) {
    val iconColor = if(darkTheme){
        BlueLight
    }else{
        CustomPurple
    }
    val textColor = if(darkTheme){
        Color.White
    }else{
        CustomPurple
    }
    TopAppBar(
        title = {
            Text(
                text = title,
                color = textColor
            )
        },
        navigationIcon = {
            IconButton(onClick = {
                navClick()
            }) {
                Icon(
                    imageVector = navIcon,
                    contentDescription = null,
                    tint = iconColor
                )
            }
        },
        actions = {
            if(action1Icon != null){
                IconButton(onClick = {
                    action1Click()
                }) {
                    Icon(
                        painter = painterResource(id = action1Icon),
                        contentDescription = null,
                        modifier = modifier.size(
                            25.dp
                        ),
                        tint = iconColor
                    )
                }
            }

            if(action2Icon != null){
                IconButton(onClick = {
                    action2Click()
                }) {
                    Icon(
                        painter = painterResource(id = action2Icon),
                        contentDescription = null,
                        modifier = modifier.size(
                            25.dp
                        ),
                        tint = iconColor
                    )
                }
            }
        },
        backgroundColor = if(darkTheme){
            Color.Black
        }else{
            Color.White
        }
    )
}

@Preview
@Composable
fun AppBarPreview() {
    AppBarTop(darkTheme = true)
}

@Composable
fun SearchAppBar(
    text: String,
    onTextChange: (String) -> Unit,
    onCloseClicked: () -> Unit,
    onSearchClicked: (String) -> Unit,
    darkTheme: Boolean
) {

    val textColor = if (darkTheme) {
        Color.White
    } else {
        Color.Black
    }

    val iconColor = if(darkTheme){
        BlueLight
    }else{
        CustomPurple
    }

    val barColor = if (darkTheme) {
        Color.Black
    } else {
        Color.White
    }
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        elevation = AppBarDefaults.TopAppBarElevation,
        color = barColor
    ) {
        TextField(modifier = Modifier
            .fillMaxWidth(),
            value = text,
            onValueChange = {
                onTextChange(it)
            },
            placeholder = {
                Text(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium),
                    text = stringResource(id = R.string.search),
                    color = textColor
                )
            },
            textStyle = TextStyle(
                fontSize = MaterialTheme.typography.subtitle1.fontSize
            ),
            singleLine = true,
            leadingIcon = {
                IconButton(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium),
                    onClick = {},
                    enabled = false
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Icon",
                        tint = iconColor,
                    )
                }
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        onCloseClicked()
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close Icon",
                        tint = iconColor
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    onSearchClicked(text)
                }
            ),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                cursorColor = iconColor.copy(alpha = ContentAlpha.medium),
                textColor = textColor
            ))
    }
}

@Preview
@Composable
fun PreviewSearchBar(){
    SearchAppBar(
        text = "Search",
        onTextChange = {},
        onCloseClicked = { /*TODO*/ },
        onSearchClicked = {},
        darkTheme = false)
}