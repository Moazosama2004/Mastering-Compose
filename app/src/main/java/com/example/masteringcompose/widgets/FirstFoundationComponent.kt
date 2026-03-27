package com.example.masteringcompose.widgets

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.masteringcompose.style.myStyle

@Composable
fun FirstFoundationComponent() {
    BasicText(
        text = buildAnnotatedString {
            withStyle(SpanStyle(color = Color.Blue)) {
                append("@Muaz")
            }

            withStyle(SpanStyle(color = Color.Black)) {
                append(" Good Morning..❤️")
            }
        },
        style = myStyle
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    FirstFoundationComponent()
}