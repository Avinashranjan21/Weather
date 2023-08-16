package com.example.weather.view.screens

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather.R
import com.example.weather.ui.theme.WeatherTheme
import com.example.weather.view.compose.AppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(){
    WeatherTheme {
        Scaffold(topBar = { AppBar(title = stringResource(id = R.string.app_name)) }){
        }
    }
}