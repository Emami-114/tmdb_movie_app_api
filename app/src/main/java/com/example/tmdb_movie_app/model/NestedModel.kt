package com.example.tmdb_movie_app.model

data class NestedModel(val name: String, val list: List<UpComing.Result>? = null)