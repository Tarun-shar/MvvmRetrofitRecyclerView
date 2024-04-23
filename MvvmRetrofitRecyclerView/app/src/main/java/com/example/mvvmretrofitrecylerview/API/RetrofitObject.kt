package com.example.mvvmretrofitrecylerview.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitObject {

   val api : RetrofitInterface by lazy {
       Retrofit.Builder()
           .baseUrl("https://api.themoviedb.org/3/movie/")
           .addConverterFactory(GsonConverterFactory.create())
           .build()
           .create(RetrofitInterface::class.java)
   }
}