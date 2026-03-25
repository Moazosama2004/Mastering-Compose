package com.example.masteringcompose.widgets

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.masteringcompose.style.myStyle

@Composable
fun FirstFoundationComponent() {
    var text by remember{
        mutableStateOf("Hello, World")
    }
    BasicTextField(
        value = text,
        onValueChange = {
            text = it
        },
        textStyle = myStyle
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    FirstFoundationComponent()
}