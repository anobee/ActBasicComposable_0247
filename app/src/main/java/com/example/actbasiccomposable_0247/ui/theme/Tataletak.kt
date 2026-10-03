package com.example.actbasiccomposable_0247.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text


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
    Row(modfier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly){
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
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }

        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier){
    Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly)
    {
        Column() {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        Column() {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
    }
}

@Composable
fun TataletakBoxColumn(modifier:modifier){
    val gambar = painterresource(id = R.drawable.notasibalok)
    Column{
        Box(
            modifier = modifier
                .fillMaxWidth
                .Height(height = 110.dp)
                .Background(color = color.yellow)
        ){
            Column(){
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontaArrangement = Arrangement.SpaceEvenly
                ){
                    Text(text = "Col1_Row1_Komponen1")
                    Text(text = "Col1_Row1_Komponen2")
                    Text(text = "Col1_Row1_Komponen3")
                }
                Row(
                    modifier = modifier.fillMaxWidth()
                    ,horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Text(text = "Col1_Row1_Komponen1")
                    Text(text = "Col1_Row1_Komponen2")
                    Text(text = "Col1_Row1_Komponen3")
                }

            }
        }

        Spacer(modifier = modifier.height(height = 10.dp))
        Box(
            modfier = modifier.fillMaxWidth()
                .Height(height = 300.dp)
                .background(color=color.cyan),
            contentAlingment = Alignment.Center
        ){
            Image(Painter = gambar,
                contentDescription =null,
                contentscale = ContentScale.fit)
            Text(text="MyMusic",
                fontsize = 50.sp,
                color=color.red,
                fontWeight = fontWeight.Bold,
                fontFamily = Font.Family.Cursive,
                modifier = modifier.align(alignment=Alignment.Center)
                )
        }

    }
}





