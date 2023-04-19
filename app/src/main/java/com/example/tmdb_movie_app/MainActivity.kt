package com.example.tmdb_movie_app

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.appbar.MaterialToolbar


open class MainActivity : AppCompatActivity() {
    private lateinit var navConterller: NavController
    open var searchViewAmdroid: SearchView? = null
    private lateinit var toolbar: MaterialToolbar
    private val viewModel: MovieViewModel by viewModels()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val navHost = supportFragmentManager.findFragmentById(R.id.frameLayout) as NavHostFragment
        navConterller = navHost.findNavController()
        setupActionBarWithNavController(navConterller)
        searchViewAmdroid = findViewById<SearchView>(R.id.search_icon)

    }

    // TODO: Top Bar Search Funktion



    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp() || navConterller.navigateUp()
    }



}