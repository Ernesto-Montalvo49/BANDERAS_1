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
fun BanderaAlemania(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja1, caja2, caja3) = createRefs()
        val linea1 = createGuidelineFromTop(0.333f)
        val linea2 = createGuidelineFromTop(0.666f)

        Box(
            modifier = Modifier
                .background(Color.Black)
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
                .background(colorResource(id = R.color.Rojo_Aleman))
                .constrainAs(caja2) {
                    top.linkTo(linea1)
                    bottom.linkTo(linea2)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Amarillo_Aleman))
                .constrainAs(caja3) {
                    top.linkTo(linea2)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaAlemaniaPreview() {
    BANDERAS_1Theme {
        BanderaAlemania(modifier = Modifier.fillMaxSize())
    }
}