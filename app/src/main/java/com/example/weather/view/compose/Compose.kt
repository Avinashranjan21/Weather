package com.example.weather.view.compose

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(title: String){
    CenterAlignedTopAppBar(
        title = { Text(text = title,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            color = Color.DarkGray,
        )
    })
}