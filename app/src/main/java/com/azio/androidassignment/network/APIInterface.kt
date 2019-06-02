package com.azio.androidassignment.network

import com.azio.androidassignment.model.Horse
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface{

    @GET("api/horse/GetHorseForClient")
     fun getHorseForClient(
        @Query("id") id: String,
        @Query("username") username: String
    ): retrofit2.Call<Horse>
}