package com.saher.simpletextcomposeapp

import android.app.Application
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentComposer
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saher.simpletextcomposeapp.ui.theme.SimpleTextComposeAppTheme
import kotlin.coroutines.coroutineContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleTextComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    //GreetingText("Android")
                    GreetingText("world")

                }
            }
        }
    }
}

/**
 * The order of setting the modifiers matters.
 */
@Composable
fun GreetingText(name: String) {
    val context = LocalContext.current
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .clickable { }
            .padding(all= 24.dp)
            .width(190.dp)
            .height(190.dp)
        //.size(80.dp) --> square
        //.size(width = 80.dp, height = 80.dp)
    ,
        style = MaterialTheme.typography.h3,
        fontWeight = FontWeight.SemiBold
        /**
        TextStyle(
        color = Color.Blue,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
        )
         */
    )
}


@Preview(
    showBackground = true,
)
@Composable
fun DefaultPreview() {
    SimpleTextComposeAppTheme {
        GreetingText("world")
    }
}