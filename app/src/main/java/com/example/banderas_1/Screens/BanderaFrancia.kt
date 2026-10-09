package com.example.banderas_1.Screens

import androidx.compose.ui.graphics.Color
import com.example.banderas_1.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas_1.ui.theme.BANDERAS_1Theme


@Composable
fun BanderaFrancia(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(colorResource(id = R.color.azul_francia))
        )

        Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color.White)
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(colorResource(id = R.color.rojo_francia))
        )


    }
}

@Preview(showBackground = true)
@Composable
fun BanderaFranciaPreview() {
    BANDERAS_1Theme {
        BanderaFrancia()
    }
}