package com.example.mymvvmexample.service

import com.example.mymvvmexample.model.Response
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET


/*
*
* https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid={API key}
 */

interface WeatherService {
    @FormUrlEncoded
    @GET("weather?lat={lat}&lon={lon}&appid={key}")
    fun getWeather(@Field("lat") lat: String?,@Field("lon") lon: String?, @Field("key") key: String?): Call<Response>
}