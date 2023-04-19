package com.example.tmdb_movie_app.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tmdb_movie_app.ui.HomeFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = 5

    override fun createFragment(position: Int) = HomeFragment.newInstance(position)
}