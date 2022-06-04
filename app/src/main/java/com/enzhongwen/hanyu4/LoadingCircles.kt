package com.enzhongwen.hanyu4


import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.enzhongwen.hanyu4.ui.theme.CustomPurple

@Composable
fun LoadingCircles(modifier: Modifier = Modifier) {

    val infiniteTransition = rememberInfiniteTransition()

    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 3600f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 12000,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        )
    )
    val color = CustomPurple

    Canvas(
        modifier = modifier.size(30.dp)
    ) {
        rotate(rotation) {
            drawCircle(
                color = color,
                radius = 3.dp.toPx(),
                center = Offset(
                    x = 15.dp.toPx(),
                    y = 3.dp.toPx()
                ),
                alpha = 1f
            )
            drawCircle(
                color = color,
                radius = 3.dp.toPx(),
                center = Offset(
                    x = 23.485.dp.toPx(),
                    y = 6.515.dp.toPx()
                ),
                alpha = 0.125f
            )
            drawCircle(
                color = color,
                radius = 3.dp.toPx(),
                center = Offset(
                    x = 27.dp.toPx(),
                    y = 15.dp.toPx()
                ),
                alpha = 0.25f
            )
            drawCircle(
                color = color,
                radius = 3.dp.toPx(),
                center = Offset(
                    x = 23.485.dp.toPx(),
                    y = 23.485.dp.toPx()
                ),
                alpha = 0.325f
            )
            drawCircle(
                color = color,
                radius = 3.dp.toPx(),
                center = Offset(
                    x = 15.dp.toPx(),
                    y = 27.dp.toPx()
                ),
                alpha = 0.5f
            )
            drawCircle(
                color = color,
                radius = 3.dp.toPx(),
                center = Offset(
                    x = 6.515.dp.toPx(),
                    y = 23.485.dp.toPx()
                ),
                alpha = 0.675f
            )
            drawCircle(
                color = color,
                radius = 3.dp.toPx(),
                center = Offset(
                    x = 3.dp.toPx(),
                    y = 15.dp.toPx()
                ),
                alpha = 0.75f
            )
            drawCircle(
                color = color,
                radius = 3.dp.toPx(),
                center = Offset(
                    x = 6.515.dp.toPx(),
                    y = 6.515.dp.toPx()
                ),
                alpha = 0.825f
            )
        }

    }
}

@Preview
@Composable
fun PreviewLoadingCircles() {
    LoadingCircles()
}