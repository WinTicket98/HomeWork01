package com.example.homework01.movie

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.homework01.R

class MovieAdapter(val context: Context, val data: MutableList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val poster: ImageView = view.findViewById(R.id.movie_poster)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemview =
            LayoutInflater.from(parent.context).inflate(R.layout.movie_items, parent, false)
        return ItemViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item: Movie = data.get(position)

        holder.poster.setImageResource(item.poster)

        if(position != RecyclerView.NO_POSITION) {
            holder.itemView.setOnClickListener {
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra("data", item)
                ContextCompat.startActivity(context, intent, null)
            }
        }
    }

    override fun getItemCount() = data.size
}