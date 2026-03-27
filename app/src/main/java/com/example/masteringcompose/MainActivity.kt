package com.example.masteringcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.masteringcompose.widgets.PostCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier.fillMaxSize().padding(
                    16.dp
                ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                PostCard(
                    publisherName = "Muaz Osama",
                    profileImage = painterResource(R.drawable.avatar),
                    content = "Debuggers are cool and all, but on\nAndroid they have a tendency to break the app if you stay stopped too long ",
                    postDate = "12 Jun 2026, 3:12 PM",
                    post = painterResource(R.drawable.post),
                )
            }
        }
    }
}


