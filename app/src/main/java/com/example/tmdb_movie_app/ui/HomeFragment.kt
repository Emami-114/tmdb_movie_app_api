package com.example.tmdb_movie_app.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tmdb_movie_app.MainActivity
import com.example.tmdb_movie_app.MovieViewModel
import com.example.tmdb_movie_app.adapter.NestedAdapter
import com.example.tmdb_movie_app.adapter.SearchAdapter
import com.example.tmdb_movie_app.adapter.SingleAdapter
import com.example.tmdb_movie_app.databinding.FragmentHomeBinding
import kotlinx.coroutines.launch


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel: MovieViewModel by viewModels()
    private lateinit var searchView: SearchView

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
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val mainActivity = activity as MainActivity
// TODO: Search Listiner
        val search = mainActivity.searchViewAmdroid
//        search?.isIconifiedByDefault = false
        search?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                search?.clearFocus()
                search!!.setQuery("", false)
                if (query != null) {
                    viewModel.getSearch(query)
                    Toast.makeText(requireContext(), query, Toast.LENGTH_SHORT).show()

                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null) {
                    viewModel.getSearch(newText)
                }
                return false
            }

        })



        viewModel.searchList.observe(viewLifecycleOwner) {
            binding.recyclerView.adapter = SearchAdapter(it.results)
            binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
            Log.d("MYTAG", it.totalResults.toString())
        }


        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.apply {

        }

        val pos = arguments?.getInt(POSITION_ARG)
        pos?.let {
            when (pos) {
                0 -> {
                    lifecycleScope.launch {
                        viewModel.nested.observe(viewLifecycleOwner) {
                            binding.recyclerView.adapter = NestedAdapter(it)
                        }
                    }
                }

                1 -> {
                    viewModel.popular.observe(viewLifecycleOwner) {
                        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
                        binding.recyclerView.adapter = SingleAdapter(it.results)


                    }
                }

                2 -> {
                    viewModel.upComingList.observe(viewLifecycleOwner) {
                        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
                        binding.recyclerView.adapter = SingleAdapter(it.results)


                    }
                }

                3 -> {
                    viewModel.topRated.observe(viewLifecycleOwner) {
                        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
                        binding.recyclerView.adapter = SingleAdapter(it.results)


                    }
                }

                4 -> {
                    viewModel.nowPlaying.observe(viewLifecycleOwner) {
                        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
                        binding.recyclerView.adapter = SingleAdapter(it.results)


                    }
                }

                else -> null
            }
        }


    }


    companion object {
        var POSITION_ARG = ""

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(position: Int) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putInt(POSITION_ARG, position)
                }
            }
    }


}