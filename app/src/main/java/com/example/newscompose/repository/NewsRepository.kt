package com.example.newscompose.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.newscompose.helper.ApiClient
import com.example.newscompose.helper.ApiServices
import com.example.newscompose.model.NewsModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {

      suspend fun getCountryNews(): NewsModel? {
          var newsModel :NewsModel? =null
        var apiServices = ApiClient.getRetrofit()!!.create(ApiServices::class.java)
         return  apiServices.getNewsCountry("us","business","1ee831619156425192704ed881bf244e")
//             .enqueue(object : Callback<NewsModel?>{
//            override fun onResponse(call: Call<NewsModel?>, response: Response<NewsModel?>) {
//               newsModel =response.body()
//
//            }
//
//            override fun onFailure(call: Call<NewsModel?>, t: Throwable) {
//                Log.e("TAG", "onFailure: ${t.message}", )
//            }
//        })

//          return newsModel
    }

}