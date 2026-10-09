package com.example.banderas_1.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun FrutaG(modifier: Modifier = Modifier) {
    val _0 = Color.Transparent
    val B = colorResource(id = R.color.Pixel_Fondo_Claro)
    val K = colorResource(id = R.color.Pixel_Negro_Borde)
    val M = colorResource(id = R.color.Pixel_Morado_Base)
    val L = colorResource(id = R.color.Pixel_Morado_Luz)
    val D = colorResource(id = R.color.Pixel_Morado_Sombra)
    val G = colorResource(id = R.color.Pixel_Verde_Tallo)

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(B)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .aspectRatio(1f)
        ) {
            // Fila 0
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(5) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(6) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0))
                repeat(10) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(G)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(G)) }
                repeat(5) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(G)) }
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(6) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(5) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(6) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(G)) }
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(G))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(5) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                repeat(6) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(G)) }
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(7) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(9) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(L))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(L))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(M))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(M))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(M))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(M))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(L)) }
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            // Fila 13
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(L))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(M))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(M))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(D))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(D))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0))
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(4) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(5) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(M)) }
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                Box(modifier = Modifier.weight(1f).fillMaxSize().background(K))
                repeat(6) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(3) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(6) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(D)) }
                repeat(2) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(7) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(5) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
                repeat(6) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(K)) }
                repeat(9) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
            Row(modifier = Modifier.weight(1f).fillMaxWidth()) {
                repeat(20) { Box(modifier = Modifier.weight(1f).fillMaxSize().background(_0)) }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FrutaGPreview() {
    BANDERAS_1Theme {
        FrutaG(modifier = Modifier.fillMaxSize())
    }
}