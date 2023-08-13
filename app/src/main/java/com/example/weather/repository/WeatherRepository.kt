package com.example.weather.repository

import com.example.weather.api.NetworkResult
import com.example.weather.api.OpenWeatherAPI
import com.example.weather.model.ResponseCurrentWeather
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val openWeatherAPI: OpenWeatherAPI) {

    private val _currentWeatherByNameResponse: MutableStateFlow<NetworkResult<ResponseCurrentWeather>>
    = MutableStateFlow(NetworkResult.Initials())

    private val currentWeatherByNameResponse : StateFlow<NetworkResult<ResponseCurrentWeather>>
        get() = _currentWeatherByNameResponse

    suspend fun getCurrentWeatherByCityName(cityName: String){
        _currentWeatherByNameResponse.value = NetworkResult.Loading()
        val response = openWeatherAPI.getCurrentWeatherByCityName(cityName = cityName, apiId = "cf5c3b402763610f19dae9626a23818d")
        if (response.isSuccessful){
            response.body()?.let {
                _currentWeatherByNameResponse.value = NetworkResult.Success(it)
            }
        } else {
            _currentWeatherByNameResponse.value = NetworkResult.Error(response.message())
        }
    }
}