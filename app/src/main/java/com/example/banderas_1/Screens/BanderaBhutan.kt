package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaBhutan(modifier: Modifier = Modifier) {
    val amarilloButan = colorResource(id = R.color.Amarillo_Butan)

    ConstraintLayout(
        modifier = modifier.fillMaxSize()
    ) {
        val (fondoNaranja, trianguloAmarillo, dragonCentro) = createRefs()

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Naranja_Butan))
                .constrainAs(fondoNaranja) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(trianguloAmarillo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val path = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, 0f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(path = path, color = amarilloButan)
        }

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(dragonCentro) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val w = size.width
            val h = size.height

            val dragonLomo = Path().apply {
                moveTo(w * 0.24f, h * 0.65f)
                quadraticTo(w * 0.32f, h * 0.48f, w * 0.42f, h * 0.57f)
                quadraticTo(w * 0.52f, h * 0.40f, w * 0.61f, h * 0.50f)
                quadraticTo(w * 0.68f, h * 0.36f, w * 0.76f, h * 0.39f)
            }

            drawPath(
                path = dragonLomo,
                color = Color.White,
                style = Stroke(
                    width = w * 0.085f,
                    cap = StrokeCap.Round,
                    join = StrokeJoin.Round
                )
            )

            val centrosEstrellas = listOf(
                Offset(w * 0.30f, h * 0.57f),
                Offset(w * 0.44f, h * 0.55f),
                Offset(w * 0.58f, h * 0.46f),
                Offset(w * 0.71f, h * 0.40f)
            )

            val radius = w * 0.032f

            for (centro in centrosEstrellas) {
                drawCircle(
                    color = Color.White,
                    radius = radius * 1.35f,
                    center = centro
                )

                val starPath = Path()
                val outerRadius = radius * 0.95f
                val innerRadius = radius * 0.42f
                val angleStep = Math.PI / 5

                for (i in 0 until 10) {
                    val r = if (i % 2 == 0) outerRadius else innerRadius
                    val angle = i * angleStep - Math.PI / 2
                    val x = (centro.x + r * cos(angle)).toFloat()
                    val y = (centro.y + r * sin(angle)).toFloat()
                    if (i == 0) starPath.moveTo(x, y) else starPath.lineTo(x, y)
                }
                starPath.close()

                drawPath(path = starPath, color = amarilloButan)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaBhutanPreview() {
    BANDERAS_1Theme {
        BanderaBhutan(modifier = Modifier.fillMaxSize())
    }
}