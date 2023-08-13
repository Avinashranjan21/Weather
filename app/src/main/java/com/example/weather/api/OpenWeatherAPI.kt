package com.example.weather.api

import com.example.weather.model.ResponseCurrentWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherAPI {

    @GET("weather")
    suspend fun getCurrentWeatherByCityName(
        @Query("q") cityName: String,
        @Query("appid") apiId: String
    )
            : Response<ResponseCurrentWeather>
}