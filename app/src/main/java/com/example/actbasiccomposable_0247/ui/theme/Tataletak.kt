package com.example.actbasiccomposable_0247.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun TataletakColumn(modifier: Modifier){
    Column(modifier = modifier.padding(top =20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
        Text(text = "Komponen5")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(modfier.fillMaxWidth(),horizontalArrangment = Arrangement.SpaceEvenly){
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
        Text(text = "Komponen5")
    }
}

@Composable
