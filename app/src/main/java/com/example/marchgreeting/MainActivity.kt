package com.example.marchgreeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
//import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Column {
//                        BirthdayGreetings("Valdis", 28.sp)
//                        Greeting("RTU Students")
//                    }
//
//                }
                SimpleCounter()
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
fun SimpleCounter() {
    var count by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "You clicked $count times",
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { count++ }
        ) {
            Text("Click me")
        }
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

@Preview
@Composable
fun DefaultPreview() {
    MarchGreetingTheme {
        Greeting("Valdis")
    }
}

@Preview
@Composable
fun SimpleCounterPreview() {
    MarchGreetingTheme {
        SimpleCounter()
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
