package com.example.banderas_1.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
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
fun BanderaSuiza(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .aspectRatio(1f)
            .background(colorResource(id = R.color.rojo_suiza))
    ) {
        val (cruzVertical, cruzHorizontal) = createRefs()

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(cruzVertical) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.percent(0.20f)
                    height = Dimension.percent(0.62f)
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(cruzHorizontal) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    width = Dimension.percent(0.62f)
                    height = Dimension.percent(0.20f)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSuizaPreview() {
    BANDERAS_1Theme {
        BanderaSuiza(modifier = Modifier.fillMaxSize())
    }
}