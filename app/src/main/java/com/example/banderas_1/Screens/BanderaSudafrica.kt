package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    val verdeSudafrica = colorResource(R.color.Verde_Sudafrica)

    ConstraintLayout(
        modifier = modifier.fillMaxSize()
    ) {
        val linea1 = createGuidelineFromTop(0.5f)

        val (caja1, caja2, trianguloNegro, trianguloVerde, trianguloBlanco, diagonal1, diagonal2, diagonal3, diagonal4) = createRefs()

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Azul_Sudafrica))
                .constrainAs(caja1) {
                    top.linkTo(parent.top)
                    bottom.linkTo(linea1)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Amarillo_Sudafrica))
                .constrainAs(caja2) {
                    top.linkTo(linea1)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .height(1200.dp)
                .width(110.dp)
                .rotate(32f)
                .background(Color.White)
                .constrainAs(diagonal1) { centerTo(parent) }
        )

        Box(
            modifier = Modifier
                .height(1200.dp)
                .width(110.dp)
                .rotate(-32f)
                .background(Color.White)
                .constrainAs(diagonal2) { centerTo(parent) }
        )

        Canvas(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.7f)
                .constrainAs(trianguloBlanco) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            val path = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(path = path, color = Color.White)
        }

        Canvas(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.6f)
                .constrainAs(trianguloVerde) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            val path = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(path = path, color = verdeSudafrica)
        }

        Box(
            modifier = Modifier
                .height(1200.dp)
                .width(70.dp)
                .rotate(32f)
                .background(verdeSudafrica)
                .constrainAs(diagonal3) { centerTo(parent) }
        )

        Box(
            modifier = Modifier
                .height(1200.dp)
                .width(70.dp)
                .rotate(-32f)
                .background(verdeSudafrica)
                .constrainAs(diagonal4) { centerTo(parent) }
        )

        Canvas(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.42f)
                .constrainAs(trianguloNegro) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            val path = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(path = path, color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSudafricaPreview() {
    BANDERAS_1Theme {
        BanderaSudafrica(modifier = Modifier.fillMaxSize())
    }
}