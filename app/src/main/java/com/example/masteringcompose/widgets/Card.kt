package com.example.masteringcompose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.masteringcompose.R

@Composable
fun Card(
    modifier: Modifier = Modifier,
    background : Color = Color.White,
    shape : Shape = RoundedCornerShape(24.dp),
    content: @Composable () -> Unit ,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape)
            .background(color = background)
            .border(
                width = 1.dp,
                color = Color.Black.copy(0.08f),
                shape = shape
            )

    ) {
        content
    }
}