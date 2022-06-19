package com.example.whatssaudiarabia

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatssaudiarabia.ui.theme.Shapes
import com.example.whatssaudiarabia.ui.theme.WhatsSaudiArabiaTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsSaudiArabiaTheme {

                Surface(
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .fillMaxSize()
                        .padding(16.dp),
                    color = Color.DarkGray
                ) {
                    LazyVerticalGrid(
                        cells = GridCells.Fixed(1),
                        modifier = Modifier
                    ) {
                        items(animals) {
                            CardStyle(it)
                        }
                    }

                }
            }
        }
    }
}