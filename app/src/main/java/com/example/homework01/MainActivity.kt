package com.example.homework01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework01.book.BookActivity
import com.example.homework01.concert.ConcertActivity
import com.example.homework01.databinding.ActivityMainBinding
import com.example.homework01.movie.MovieActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMovie.setOnClickListener{
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        binding.btnBook.setOnClickListener{
            val intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
        }

        binding.btnConcert.setOnClickListener{
            val intent = Intent(this, ConcertActivity::class.java)
            startActivity(intent)
        }
    }
}