package com.example.actbasiccomposable_0247.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun TataletakBox(modifier: Modifier){
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(), contentAlignment = Alignment.Center
    ){
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
        Text(text = "Komponen5")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier){
    ColumnRow(modifier.fillMaxWidth(),
        horizontalArrangment = Arrangement.SpaceEvenly){
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier){
    ColumnRow(modifier = modifier.fillMaxWidth(),
    horizontalArrangment = Arrangment.SpaceEvently){
         Column() {
             Text(text = "Komponen1Kolom1")
             Text(text = "Komponen2Kolom1")
             Text(text = "Komponen3Kolom1")
         }
        Column() {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}



