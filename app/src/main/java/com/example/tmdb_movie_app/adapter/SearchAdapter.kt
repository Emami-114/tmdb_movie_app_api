package com.example.tmdb_movie_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.ui.geometry.CornerRadius
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.tmdb_movie_app.R
import com.example.tmdb_movie_app.api.Constance.POSTER_BASE_URL
import com.example.tmdb_movie_app.databinding.SearchItemBinding
import com.example.tmdb_movie_app.model.SearchModel
import com.example.tmdb_movie_app.ui.ViewPagerFragmentDirections

class SearchAdapter(private val dataSet: List<SearchModel.Result>) :
    RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    inner class SearchViewHolder(val binding: SearchItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val binding = SearchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SearchViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val item = dataSet[position]
        holder.binding.tvTitle.text = item.title
        val vote = String.format("%.1f", item.voteAverage)

        holder.binding.tvVote.text = vote
        val image = POSTER_BASE_URL + item.posterPath
        holder.binding.ivSearch.load(image) {
            crossfade(true)
            scale(Scale.FILL)
            placeholder(R.drawable.the_last_2)
            transformations(RoundedCornersTransformation(30f))
        }
        holder.binding.itemRoot.setOnClickListener {
            it.findNavController().navigate(ViewPagerFragmentDirections.actionViewPagerFragmentToMoviesFragment(item.id))
        }
    }
}