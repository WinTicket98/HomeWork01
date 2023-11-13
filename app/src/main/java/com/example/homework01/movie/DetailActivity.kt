package com.example.homework01.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.homework01.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val datas = intent.getSerializableExtra("data") as Movie

        val movie_poster = findViewById<ImageView>(R.id.movie_poster)
        movie_poster.setImageResource(datas.poster)

        val movie_title = findViewById<TextView>(R.id.movie_title)
        movie_title.text = datas.title

        val movie_date = findViewById<TextView>(R.id.movie_date)
        movie_date.text = datas.date

        val movie_exp = findViewById<TextView>(R.id.movie_exp)
        movie_exp.text = datas.exp
    }
}