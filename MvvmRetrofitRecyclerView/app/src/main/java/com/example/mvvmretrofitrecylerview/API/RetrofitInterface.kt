package com.example.mvvmretrofitrecylerview.API

import com.example.mvvmretrofitrecylerview.Model.Movies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("popular?")
    fun getPopularMovies(@Query("api_key") api_key: String): Call<Movies>

}