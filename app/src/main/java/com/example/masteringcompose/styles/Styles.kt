package com.example.masteringcompose.styles

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


val titleTextStyle = TextStyle(
    fontSize = 16.sp,
    fontWeight = FontWeight.Medium,
    color = Color.Black.copy(0.87f)
)

val subtitleTextStyle = TextStyle(
    fontSize = 12.sp,
    color = Color.Black.copy(0.60f)
)


val contentTextStyle = TextStyle(
    fontSize = 14.sp,
    color = Color.Black.copy(0.66f)
)