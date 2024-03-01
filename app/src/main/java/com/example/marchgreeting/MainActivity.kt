package com.example.marchgreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marchgreeting.ui.theme.MarchGreetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarchGreetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        BirthdayGreetings("Valdis", 28.sp)
                        Greeting("RTU Students")
                    }

                }
            }
        }
    }
}

@Composable
fun BirthdayGreetings(name: String, fontSize: TextUnit = 28.sp) {
    Surface(color = Color.Yellow) {
        Text(
            text = "Happy Birthday $name!",
            fontSize = fontSize,
            modifier = Modifier.padding(32.dp)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Magenta) {
        Text(
            text = "How are you $name?",
            modifier = modifier.padding(24.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MarchGreetingTheme {
        Greeting("RTU")
    }
}

//lets make preview for BirthdayGreetings
@Preview(showBackground = true)
@Composable
fun BirthdayGreetingsPreview() {
    MarchGreetingTheme {
        BirthdayGreetings("Valdis", 28.sp)
    }
}
