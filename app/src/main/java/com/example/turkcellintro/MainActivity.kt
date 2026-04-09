package com.example.turkcellintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.turkcellintro.ui.theme.TurkcellIntroTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var name: String = "Halit"
        enableEdgeToEdge()
        setContent {
            Scaffold {
              paddingValues ->  MyAppStart(Modifier.padding(paddingValues))
            }
        }
    }
}

// Bir fonksiyon eğer UI fonksiyonu ise.. @Composable olması zorunludur..
@Composable
fun MyAppStart(modifier: Modifier) {
    Column( modifier= modifier ) {
        Text("Merhaba")
        Text("Merhaba 2")
    }
}
