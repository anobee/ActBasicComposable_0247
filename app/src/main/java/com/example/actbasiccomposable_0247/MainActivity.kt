package com.example.actbasiccomposable_0247

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actbasiccomposable_0247.ui.theme.ActBasicComposable_0247Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            ActBasicComposable_0247Theme {
                Scaffold(modifier = Modifier.fillMaxSize()){
                    innerPadding -> TataletakBoxColumnRow(
                        modifier = Modifier.padding(paddingValues = innerPadding)
                    )
                }
            }
        }
    }

}

