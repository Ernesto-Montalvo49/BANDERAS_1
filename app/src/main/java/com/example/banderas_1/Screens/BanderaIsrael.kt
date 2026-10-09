package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .weight(0.2f)
                .fillMaxWidth()
                .background(Color.White)
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(colorResource(id = R.color.Azul_Israel))
        )

        Box(
            modifier = Modifier
                .weight(4f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            val blueColor = colorResource(id = R.color.Azul_Israel)
            Canvas(modifier = Modifier.fillMaxSize()) {
                val cx = size.width / 2f
                val cy = size.height / 2f
                val radius = size.minDimension * 0.42f

                val triangleUp = trianglePath(cx, cy, radius, -90f)
                val triangleDown = trianglePath(cx, cy, radius, 90f)

                drawPath(
                    path = triangleUp,
                    color = blueColor,
                    style = Stroke(width = 70f)
                )
                drawPath(
                    path = triangleDown,
                    color = blueColor,
                    style = Stroke(width = 70f)
                )
            }
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(colorResource(id = R.color.Azul_Israel))
        )

        Box(
            modifier = Modifier
                .weight(0.2f)
                .fillMaxWidth()
                .background(Color.White)
        )
    }
}

fun trianglePath(cx: Float, cy: Float, r: Float, rotationDeg: Float): Path {
    val path = Path()
    for (i in 0..2) {
        val angle = Math.toRadians((rotationDeg + i * 120).toDouble())
        val x = cx + r * cos(angle).toFloat()
        val y = cy + r * sin(angle).toFloat()
        if (i == 0) {
            path.moveTo(x, y)
        } else {
            path.lineTo(x, y)
        }
    }
    path.close()
    return path
}

@Preview(showBackground = true)
@Composable
fun BanderaIsraelPreview() {
    BANDERAS_1Theme {
        BanderaIsrael(modifier = Modifier.fillMaxSize())
    }
}