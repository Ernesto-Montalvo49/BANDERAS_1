package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaPapuaNuevaGuinea(modifier: Modifier = Modifier) {
    val rojoColor = colorResource(id = R.color.Rojo_Papua)
    val amarilloColor = colorResource(id = R.color.Amarillo_Papua)

    Canvas(modifier = modifier.fillMaxSize()) {
        val width = size.width
        val height = size.height

        drawRect(color = Color.Black)

        val pathRojo = Path().apply {
            moveTo(0f, 0f)
            lineTo(width, 0f)
            lineTo(width, height)
            close()
        }
        drawPath(path = pathRojo, color = rojoColor)

        fun drawStar(centerX: Float, centerY: Float, outerRadius: Float, color: Color) {
            val starPath = Path()
            val innerRadius = outerRadius * 0.382f
            for (i in 0 until 10) {
                val r = if (i % 2 == 0) outerRadius else innerRadius
                val angle = (i * PI / 5) - (PI / 2)
                val x = centerX + r * cos(angle).toFloat()
                val y = centerY + r * sin(angle).toFloat()
                if (i == 0) starPath.moveTo(x, y) else starPath.lineTo(x, y)
            }
            starPath.close()
            drawPath(path = starPath, color = color)
        }

        drawStar(width * 0.35f, height * 0.58f, height * 0.040f, Color.White)
        drawStar(width * 0.15f, height * 0.65f, height * 0.040f, Color.White)

        drawStar(width * 0.25f, height * 0.30f, height * 0.09f, amarilloColor)

        drawStar(width * 0.62f, height * 0.18f, height * 0.035f, Color.White)
        drawStar(width * 0.78f, height * 0.30f, height * 0.035f, Color.White)
        drawStar(width * 0.70f, height * 0.48f, height * 0.030f, Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaPapuaNuevaGuineaPreview() {
    BANDERAS_1Theme {
        BanderaPapuaNuevaGuinea(modifier = Modifier.fillMaxSize())
    }
}