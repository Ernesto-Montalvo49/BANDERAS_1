package com.example.banderas_1.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

val EstrellaEEUUShape = GenericShape { size, _ ->
    val cx = size.width / 2f
    val cy = size.height / 2f
    val outerRadius = size.width / 2f
    val innerRadius = outerRadius * 0.4f
    val angle = Math.PI / 5

    for (i in 0 until 10) {
        val r = if (i % 2 == 0) outerRadius else innerRadius
        val x = cx + r * Math.sin(i * angle).toFloat()
        val y = cy - r * Math.cos(i * angle).toFloat()
        if (i == 0) moveTo(x, y) else lineTo(x, y)
    }
    close()
}

@Composable
fun BanderaEEUU(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            repeat(13) { index ->
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(
                            colorResource(
                                id = if (index % 2 == 0) R.color.rojo_eeuu else R.color.white
                            )
                        )
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(0.4f)
                .fillMaxHeight(0.538f)
                .background(colorResource(id = R.color.azul_eeuu))
                .padding(vertical = 4.dp, horizontal = 2.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                repeat(5) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        repeat(6) {
                            Box(
                                modifier = Modifier
                                    .size(16.dp)
                                    .clip(EstrellaEEUUShape)
                                    .background(Color.White)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEEUUPreview() {
    BANDERAS_1Theme {
        BanderaEEUU()
    }
}