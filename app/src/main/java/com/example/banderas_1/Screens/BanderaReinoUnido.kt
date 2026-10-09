package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun Bandera_Reino_Unido(modifier: Modifier = Modifier) {
    val rojoReino = colorResource(id = R.color.rojo_reino)

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.azul_reino))
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            val grosorDiagonalBlanca = height * 0.1f
            drawLine(
                color = Color.White,
                start = Offset(0f, 0f),
                end = Offset(width, height),
                strokeWidth = grosorDiagonalBlanca
            )
            drawLine(
                color = Color.White,
                start = Offset(width, 0f),
                end = Offset(0f, height),
                strokeWidth = grosorDiagonalBlanca
            )

            val grosorDiagonalRoja = height * 0.05f
            drawLine(
                color = rojoReino,
                start = Offset(0f, 0f),
                end = Offset(width, height),
                strokeWidth = grosorDiagonalRoja
            )
            drawLine(
                color = rojoReino,
                start = Offset(width, 0f),
                end = Offset(0f, height),
                strokeWidth = grosorDiagonalRoja
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.4f)
                .fillMaxHeight(1f)
                .background(Color.White)
        )
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxHeight(0.2f)
                .fillMaxWidth(1f)
                .background(Color.White)
        )
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.2f)
                .fillMaxHeight(1f)
                .background(colorResource(R.color.rojo_reino))
        )
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxHeight(0.1f)
                .fillMaxWidth(1f)
                .background(colorResource(id = R.color.rojo_reino))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Bandera_Reino_UnidoPreview() {
    BANDERAS_1Theme {
        Bandera_Reino_Unido(modifier = Modifier.fillMaxSize())
    }
}