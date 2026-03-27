package com.example.masteringcompose.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.masteringcompose.R

@Composable
fun PostCard(
    post: Painter,
    profileImage: Painter,
    publisherName: String,
    content : String,
    postDate : String,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(color = Color.White)
            .border(
                width = 1.dp,
                color = Color.Black.copy(0.08f),
                shape = RoundedCornerShape(24.dp)
            )

    ) {
        PostHeader(
            publisherName = publisherName,
            profileImage = profileImage ,
            postDate = postDate
        )

        PostContent(
            content = content,
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .padding(top = 4.dp, bottom = 12.dp),
        )

        Image(
            painter = post,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(post.intrinsicSize.width / post.intrinsicSize.height),
            contentScale = ContentScale.FillWidth,
            contentDescription = stringResource(R.string.avatar_image),
        )
    }
}


@Preview
@Composable
fun PostCardPreview() {
    PostCard(
        publisherName = "Muaz Osama",
        profileImage = painterResource(R.drawable.avatar),
        content = "Debuggers are cool and all, but on\nAndroid they have a tendency to break the app if you stay stopped too long ",
        postDate = "12 Jun 2026, 3:12 PM",
        post = painterResource(R.drawable.post),
    )
}