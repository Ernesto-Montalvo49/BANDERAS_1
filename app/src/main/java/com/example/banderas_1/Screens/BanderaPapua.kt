package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaPapuaConstraint(modifier: Modifier = Modifier) {
    val rojopapua = colorResource(id = R.color.Rojo_Papua)
    val amarillopapua = colorResource(id = R.color.Amarillo_Papua)

    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(rojopapua)
    ) {
        val (canvas) = createRefs()

        Canvas(
            modifier = Modifier.constrainAs(canvas) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ) {
            val w = size.width
            val h = size.height

            val pathNegro = Path().apply {
                moveTo(0f, 0f)
                lineTo(w, h)
                lineTo(0f, h)
                close()
            }
            drawPath(pathNegro, color = Color.Black)

            val centroAmarilla = Offset(w * 0.25f, h * 0.45f)
            val radioExtAmarilla = h * 0.08f
            val radioIntAmarilla = radioExtAmarilla * 0.45f
            val puntasAmarilla = 6

            val pathAmarilla = Path().apply {
                for (i in 0 until puntasAmarilla * 2) {
                    val r = if (i % 2 == 0) radioExtAmarilla else radioIntAmarilla
                    val angulo = i * Math.PI / puntasAmarilla - Math.PI / 2
                    val x = centroAmarilla.x + (r * cos(angulo)).toFloat()
                    val y = centroAmarilla.y + (r * sin(angulo)).toFloat()

                    if (i == 0) moveTo(x, y) else lineTo(x, y)
                }
                close()
            }
            drawPath(pathAmarilla, color = amarillopapua)

            val estrellasBlancas = listOf(
                Triple(Offset(w * 0.62f, h * 0.18f), h * 0.025f, 5),
                Triple(Offset(w * 0.78f, h * 0.30f), h * 0.025f, 5),
                Triple(Offset(w * 0.70f, h * 0.46f), h * 0.02f, 5),
                Triple(Offset(w * 0.60f, h * 0.60f), h * 0.017f, 5),
                Triple(Offset(w * 0.50f, h * 0.72f), h * 0.01f, 5)
            )

            for ((centro, radioExt, puntas) in estrellasBlancas) {
                val radioInt = radioExt * 0.38f
                val pathEstrella = Path().apply {
                    for (i in 0 until puntas * 2) {
                        val r = if (i % 2 == 0) radioExt else radioInt
                        val angulo = i * Math.PI / puntas - Math.PI / 2
                        val x = centro.x + (r * cos(angulo)).toFloat()
                        val y = centro.y + (r * sin(angulo)).toFloat()

                        if (i == 0) moveTo(x, y) else lineTo(x, y)
                    }
                    close()
                }
                drawPath(pathEstrella, color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaPapuaNuevaGuineaPreview() {
    BANDERAS_1Theme {
        BanderaPapuaConstraint(
            modifier = Modifier.fillMaxSize()
        )
    }
}