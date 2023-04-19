package com.example.tmdb_movie_app.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tmdb_movie_app.api.ApiClient
import com.example.tmdb_movie_app.model.NestedModel
import com.example.tmdb_movie_app.model.UpComing

class PopularRepository(private val api: ApiClient.MovieApi) {

    private val _moviePopular = MutableLiveData<UpComing>()
    val moviePopular: LiveData<UpComing>
        get() = _moviePopular


    private val _movieUpComing = MutableLiveData<UpComing>()
    val movieUpComing: LiveData<UpComing>
        get() = _movieUpComing

    private val _movieTopRated = MutableLiveData<UpComing>()
    val movieTopRated: LiveData<UpComing>
        get() = _movieTopRated

    private val _movieNowPalying = MutableLiveData<UpComing>()
    val movieNowPlaying: LiveData<UpComing>
        get() = _movieNowPalying

    val nested = MutableLiveData<List<NestedModel>>()


    fun movieNested() {

        nested.postValue(
            listOf(
                NestedModel("Trends", _movieNowPalying.value?.results?.shuffled()),

                NestedModel("Beliebt", _moviePopular.value?.results?.shuffled()),
                NestedModel("Top Bewertet", _movieTopRated.value?.results?.shuffled()),
                NestedModel("Im Kino", _movieUpComing.value?.results?.shuffled()),
            )
        )
    }

    suspend fun getDetail(id: Int) = api.api.getDetail(id)

    suspend fun getDetailVideo(id: Int) = api.api.getDetailVidepo(id)

    suspend fun getWatchProvider(id: Int) = api.api.getWatchProvider(id)
    suspend fun getSearch(query: String) = api.api.getSearch(query)
    suspend fun getRecommendation(id: Int) = api.api.getRecomendation(id)

    suspend fun getPopularMovie() {
        try {
            _moviePopular.postValue(api.api.getpopular(1))
        } catch (e: Exception) {

        }
    }

    suspend fun getUpComing() {
        try {
            _movieUpComing.postValue(api.api.getUpComing(2))
        } catch (e: Exception) {

        }
    }

    suspend fun getTopRated() {
        try {
            _movieTopRated.postValue(api.api.getToRated(2))
        } catch (e: Exception) {

        }
    }

    suspend fun getNowPlaying() {
        try {
            _movieNowPalying.postValue(api.api.getNowPlaying(1))
        } catch (e: Exception) {

        }
    }
}