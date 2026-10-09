package com.example.banderas_1.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaMexico(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja, caja1, caja3, escudo_mexico) = createRefs()
        val line1 = createGuidelineFromStart(0.33f)
        val linea2 = createGuidelineFromStart(0.66f)

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Verde_Mexico))
                .constrainAs(caja) {
                    start.linkTo(parent.start)
                    end.linkTo(line1)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(caja1) {
                    start.linkTo(line1)
                    end.linkTo(linea2)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Rojo_Mexico))
                .constrainAs(caja3) {
                    start.linkTo(linea2)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )

        Image(
            painter = painterResource(id = R.drawable.escudo_mexico),
            contentDescription = "Escudo de México",
            modifier = Modifier
                .size(120.dp)
                .constrainAs(escudo_mexico) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaMexicoPreview() {
    BANDERAS_1Theme {
        BanderaMexico(modifier = Modifier.fillMaxSize())
    }
}