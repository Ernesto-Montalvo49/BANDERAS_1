package com.example.banderas_1.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaEspana(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja1, caja2, caja3, escudo_espana) = createRefs()
        val linea1 = createGuidelineFromTop(0.25f)
        val linea2 = createGuidelineFromTop(0.75f)

        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.Rojo_Espana))
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
                .background(colorResource(id = R.color.Amarillo_Espana))
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
                .background(colorResource(id = R.color.Rojo_Espana))
                .constrainAs(caja3) {
                    top.linkTo(linea2)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )
        Image(
            painter = painterResource(id = R.drawable.escudo_espana),
            contentDescription = "Escudo de España",
            modifier = Modifier
                .size(200.dp)
                .constrainAs(escudo_espana) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    horizontalBias = 0.2f
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaPreview() {
    BANDERAS_1Theme {
        BanderaEspana(modifier = Modifier.fillMaxSize())
    }
}