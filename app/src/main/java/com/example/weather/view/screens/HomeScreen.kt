package com.example.weather.view.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather.R
import com.example.weather.ui.theme.WeatherTheme
import com.example.weather.view.compose.AppBar
import com.example.weather.view.compose.CityList
import com.example.weather.view.compose.WeatherType

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(content : @Composable ()-> Unit){
    WeatherTheme {
        Surface(color = Color.Gray) {
            Column {
                AppBar(title = stringResource(id = R.string.toolbar_title))
                CityList()
                WeatherType()
            }
        }
    }
}