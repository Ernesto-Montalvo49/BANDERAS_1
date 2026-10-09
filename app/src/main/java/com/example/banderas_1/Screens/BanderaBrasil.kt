package com.example.banderas_1.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

val RomboShape = GenericShape { size, _ ->
    moveTo(size.width / 2f, 0f)
    lineTo(size.width, size.height / 2f)
    lineTo(size.width / 2f, size.height)
    lineTo(0f, size.height / 2f)
    close()
}

@Composable
fun BanderaBrasil(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.verde_brasil))
    ) {
        val (rombo, circulo) = createRefs()

        Box(
            modifier = Modifier
                .size(width = 340.dp, height = 220.dp)
                .clip(RomboShape)
                .background(colorResource(id = R.color.amarillo_brasil))
                .constrainAs(rombo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    horizontalBias = 0.5f
                    verticalBias = 0.5f
                }
        )

        Box(
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .background(colorResource(id = R.color.azul_brasil))
                .constrainAs(circulo) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaBrasilPreview() {
    BANDERAS_1Theme {
        BanderaBrasil(modifier = Modifier.fillMaxSize())
    }
}