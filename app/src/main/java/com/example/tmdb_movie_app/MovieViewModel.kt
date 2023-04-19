package com.example.tmdb_movie_app

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tmdb_movie_app.api.ApiClient
import com.example.tmdb_movie_app.model.*
import com.example.tmdb_movie_app.repository.PopularRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {
    private val repository = PopularRepository(ApiClient.MovieApi)

    val popular = repository.moviePopular
    val upComingList = repository.movieUpComing
    val nested = repository.nested
    val topRated = repository.movieTopRated
    val nowPlaying = repository.movieNowPlaying

    val detail = MutableLiveData<DetailModel>()

    val detailVideo = MutableLiveData<DetailVideo>()

    val searchList = MutableLiveData<SearchModel>()


    val watchProvider = MutableLiveData<WatchPro.Results.DE>()

    init {
        loadMovie()
        loadMovie2()
    }

    fun getSearch(query: String) = viewModelScope.launch {
        val response = repository.getSearch(query)
        if (response.isSuccessful) {
            searchList.postValue(response.body())
        }
    }

    fun watchProvider(id: Int) = viewModelScope.launch {
        delay(400)
        val response = repository.getWatchProvider(id)
        if (response.isSuccessful) {
            watchProvider.postValue(response.body()?.results?.dE)
        }
    }

    fun loadDetail(id: Int) = viewModelScope.launch {
        val response = repository.getDetail(id)
        try {
            if (response.isSuccessful) {
                detail.postValue(response.body())

            }
        } catch (e: Exception) {
            Log.d("MYTAG", e.message.toString())
        }

    }

    fun loadDetailVideo(id: Int) = viewModelScope.launch(Dispatchers.IO) {
        val response = repository.getDetailVideo(id)
        delay(500)

        try {
            if (response.isSuccessful) {
                detailVideo.postValue(response.body())

            }

        } catch (e: Exception) {
            Log.d("MYTAG", e.message.toString())

        }


    }

    val listRecommendation = MutableLiveData<RecommenModel>()

    fun getRecommendation(id: Int) = viewModelScope.launch {
        delay(1000)
        val repository = repository.getRecommendation(id)
        try {
            if (repository.isSuccessful) {
                listRecommendation.value = repository.body()
            }
        } catch (e: Exception) {
            Log.d("MYTAG", e.message.toString())
        }
    }


    fun loadMovie() {
        viewModelScope.launch() {
            repository.getNowPlaying()
            repository.getPopularMovie()
            repository.getTopRated()
            repository.getUpComing()
            repository.movieNested()
        }
    }

    fun loadMovie2() {
        viewModelScope.launch {

            repository.getUpComing()
        }
    }
    private val _moviePopular = MutableLiveData<UpComing>()
    val moviePopular: LiveData<UpComing>
        get() = _moviePopular

}

