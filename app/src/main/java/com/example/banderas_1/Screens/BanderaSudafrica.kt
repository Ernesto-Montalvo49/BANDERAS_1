package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaSudafrica(modifier: Modifier = Modifier) {
    val verdeSudafrica = colorResource(id = R.color.Verde_Sudafrica)
    val azulSudafrica = colorResource(id = R.color.Azul_Sudafrica)
    val amarilloSudafrica = colorResource(id = R.color.Amarillo_Sudafrica)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize()) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val width = size.width
                    val height = size.height

                    drawRect(
                        color = azulSudafrica,
                        topLeft = Offset(0f, 0f),
                        size = Size(width, height / 2f)
                    )
                    drawRect(
                        color = amarilloSudafrica,
                        topLeft = Offset(0f, height / 2f),
                        size = Size(width, height / 2f)
                    )

                    val grosorDiagonalBlanca = height * 0.18f
                    val grosorDiagonalVerde = height * 0.10f

                    drawLine(
                        color = Color.White,
                        start = Offset(width * 0.2f, height * 0.5f),
                        end = Offset(width, 0f),
                        strokeWidth = grosorDiagonalBlanca
                    )
                    drawLine(
                        color = Color.White,
                        start = Offset(width * 0.2f, height * 0.5f),
                        end = Offset(width, height),
                        strokeWidth = grosorDiagonalBlanca
                    )

                    val pathBlancoFrontal = Path().apply {
                        moveTo(0f, 0f)
                        lineTo(width * 0.45f, height * 0.5f)
                        lineTo(0f, height)
                        close()
                    }
                    drawPath(path = pathBlancoFrontal, color = Color.White)

                    drawLine(
                        color = verdeSudafrica,
                        start = Offset(width * 0.2f, height * 0.5f),
                        end = Offset(width, 0f),
                        strokeWidth = grosorDiagonalVerde
                    )
                    drawLine(
                        color = verdeSudafrica,
                        start = Offset(width * 0.2f, height * 0.5f),
                        end = Offset(width, height),
                        strokeWidth = grosorDiagonalVerde
                    )

                    val pathVerdeFrontal = Path().apply {
                        moveTo(0f, height * 0.08f)
                        lineTo(width * 0.38f, height * 0.5f)
                        lineTo(0f, height * 0.92f)
                        close()
                    }
                    drawPath(path = pathVerdeFrontal, color = verdeSudafrica)

                    val pathNegro = Path().apply {
                        moveTo(0f, height * 0.18f)
                        lineTo(width * 0.28f, height * 0.5f)
                        lineTo(0f, height * 0.82f)
                        close()
                    }
                    drawPath(path = pathNegro, color = Color.Black)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaSudafricaPreview() {
    BANDERAS_1Theme {
        BanderaSudafrica(modifier = Modifier.fillMaxSize())
    }
}