package com.example.newscompose.helper

import androidx.lifecycle.LiveData
import com.example.newscompose.model.NewsModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {
        const val BASE_URL =
            "https://newsapi.org/v2/"
        var apiRetrofit: Retrofit? = null

        fun getRetrofit(): Retrofit? {
            if(apiRetrofit==null)
            {
                apiRetrofit = Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build()

            }
             return apiRetrofit
        }


    }


}