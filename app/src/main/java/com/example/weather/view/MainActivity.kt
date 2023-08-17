package com.example.weather.view

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weather.api.OpenWeatherAPI
import com.example.weather.ui.theme.WeatherTheme
import com.example.weather.view.compose.CityItem
import com.example.weather.view.compose.CityList
import com.example.weather.view.screens.HomeScreen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var openWeatherAPI: OpenWeatherAPI
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        GlobalScope.launch {
//            // TODO: This is just for sample and will be removed in next iteration
//            val response = openWeatherAPI.getCurrentWeatherByCityName(cityName = "Nagpur",
//                apiId = "cf5c3b402763610f19dae9626a23818d" )
//            Log.d("TAG",response.body().toString())
//        }
        setContent {
            HomeScreen { CityItem(cityName = "New Delhi") }
        }
    }
}


