package com.example.banderas_1.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas_1.R
import com.example.banderas_1.ui.theme.BANDERAS_1Theme
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.rojo_turquia))
    ) {
        val canvasRef = createRef()

        Canvas(
            modifier = Modifier.constrainAs(canvasRef) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ) {
            val cy = size.height / 2f
            val rojoFondo = Color(0xFFE30A17)

            val rOut = size.height * 0.22f

            drawCircle(
                color = Color.White,
                radius = rOut,
                center = Offset(size.width * 0.40f, cy)
            )

            drawCircle(
                color = rojoFondo,
                radius = size.height * 0.176f,
                center = Offset(size.width * 0.40f + size.height * 0.066f, cy)
            )


            val starCenter = Offset(size.width * 0.65f, cy)
            val starOuterRadius = size.height * 0.09f
            val starInnerRadius = starOuterRadius * 0.382f

            val starPath = Path()
            val angleOffset = 1f * (PI.toFloat() / 180f)

            for (i in 0 until 10) {
                val radius = if (i % 2 == 0) starOuterRadius else starInnerRadius
                val angle = (i * PI / 5) - (PI / 2) + angleOffset
                val x = starCenter.x + radius * cos(angle).toFloat()
                val y = starCenter.y + radius * sin(angle).toFloat()

                if (i == 0) {
                    starPath.moveTo(x, y)
                } else {
                    starPath.lineTo(x, y)
                }
            }
            starPath.close()

            drawPath(
                path = starPath,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaTurquiaPreview() {
    BANDERAS_1Theme {
        BanderaTurquia(modifier = Modifier.fillMaxSize())
    }
}