package com.example.homework01.concert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.homework01.R
import com.example.homework01.databinding.ActivityConcertBinding

class ConcertActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConcertBinding
    val concertList = ArrayList<ConcertModel>()
    val concertAdapter = ConcertAdapter(concertList)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityConcertBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvConcert.adapter = concertAdapter
        binding.rvConcert.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        concertList.add(ConcertModel(R.drawable.concert1))
        concertList.add(ConcertModel(R.drawable.concert2))
        concertList.add(ConcertModel(R.drawable.concert3))
        concertList.add(ConcertModel(R.drawable.concert4))
        concertList.add(ConcertModel(R.drawable.concert5))
        concertList.add(ConcertModel(R.drawable.concert6))
        concertList.add(ConcertModel(R.drawable.concert7))
        concertList.add(ConcertModel(R.drawable.concert8))

        concertAdapter.notifyDataSetChanged()
    }
}