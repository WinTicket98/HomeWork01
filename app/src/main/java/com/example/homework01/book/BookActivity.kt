package com.example.homework01.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homework01.R
import com.example.homework01.databinding.ActivityBookBinding

class BookActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBookBinding
    val bookList = ArrayList<BookModel>()
    val bookAdapter = BookAdapter(bookList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvBook.layoutManager = GridLayoutManager(this,2)
        binding.rvBook.adapter = bookAdapter

        bookList.add(BookModel(R.drawable.book1, "트렌드 코리아 2024"))
        bookList.add(BookModel(R.drawable.book2, "퓨처셀프"))
        bookList.add(BookModel(R.drawable.book3, "도시와 그 불확실한 벽"))
        bookList.add(BookModel(R.drawable.book4, "시대예보: 핵개인의 시대"))
        bookList.add(BookModel(R.drawable.book5, "세이노의 가르침"))
        bookList.add(BookModel(R.drawable.book6, "도둑맞은 집중력"))
        bookList.add(BookModel(R.drawable.book7, "아침 그리고 저녁"))
        bookList.add(BookModel(R.drawable.book8, "역행자"))

        bookAdapter.notifyDataSetChanged()
    }

}