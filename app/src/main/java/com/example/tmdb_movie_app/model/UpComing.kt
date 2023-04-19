package com.example.tmdb_movie_app.model

data class UpComing(
    val page: Int,
    val results: List<Result>,

) {
    data class Dates(
        val maximum: String,
        val minimum: String
    )

    data class Result(
        val adult: Boolean,
        val backdrop_path: String,
        val id: Int,
        val original_language: String,
        val original_title: String,
        val overview: String,
        val popularity: Double,
        val poster_path: String,
        val release_date: String,
        val title: String,
        val vote_average: Double,
    )
}