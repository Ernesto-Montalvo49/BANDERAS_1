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

@Composable
fun BanderaSeychellesConstraint(modifier: Modifier = Modifier) {
    val azulSeychelles = colorResource(id = R.color.Azul_Seychelles)
    val amarilloSeychelles = colorResource(id = R.color.Amarillo_Seychelles)
    val rojoSeychelles = colorResource(id = R.color.Rojo_Seychelles)
    val verdeSeychelles = colorResource(id = R.color.Verde_Seychelles)

    ConstraintLayout(
        modifier = modifier.background(Color.White)
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

            val origin = Offset(0f, h)

            val top1_3 = Offset(w / 3f, 0f)
            val top2_3 = Offset(w * 2f / 3f, 0f)
            val topRight = Offset(w, 0f)
            val right1_3 = Offset(w, h / 3f)
            val right2_3 = Offset(w, h * 2f / 3f)
            val bottomRight = Offset(w, h)

            val pathAzul = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(0f, 0f)
                lineTo(top1_3.x, top1_3.y)
                close()
            }
            drawPath(pathAzul, color = azulSeychelles)

            val pathAmarillo = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(top1_3.x, top1_3.y)
                lineTo(top2_3.x, top2_3.y)
                close()
            }
            drawPath(pathAmarillo, color = amarilloSeychelles)

            val pathRojo = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(top2_3.x, top2_3.y)
                lineTo(topRight.x, topRight.y)
                lineTo(right1_3.x, right1_3.y)
                close()
            }
            drawPath(pathRojo, color = rojoSeychelles)

            val pathBlanco = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(right1_3.x, right1_3.y)
                lineTo(right2_3.x, right2_3.y)
                close()
            }
            drawPath(pathBlanco, color = Color.White)

            val pathVerde = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(right2_3.x, right2_3.y)
                lineTo(bottomRight.x, bottomRight.y)
                close()
            }
            drawPath(pathVerde, color = verdeSeychelles)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSeychellesPreview() {
    BANDERAS_1Theme {
        BanderaSeychellesConstraint(modifier = Modifier.fillMaxSize())
    }
}