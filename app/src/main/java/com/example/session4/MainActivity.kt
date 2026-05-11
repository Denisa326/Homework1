package com.example.session4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.session4.ui.theme.Session4Theme
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {

                Greeting(name = "Denisa")

                ClickButton()

                RowExample()

                ColumnExample()

                BoxExample()

                ModifierExample()

                CounterExample()

                ScrollExample()

                ProfileCard()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name",
        color = Color.Blue
    )
}

@Composable
fun ClickButton() {
    Button(
        onClick = {
            Log.d("BUTTON", "Clicked")
        }
    ) {
        Text("Click me")
    }
}

@Composable
fun RowExample() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("🏠")
        Spacer(modifier = Modifier.width(8.dp))
        Text("Home")
    }
}

@Composable
fun ColumnExample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Text 1")
        Text("Text 2")
        Text("Text 3")
    }
}

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .size(150.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Centered Text",
            color = Color.White
        )
    }
}

@Composable
fun ModifierExample() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
            .background(Color.Red)
    )
}

@Composable
fun CounterExample() {

    var count by remember {
        mutableStateOf(0)
    }

    Button(
        onClick = {
            count++
        }
    ) {
        Text("Count: $count")
    }
}

@Composable
fun ScrollExample() {

    Column {
        for (i in 1..20) {
            Text(
                text = "Item $i",
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun ProfileCard() {

    Card {

        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text("👩")
            Text("Denisa")
            Text("Android Developer")
        }
    }
}

