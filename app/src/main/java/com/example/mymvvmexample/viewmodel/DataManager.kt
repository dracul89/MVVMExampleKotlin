package com.example.mymvvmexample.viewmodel

import androidx.viewbinding.BuildConfig
import com.example.mymvvmexample.BuildConfig.API_KEY
import com.example.mymvvmexample.model.Response
import com.example.mymvvmexample.service.WeatherService
import javax.inject.Inject

/*
* This is the data manager it is a bridge between models and the viewmodel class
* the viewmodel will communicate to the data manager
* the data manager will communicate between different models and handled caching
*
 */
class DataManager {

    @Inject
    lateinit var service: WeatherService

    fun getWeather(lat: String,lon: String) : Response {
            return service.getWeather(lat,lon,"33bc32a44a05a2c662decadd2e4c9e05").execute().body()!!
    }
}