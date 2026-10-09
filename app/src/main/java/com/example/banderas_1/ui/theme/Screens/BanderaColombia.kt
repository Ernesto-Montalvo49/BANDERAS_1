package com.example.banderas_1.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaColombia(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja1, caja2, caja3) = createRefs()
        val linea1 = createGuidelineFromTop(0.50f)
        val linea2 = createGuidelineFromTop(0.75f)

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Amarillo_Colombia))
                .constrainAs(caja1) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    bottom.linkTo(linea1)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Azul_Colombia))
                .constrainAs(caja2) {
                    top.linkTo(linea1)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    bottom.linkTo(linea2)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Rojo_Colombia))
                .constrainAs(caja3) {
                    top.linkTo(linea2)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaColombiaPreview() {
    BANDERAS_1Theme {
        BanderaColombia(modifier = Modifier.fillMaxSize())
    }
}