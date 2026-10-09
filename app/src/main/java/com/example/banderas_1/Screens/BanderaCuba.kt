package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaCuba(modifier: Modifier = Modifier) {
    val azulCuba = colorResource(id = R.color.azul_cuba)
    val rojoCuba = colorResource(id = R.color.rojo_cuba)

    Canvas(modifier = modifier.fillMaxSize()) {
        val band = size.height / 5f

        for (i in 0 until 5) {
            if (i % 2 == 0) {
                drawRect(
                    color = azulCuba,
                    topLeft = Offset(0f, i * band),
                    size = Size(size.width, band)
                )
            }
        }

        val triWidth = size.width * 0.38f
        val trianglePath = Path().apply {
            moveTo(0f, 0f)
            lineTo(triWidth, size.height / 2f)
            lineTo(0f, size.height)
            close()
        }
        drawPath(path = trianglePath, color = rojoCuba)

        val starCenterX = triWidth * 0.38f
        val starCenterY = size.height / 2f
        val starRadius = size.minDimension * 0.08f
        val starPath = createStarPath(starCenterX, starCenterY, starRadius)

        drawPath(
            path = starPath,
            color = Color.White
        )
    }
}

fun createStarPath(cx: Float, cy: Float, radius: Float): Path {
    val path = Path()
    val numPoints = 5
    val degreesPerPoint = 360f / numPoints
    val halfDegreesPerPoint = degreesPerPoint / 2f

    val innerRadius = radius * 0.382f
    for (i in 0 until numPoints * 2) {
        val angleDeg = -90f + (i * halfDegreesPerPoint)
        val angleRad = Math.toRadians(angleDeg.toDouble()).toFloat()

        val r = if (i % 2 == 0) radius else innerRadius

        val x = cx + r * kotlin.math.cos(angleRad)
        val y = cy + r * kotlin.math.sin(angleRad)

        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}

@Preview(showBackground = true)
@Composable
fun BanderaCubaPreview() {
    BANDERAS_1Theme {
        BanderaCuba(modifier = Modifier.fillMaxSize())
    }
}