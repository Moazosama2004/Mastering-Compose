package com.example.masteringcompose.widgets

import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.input.VisualTransformation.Companion
import androidx.compose.ui.tooling.preview.Preview


// +20 155 3850 440
@Composable
fun FirstFoundationComponent() {
    var phoneNo by remember { mutableStateOf("") };

    BasicTextField(
        value = phoneNo,
        onValueChange = {
            phoneNo = it;
        },
        visualTransformation =  PasswordVisualTransformation()
    )


}

@Preview(showBackground = true)
@Composable
fun Preview() {
    FirstFoundationComponent()
}