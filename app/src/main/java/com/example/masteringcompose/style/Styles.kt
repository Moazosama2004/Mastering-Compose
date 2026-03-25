package com.example.masteringcompose.style

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.masteringcompose.R

val myFontFamily = FontFamily(
    Font(R.font.fjallaone_regular , FontWeight.Normal)
)
val myStyle = TextStyle(
    color = Color.Red,
    fontStyle = FontStyle.Italic,
    fontSize = 32.sp ,
    fontFamily = myFontFamily
)