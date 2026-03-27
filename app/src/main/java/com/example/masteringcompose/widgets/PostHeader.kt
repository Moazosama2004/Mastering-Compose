package com.example.masteringcompose.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.masteringcompose.R
import com.example.masteringcompose.styles.subtitleTextStyle
import com.example.masteringcompose.styles.titleTextStyle

@Composable
fun PostHeader(
    publisherName : String,
    profileImage : Painter,
    postDate : String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Avatar(
            profileImage = profileImage
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            BasicText(
                text = publisherName,
                style = titleTextStyle
            )

            BasicText(
                text = postDate,
                style = subtitleTextStyle
            )
        }

    }
}

@Preview
@Composable
fun PostHeaderPreview(){
    PostHeader(
        publisherName = "Muaz Osama",
        profileImage = painterResource(R.drawable.avatar),
        postDate = "12 Jun 2026, 3:12 PM",
    )
}