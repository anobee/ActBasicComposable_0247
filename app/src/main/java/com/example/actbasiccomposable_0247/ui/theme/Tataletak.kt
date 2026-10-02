package com.example.actbasiccomposable_0247.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier


@composable
fun TataletakColumn(modifier: Modifier){
    Column(modifier = modifier.padding(top =20dp, start =20.dp, end = 20dp)) {
        text(text = "Komponen1")
        text(text = "Komponen2")
        text(text = "Komponen3")
        text(text = "Komponen4")
        text(text = "Komponen5")
    }
}