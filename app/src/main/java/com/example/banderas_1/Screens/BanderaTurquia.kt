package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaTurquiaConstraint(modifier: Modifier = Modifier) {
    val rojoTurquia = colorResource(id = R.color.Rojo_Turquia)

    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(rojoTurquia)
    ) {
        val (emblema) = createRefs()

        Canvas(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .aspectRatio(1f)
                .constrainAs(emblema) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    val horizontalBias = 0.42f
                }
        ) {
            val w = size.width
            val h = size.height
            val centroLunaX = w * 0.35f
            val centroLunaY = h * 0.50f
            val radioLunaExterior = h * 0.30f
            val radioLunaInterior = h * 0.24f

            drawCircle(
                color = Color.White,
                radius = radioLunaExterior,
                center = Offset(centroLunaX, centroLunaY)
            )

            drawCircle(
                color = rojoTurquia,
                radius = radioLunaInterior,
                center = Offset(centroLunaX + (radioLunaExterior * 0.28f), centroLunaY)
            )

            val centroEstrellaX = centroLunaX + (radioLunaExterior * 0.75f)
            val centroEstrellaY = centroLunaY
            val radioExtEstrella = h * 0.12f
            val radioIntEstrella = radioExtEstrella * 0.38f

            val pathEstrella = Path().apply {
                val numPuntas = 5
                for (i in 0 until numPuntas * 2) {
                    val r = if (i % 2 == 0) radioExtEstrella else radioIntEstrella
                    val angulo = i * Math.PI / numPuntas - Math.PI / 2
                    val x = centroEstrellaX + (r * cos(angulo)).toFloat()
                    val y = centroEstrellaY + (r * sin(angulo)).toFloat()

                    if (i == 0) moveTo(x, y) else lineTo(x, y)
                }
                close()
            }

            drawPath(pathEstrella, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaTurquiaConstraintPreview() {
    BANDERAS_1Theme {
        BanderaTurquiaConstraint(modifier = Modifier.fillMaxSize())
    }
}