package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
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
fun BanderaCubaConstraint(modifier: Modifier = Modifier) {
    val azulCuba = colorResource(id = R.color.Azul_Cuba)
    val rojoCuba = colorResource(id = R.color.Rojo_Cuba)

    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
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
            val band = h / 5f

            for (i in 0 until 5) {
                if (i % 2 == 0) {
                    drawRect(
                        color = azulCuba,
                        topLeft = Offset(0f, i * band),
                        size = Size(w, band)
                    )
                }
            }

            val triWidth = w * 0.38f
            val trianglePath = Path().apply {
                moveTo(0f, 0f)
                lineTo(triWidth, h / 2f)
                lineTo(0f, h)
                close()
            }
            drawPath(trianglePath, color = rojoCuba)

            val centroEstrellaX = triWidth * 0.38f
            val centroEstrellaY = h / 2f
            val radioExt = band * 0.45f
            val radioInt = radioExt * 0.38f

            val estrellaPath = Path().apply {
                val numPuntas = 5
                for (i in 0 until numPuntas * 2) {
                    val r = if (i % 2 == 0) radioExt else radioInt
                    val angulo = i * Math.PI / numPuntas - Math.PI / 2
                    val x = centroEstrellaX + (r * cos(angulo)).toFloat()
                    val y = centroEstrellaY + (r * sin(angulo)).toFloat()

                    if (i == 0) moveTo(x, y) else lineTo(x, y)
                }
                close()
            }
            drawPath(estrellaPath, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaCubaConstraintPreview() {
    BANDERAS_1Theme {
        BanderaCubaConstraint(modifier = Modifier.fillMaxSize())
    }
}