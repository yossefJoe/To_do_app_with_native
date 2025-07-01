package com.example.practice1.onBoarding.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.drawscope.Fill

@Composable
fun WaveShape(
    modifier: Modifier = Modifier,
    waveColor: Color = Color(0xFFFF5E5E) // red from your image
) {
    Canvas(modifier = modifier) {
        val width = size.width
        val height = size.height

        val path = Path().apply {
            moveTo(0f, height * 0.2f)
            quadraticBezierTo(
                width * 0.25f, height * 0.1f,
                width * 0.5f, height * 0.2f
            )
            quadraticBezierTo(
                width * 0.75f, height * 0.3f,
                width, height * 0.2f
            )
            lineTo(width, height)
            lineTo(0f, height)
            close()
        }

        drawPath(
            path = path,
            color = waveColor,
            style = Fill
        )
    }
}
