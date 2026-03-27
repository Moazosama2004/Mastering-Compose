package com.example.masteringcompose.widgets

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.masteringcompose.styles.contentTextStyle

@Composable
fun PostContent(
    content: String,
    modifier: Modifier = Modifier
) {
    BasicText(
        text = content ,
        modifier = modifier
            .fillMaxWidth(),
        style = contentTextStyle
    )
}

@Preview
@Composable
fun PostContentPreview() {
    PostContent(
        content = "Debuggers are cool and all, but on\nAndroid they have a tendency to break the app if you stay stopped too long "
    )
}