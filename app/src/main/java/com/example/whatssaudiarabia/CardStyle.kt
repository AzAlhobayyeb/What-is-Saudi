package com.example.whatssaudiarabia

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CardStyle(animalsData: AnimalsData) {

    Card(modifier = Modifier
        .padding(0.dp, 8.dp)
        .size(170.dp),
        shape = MaterialTheme.shapes.medium,
    ) {
        Column(
        ) {
            Row(modifier = Modifier) {
                Card(shape = MaterialTheme.shapes.small) {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = animalsData.imageRes),
                        contentDescription = "${animalsData.title}",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .background(color = Color.DarkGray)
                            .fillMaxHeight()
                            .requiredWidth(150.dp)
                    )
                }
                Column {
                    Text(text = animalsData.title)
                    Text(text = animalsData.info)
                }
            }
        }
    }
}