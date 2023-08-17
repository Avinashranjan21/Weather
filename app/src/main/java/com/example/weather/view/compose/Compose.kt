package com.example.weather.view.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(title: String) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Monospace,
                style = TextStyle(fontStyle = FontStyle.Italic, fontSize = 24.sp),
                color = Color.DarkGray,
            )
        })
}

@Composable
fun CityList() {
    val cityList = listOf("Nagpur", "New Delhi", "Pune", "Noida")
    Row(modifier = Modifier.padding(horizontal = 5.dp)) {
        cityList.forEach { CityItem(cityName = it) }
    }
}

@Composable
fun CityItem(cityName: String) {
    Text(
        text = cityName, modifier = Modifier
            .background(color = Color.Gray)
            .padding(16.dp)
            .border(BorderStroke(2.dp, color = Color.Black))
    )
}

@Composable
fun WeatherType() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.Absolute.Center,
    ) {
        Text(text = stringResource(R.string.hs_weather_type_today))
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = stringResource(R.string.hs_weather_type_today_7_days))
    }
}