package com.example.masteringcompose.widgets

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FirstFoundationComponent() {
    BasicText(
        text = "Hello, World"
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    FirstFoundationComponent()
}