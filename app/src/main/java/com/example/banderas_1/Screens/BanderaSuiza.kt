package com.example.banderas_1.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaSuizaConstraint(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .background(colorResource(id = R.color.Rojo_Suiza))
            .fillMaxSize()
    ) {
        val (vertical, horizontal) = createRefs()

        Box(
            modifier = Modifier
                .fillMaxWidth(0.2f)
                .fillMaxHeight(0.62f)
                .background(Color.White)
                .constrainAs(vertical) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Box(
            modifier = Modifier
                .fillMaxWidth(0.62f)
                .fillMaxHeight(0.2f)
                .background(Color.White)
                .constrainAs(horizontal) {
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
fun BanderaSuizaConstrainPreview() {
    BANDERAS_1Theme {
        BanderaSuizaConstraint(modifier = Modifier.fillMaxSize())
    }
}