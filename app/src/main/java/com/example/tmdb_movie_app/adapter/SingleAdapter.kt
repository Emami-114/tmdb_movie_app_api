package com.example.tmdb_movie_app.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import com.example.tmdb_movie_app.R
import com.example.tmdb_movie_app.api.Constance.POSTER_BASE_URL
import com.example.tmdb_movie_app.databinding.MovieListBinding
import com.example.tmdb_movie_app.model.UpComing
import com.example.tmdb_movie_app.ui.ViewPagerFragmentDirections

class SingleAdapter(private val data: List<UpComing.Result>) : RecyclerView.Adapter<SingleAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(val binding: MovieListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleAdapter.MovieViewHolder {
        val binding = MovieListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SingleAdapter.MovieViewHolder, position: Int) {
        val movie = data[position]
        holder.binding.tvVote.text = "${movie.vote_average}"
        val moviePoster = POSTER_BASE_URL + movie.poster_path
        holder.binding.ivImage.load(moviePoster) {
            crossfade(true)
            placeholder(R.drawable.the_last_2)

            scale(Scale.FILL)
        }

        holder.binding.cardView.setOnClickListener {
            try {

            it.findNavController().navigate(ViewPagerFragmentDirections.actionViewPagerFragmentToMoviesFragment(movie.id))
            }catch (e:Exception){
                Log.d("MYTAG",e.message.toString())
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}