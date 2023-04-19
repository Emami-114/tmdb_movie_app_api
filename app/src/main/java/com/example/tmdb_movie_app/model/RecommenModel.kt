package com.example.tmdb_movie_app.model

data class RecommenModel(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
) {
    data class Result(
        val adult: Boolean,
        val backdrop_path: Any,
        val genre_ids: List<Int>,
        val id: Int,
        val original_language: String,
        val original_title: String,
        val overview: String,
        val release_date: String,
        val poster_path: Any,
        val popularity: Double,
        val title: String,
        val video: Boolean,
        val vote_average: Int,
        val vote_count: Int
    )
}