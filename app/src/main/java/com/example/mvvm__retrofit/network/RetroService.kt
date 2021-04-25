package com.example.mvvm__retrofit.network

import com.example.mvvm__retrofit.model.RecyclerList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {


    @GET("repositories")
    fun getDataFromAPI(@Query("q") query: String)

}