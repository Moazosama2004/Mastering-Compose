package com.example.masteringcompose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masteringcompose.R

@Composable
fun Avatar (
    profileImage : Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = profileImage,
        modifier = modifier
            .size(48.dp)
            .clip(RoundedCornerShape(12.dp)),
        contentDescription = stringResource(R.string.avatar_image),
        contentScale = ContentScale.Crop,
        alignment = Alignment.TopStart
    )
}

@Preview
@Composable
fun AvatarPreview() {
    Avatar(
        profileImage = painterResource(R.drawable.avatar),
    )
}