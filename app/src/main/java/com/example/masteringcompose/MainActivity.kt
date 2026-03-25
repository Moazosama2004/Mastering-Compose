package com.example.masteringcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.masteringcompose.ui.theme.MasteringComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // STATES
            var stringState by remember { mutableStateOf("Hello")}

            // UI
            Column(
                modifier = Modifier.padding(92.dp)
            ) {
                Button(
                    onClick = {
                        stringState= "Hello, World"
                    }
                ) {
                    Text("Click Me")
                }
                FirstCompose(stringState)
            }
        }
    }
}

@Composable
fun FirstCompose(
    state : String
) {
    Text(
        text = state
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun preview() {
    FirstCompose("Test")
}