package com.example.banderas_1.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaReinoUnido(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .clipToBounds()
            .fillMaxSize()
            .background(colorResource(id = R.color.Azul_Reino))
    ) {
        val linea1 = createGuidelineFromStart(0.35f)
        val linea2 = createGuidelineFromStart(0.42f)
        val linea3 = createGuidelineFromStart(0.58f)
        val linea4 = createGuidelineFromStart(0.65f)

        val linea5 = createGuidelineFromTop(0.45f)
        val linea6 = createGuidelineFromTop(0.48f)
        val linea7 = createGuidelineFromTop(0.56f)
        val linea8 = createGuidelineFromTop(0.60f)

        val (caja1, caja2, caja3, caja4, diagonal1, diagonal2, diagonal3, diagonal4) = createRefs()

        Box(
            modifier = Modifier
                .height(1000.dp)
                .width(85.dp)
                .rotate(25f)
                .background(Color.White)
                .constrainAs(diagonal1) { centerTo(parent) }
        )

        Box(
            modifier = Modifier
                .height(1100.dp)
                .width(85.dp)
                .rotate(-25f)
                .background(Color.White)
                .constrainAs(diagonal2) { centerTo(parent) }
        )

        Box(
            modifier = Modifier
                .height(1100.dp)
                .width(55.dp)
                .rotate(-25f)
                .background(colorResource(id = R.color.Rojo_Reino))
                .constrainAs(diagonal3) { centerTo(parent) }
        )

        Box(
            modifier = Modifier
                .height(1100.dp)
                .width(55.dp)
                .rotate(25f)
                .background(colorResource(id = R.color.Rojo_Reino))
                .constrainAs(diagonal4) { centerTo(parent) }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(caja1) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(linea1)
                    end.linkTo(linea4)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(caja3) {
                    top.linkTo(linea5)
                    bottom.linkTo(linea8)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Rojo_Reino))
                .constrainAs(caja4) {
                    top.linkTo(linea6)
                    bottom.linkTo(linea7)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Rojo_Reino))
                .constrainAs(caja2) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(linea2)
                    end.linkTo(linea3)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaReinoUnidoPreview() {
    BANDERAS_1Theme {
        BanderaReinoUnido(modifier = Modifier.fillMaxSize())
    }
}