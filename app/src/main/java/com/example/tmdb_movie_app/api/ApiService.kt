package com.example.tmdb_movie_app.api

import com.example.tmdb_movie_app.model.*
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    abstract val api: Any

    @GET("movie/popular")
    suspend fun getpopular(
        @Query("page") page: Int,
        @Query("language") language: String = "de-DE"
    ): UpComing

    @GET("movie/upcoming")
    suspend fun getUpComing(
        @Query("page") page: Int,
        @Query("language") language: String = "de-DE"
    ): UpComing

    @GET("movie/top_rated")
    suspend fun getToRated(
        @Query("page") page: Int,
        @Query("language") language: String = "de-DE"
    ): UpComing

    @GET("movie/now_playing")
    suspend fun getNowPlaying(
        @Query("page") page: Int,
        @Query("language") language: String = "de-DE"
    ): UpComing

    @GET("movie/{movie_id}")
    suspend fun getDetail(
        @Path("movie_id") id: Int,
        @Query("language") language: String = "de-DE"
    ): Response<DetailModel>

    @GET("movie/{movie_id}/videos")
    suspend fun getDetailVidepo(
        @Path("movie_id") id: Int, @Query("language") language: String = "de-DE"
    ): Response<DetailVideo>

    @GET("movie/{movie_id}/watch/providers")
    suspend fun getWatchProvider(
        @Path("movie_id") id: Int
    ): Response<WatchPro>


    @GET("search/movie")
    suspend fun getSearch(
        @Query("query") query: String, @Query("language") language: String = "de-DE"
    ): Response<SearchModel>

    @GET("movie/{movie_id}/recommendations")
    suspend fun getRecomendation(
        @Path("movie_id") id: Int, @Query("language") language: String = "de-DE"
    ): Response<RecommenModel>


}