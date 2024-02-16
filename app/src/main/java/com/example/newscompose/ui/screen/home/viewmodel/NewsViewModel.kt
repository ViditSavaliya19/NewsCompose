package com.example.newscompose.ui.screen.home.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newscompose.model.NewsModel
import com.example.newscompose.repository.NewsRepository
import kotlinx.coroutines.launch

class NewsViewModel() : ViewModel() {
    private var _dataList = MutableLiveData<NewsModel>()
    var newsList: LiveData<NewsModel> = _dataList
    var repository = NewsRepository()

    init {
        getCountryNewsData()
    }

    private fun getCountryNewsData() {
        viewModelScope.launch {

//            try {
                _dataList.value = repository.getCountryNews()


//            } catch (e: Exception) {
//                Log.e("TAG", "getCountryNewsData: ===>> ${e.message}")
//            }

        }
    }

}