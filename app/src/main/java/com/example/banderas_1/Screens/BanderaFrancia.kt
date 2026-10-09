package com.example.banderas_1.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaFrancia(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja1, caja2, caja3) = createRefs()
        val linea1 = createGuidelineFromStart(0.33f)
        val linea2 = createGuidelineFromStart(0.66f)

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.azul_francia))
                .constrainAs(caja1) {
                    start.linkTo(parent.start)
                    end.linkTo(linea1)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                    verticalBias = 0.33f
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(caja2) {
                    start.linkTo(linea1)
                    end.linkTo(linea2)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.rojo_francia))
                .constrainAs(caja3) {
                    start.linkTo(linea2)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaFranciaPreview() {
    BANDERAS_1Theme {
        BanderaFrancia(modifier = Modifier.fillMaxSize())
    }
}