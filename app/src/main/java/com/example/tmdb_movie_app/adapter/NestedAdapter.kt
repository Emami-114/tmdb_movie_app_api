package com.example.tmdb_movie_app.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tmdb_movie_app.databinding.NestedMovieListBinding
import com.example.tmdb_movie_app.model.NestedModel

class NestedAdapter(val data: List<NestedModel>) : RecyclerView.Adapter<NestedAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(val binding: NestedMovieListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = NestedMovieListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return data.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val genres = data[position]
        Log.d("MYTAG","Fehler")
        holder.binding.tvGenres.text = genres.name
        holder.binding.nestedRecyclerView.adapter = genres.list?.let { SingleAdapter(it) }
        holder.binding.nestedRecyclerView.apply {
            set3DItem(true)
            setAlpha(true)
            setInfinite(true)
        }
    }

}