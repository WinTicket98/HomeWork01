package com.example.homework01.book

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework01.R

class BookAdapter(val bookList: ArrayList<BookModel>):
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.book_rv_items, parent, false)
            return BookViewHolder(v)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val item = bookList[position]
        holder.img.setImageResource(item.bookImg)
        holder.title.text = item.bookTitle
    }

    override fun getItemCount(): Int{
        return bookList.size
    }

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val img: ImageView = itemView.findViewById(R.id.imageArea)
        val title: TextView = itemView.findViewById(R.id.titleArea)
    }

}