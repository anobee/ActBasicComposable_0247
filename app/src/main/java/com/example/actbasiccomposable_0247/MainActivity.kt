package com.example.actbasiccomposable_0247

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.actbasiccomposable_0247.ui.theme.ActBasicComposable_0247Theme
import androidx.compose.foundation.layout.padding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActBasicComposable_0247Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Tugas(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


