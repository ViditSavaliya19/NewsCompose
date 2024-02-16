package com.example.newscompose.helper

import androidx.lifecycle.LiveData
import com.example.newscompose.model.NewsModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {

    @GET("top-headlines")
    fun getNewsCountry(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") key: String
    ): NewsModel?

}