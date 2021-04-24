package com.example.horizontalrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    private val movieList = ArrayList<MovieModel>()
    private lateinit var moviesAdapter: MoviesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        moviesAdapter = MoviesAdapter(movieList)
        val mLayoutManager = LinearLayoutManager(applicationContext)
        mLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView.layoutManager = mLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = moviesAdapter
        prepareMovieData()
    }
    private fun prepareMovieData() {
        var movie = MovieModel("Mad Max: Fury Road", "Action & Adventure", "2015")
        movieList.add(movie)
        movie = MovieModel("Inside Out", "Animation, Kids & Family", "2015")
        movieList.add(movie)
        movie = MovieModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
        movieList.add(movie)
        movie = MovieModel("Shaun the Sheep", "Animation", "2015")
        movieList.add(movie)
        movie = MovieModel("The Martian", "Science Fiction & Fantasy", "2015")
        movieList.add(movie)
        movie = MovieModel("Mission: Impossible Rogue Nation", "Action", "2015")
        movieList.add(movie)
        movie = MovieModel("Up", "Animation", "2009")
        movieList.add(movie)
        movie = MovieModel("Star Trek", "Science Fiction", "2009")
        movieList.add(movie)
        movie = MovieModel("The LEGO MovieModel", "Animation", "2014")
        movieList.add(movie)
        movie = MovieModel("Iron Man", "Action & Adventure", "2008")
        movieList.add(movie)
        movie = MovieModel("Aliens", "Science Fiction", "1986")
        movieList.add(movie)
        movie = MovieModel("Chicken Run", "Animation", "2000")
        movieList.add(movie)
        movie = MovieModel("Back to the Future", "Science Fiction", "1985")
        movieList.add(movie)
        movie = MovieModel("Raiders of the Lost Ark", "Action & Adventure", "1981")
        movieList.add(movie)
        movie = MovieModel("Goldfinger", "Action & Adventure", "1965")
        movieList.add(movie)
        movie = MovieModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014")
        movieList.add(movie)
        moviesAdapter.notifyDataSetChanged()
    }
}