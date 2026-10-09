package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaNepal(modifier: Modifier = Modifier) {
    val rojoNepal = colorResource(id = R.color.rojo_nepal)
    val azulNepal = colorResource(id = R.color.azul_nepal)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize()) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height

                    val pathTrianguloSupAzul = Path().apply {
                        moveTo(0f, 0f)
                        lineTo(w * 0.90f, h * 0.40f)
                        lineTo(0f, h * 0.48f)
                        close()
                    }
                    drawPath(path = pathTrianguloSupAzul, color = azulNepal)

                    val pathTrianguloSupRojo = Path().apply {
                        moveTo(w * 0.02f, h * 0.02f)
                        lineTo(w * 0.85f, h * 0.39f)
                        lineTo(w * 0.02f, h * 0.46f)
                        close()
                    }
                    drawPath(path = pathTrianguloSupRojo, color = rojoNepal)

                    val pathTrianguloInfAzul = Path().apply {
                        moveTo(0f, h * 0.49f)
                        lineTo(w * 0.80f, h * 0.62f)
                        lineTo(0f, h)
                        close()
                    }
                    drawPath(path = pathTrianguloInfAzul, color = azulNepal)

                    val pathTrianguloInfRojo = Path().apply {
                        moveTo(w * 0.02f, h * 0.51f)
                        lineTo(w * 0.75f, h * 0.63f)
                        lineTo(w * 0.02f, h * 0.98f)
                        close()
                    }
                    drawPath(path = pathTrianguloInfRojo, color = rojoNepal)

                    val lunaCentro = Offset(w * 0.28f, h * 0.25f)
                    val rLuna = w * 0.07f

                    drawCircle(color = Color.White, radius = rLuna, center = lunaCentro)
                    drawCircle(color = rojoNepal, radius = rLuna * 0.82f, center = Offset(lunaCentro.x, lunaCentro.y - rLuna * 0.28f))

                    val nPuntos = 8
                    val rOrbit = rLuna * 1.35f
                    for (i in 0 until nPuntos) {
                        val angle = Math.PI + (i * Math.PI / (nPuntos - 1))
                        val px = (lunaCentro.x + rOrbit * cos(angle)).toFloat()
                        val py = (lunaCentro.y + rOrbit * sin(angle)).toFloat()
                        drawCircle(color = Color.White, radius = w * 0.012f, center = Offset(px, py))
                    }

                    val solCentro = Offset(w * 0.26f, h * 0.70f)
                    val outerR = w * 0.08f
                    val innerR = w * 0.04f
                    val starPath = Path()
                    val p = 12

                    for (i in 0 until p * 2) {
                        val r = if (i % 2 == 0) outerR else innerR
                        val angle = i * Math.PI / p
                        val x = (solCentro.x + r * cos(angle)).toFloat()
                        val y = (solCentro.y + r * sin(angle)).toFloat()
                        if (i == 0) starPath.moveTo(x, y) else starPath.lineTo(x, y)
                    }
                    starPath.close()
                    drawPath(path = starPath, color = Color.White)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaNepalPreview() {
    BANDERAS_1Theme {
        BanderaNepal(modifier = Modifier.fillMaxSize())
    }
}