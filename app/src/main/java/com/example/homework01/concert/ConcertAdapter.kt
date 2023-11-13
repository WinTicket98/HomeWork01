package com.example.homework01.concert

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework01.R

class ConcertAdapter(val concertList: ArrayList<ConcertModel>):
    RecyclerView.Adapter<ConcertAdapter.ConcertViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConcertViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.concert_rv_items, parent, false)
        return ConcertViewHolder(v)
    }

    override fun onBindViewHolder(holder: ConcertViewHolder, position: Int) {
        val item = concertList[position]
        holder.img.setImageResource(item.concertImg)
    }

    override fun getItemCount(): Int{
        return concertList.size
    }

    class ConcertViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val img: ImageView = itemView.findViewById(R.id.imageArea)
    }

}