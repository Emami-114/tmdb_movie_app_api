package com.example.tmdb_movie_app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.tmdb_movie_app.MovieViewModel
import com.example.tmdb_movie_app.adapter.ViewPagerAdapter
import com.example.tmdb_movie_app.databinding.FragmentViewPagerBinding
import com.google.android.material.tabs.TabLayoutMediator


class ViewPagerFragment : Fragment() {
    private lateinit var binding: FragmentViewPagerBinding
    private val viewModel: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewPagerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        binding.viewPager2.adapter = ViewPagerAdapter(this)
        binding.viewPager2.isUserInputEnabled = false
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = getTitle(position)
        }.attach()

    }

    fun getTitle(position: Int): String? {
        return when (position) {
            0 -> "Alle"
            1 -> "Action"
            2 -> "Abenteuer"
            3 -> "Thriller"
            4 -> "Komödie"
            5 -> "Krimi"
            else -> null
        }
    }

}