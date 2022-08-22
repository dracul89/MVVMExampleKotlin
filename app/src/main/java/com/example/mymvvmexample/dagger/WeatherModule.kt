package com.example.mymvvmexample.dagger

import com.example.mymvvmexample.service.WeatherService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class WeatherModule {
    var baseUrl: String = "https://api.openweathermap.org/data/2.5/"
    @Provides
    fun providesWeatherService() : WeatherService {
        return Retrofit.Builder().baseUrl(baseUrl).build().create(WeatherService::class.java);
    }
}