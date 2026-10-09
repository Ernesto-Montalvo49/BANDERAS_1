package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaNepal(modifier: Modifier = Modifier) {
    val azulBorde = colorResource(id = R.color.Azul_Nepal)
    val rojoFondo = colorResource(id = R.color.Rojo_Nepal)

    ConstraintLayout(
        modifier = modifier.fillMaxSize()
    ) {
        val (lienzoNepal) = createRefs()

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(lienzoNepal) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val w = size.width
            val h = size.height

            val trianguloArriba = Path().apply {
                moveTo(0f, 0f)
                lineTo(w * 0.95f, h * 0.40f)
                lineTo(0f, h * 0.48f)
                close()
            }

            drawPath(path = trianguloArriba, color = rojoFondo)
            drawPath(
                path = trianguloArriba,
                color = azulBorde,
                style = Stroke(
                    width = w * 0.035f,
                    cap = StrokeCap.Square,
                    join = StrokeJoin.Miter
                )
            )

            val trianguloAbajo = Path().apply {
                moveTo(0f, h * 0.50f)
                lineTo(w * 0.82f, h * 0.62f)
                lineTo(0f, h * 1.0f)
                close()
            }

            drawPath(path = trianguloAbajo, color = rojoFondo)
            drawPath(
                path = trianguloAbajo,
                color = azulBorde,
                style = Stroke(
                    width = w * 0.035f,
                    cap = StrokeCap.Square,
                    join = StrokeJoin.Miter
                )
            )

            val centroLuna = Offset(w * 0.30f, h * 0.24f)
            val radioLuna = w * 0.085f

            val lunaBase = Path().apply {
                addOval(Rect(center = centroLuna, radius = radioLuna))
            }
            val lunaCorte = Path().apply {
                addOval(
                    Rect(
                        center = Offset(centroLuna.x, centroLuna.y - radioLuna * 0.22f),
                        radius = radioLuna * 0.88f
                    )
                )
            }
            val lunaCreciente = Path().apply {
                op(lunaBase, lunaCorte, PathOperation.Difference)
            }
            drawPath(path = lunaCreciente, color = Color.White)

            val radioOrbitaPuntos = radioLuna * 1.45f
            val radioPunto = w * 0.012f
            val numPuntos = 8
            val anguloInicio = -Math.PI * 0.85
            val anguloPaso = (Math.PI * 1.7) / (numPuntos - 1)

            for (i in 0 until numPuntos) {
                val angulo = anguloInicio + i * anguloPaso
                val px = (centroLuna.x + radioOrbitaPuntos * cos(angulo)).toFloat()
                val py = (centroLuna.y + radioOrbitaPuntos * sin(angulo)).toFloat()
                drawCircle(
                    color = Color.White,
                    radius = radioPunto,
                    center = Offset(px, py)
                )
            }

            val centroSol = Offset(w * 0.28f, h * 0.70f)
            val rOuterSol = w * 0.085f
            val rInnerSol = w * 0.040f
            val step12 = Math.PI / 12

            val sol12Path = Path()
            for (i in 0 until 24) {
                val r = if (i % 2 == 0) rOuterSol else rInnerSol
                val angle = i * step12 - Math.PI / 2
                val x = (centroSol.x + r * cos(angle)).toFloat()
                val y = (centroSol.y + r * sin(angle)).toFloat()
                if (i == 0) sol12Path.moveTo(x, y) else sol12Path.lineTo(x, y)
            }
            sol12Path.close()
            drawPath(path = sol12Path, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaNepalPreview() {
    BANDERAS_1Theme {
        BanderaNepal(
            modifier = Modifier.fillMaxSize()
        )
    }
}