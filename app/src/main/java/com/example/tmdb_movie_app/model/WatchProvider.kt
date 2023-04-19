package com.example.tmdb_movie_app.model

import com.google.gson.annotations.SerializedName

data class WatchProvider(
    val id: Int,
    val results: Results
) {
    data class Results(

        @SerializedName("DE")
        val de: DE,

    ) {


        data class DE(
            val link: String,
            val buy: List<Buy>,
            val flatrate: List<Flatrate>,
            val rent: List<Rent>
        ) {
            data class Buy(
                val logo_path: String,
                val provider_id: Int,
                val provider_name: String,
                val display_priority: Int
            )

            data class Flatrate(
                val logo_path: String,
                val provider_id: Int,
                val provider_name: String,
                val display_priority: Int
            )

            data class Rent(
                val logo_path: String,
                val provider_id: Int,
                val provider_name: String,
                val display_priority: Int
            )
        }

    }
}