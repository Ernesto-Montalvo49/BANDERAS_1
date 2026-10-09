package com.example.banderas_1.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme

@Composable
fun BanderaEspana(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(colorResource(id = R.color.rojo_espana))
        )

        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(colorResource(id = R.color.amarillo_espana)),
            contentAlignment = Alignment.CenterStart
        ) {
            Image(
                painter = painterResource(id = R.drawable.escudo_espana),
                contentDescription = "Escudo de Espana",
                modifier = Modifier
                    .padding(start = 40.dp)
                    .size(200.dp)
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(colorResource(id = R.color.rojo_espana))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspanaPreview() {
    BANDERAS_1Theme {
        BanderaEspana()
    }
}