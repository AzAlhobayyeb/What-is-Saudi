package com.example.whatssaudiarabia.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(
        topStart = 0.dp,
        topEnd = 30.dp,
        bottomStart = 0.dp,
        bottomEnd = 30.dp
    ),
    medium = CutCornerShape(
        topStart = 4.dp,
        topEnd = 4.dp,
        bottomStart = 4.dp,
        bottomEnd = 4.dp
    ),
    large = RoundedCornerShape(0.dp)
)