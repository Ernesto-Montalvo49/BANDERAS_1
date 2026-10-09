package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaIsraelConstraint(modifier: Modifier = Modifier) {
    val azulIsrael = colorResource(id = R.color.Azul_Israel)

    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val (caja1, caja2, estrella) = createRefs()
        val linea1 = createGuidelineFromTop(0.15f)
        val linea2 = createGuidelineFromTop(0.85f)

        Box(
            modifier = Modifier
                .background(azulIsrael)
                .constrainAs(caja1) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    bottom.linkTo(linea1)
                    start.linkTo(parent.start)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(azulIsrael)
                .constrainAs(caja2) {
                    top.linkTo(linea2)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Canvas(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .aspectRatio(1f)
                .constrainAs(estrella) {
                    top.linkTo(linea1)
                    bottom.linkTo(linea2)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            val w = size.width
            val h = size.height
            val grosor = h * 0.08f

            val trianguloArriba = Path().apply {
                moveTo(w / 2f, 0f)
                lineTo(w, h * 0.75f)
                lineTo(0f, h * 0.75f)
                close()
            }

            val trianguloAbajo = Path().apply {
                moveTo(0f, h * 0.25f)
                lineTo(w, h * 0.25f)
                lineTo(w / 2f, h)
                close()
            }

            drawPath(
                path = trianguloArriba,
                color = azulIsrael,
                style = Stroke(width = grosor)
            )

            drawPath(
                path = trianguloAbajo,
                color = azulIsrael,
                style = Stroke(width = grosor)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaIsraelConstraintPreview() {
    BANDERAS_1Theme {
        BanderaIsraelConstraint(modifier = Modifier.fillMaxSize())
    }
}