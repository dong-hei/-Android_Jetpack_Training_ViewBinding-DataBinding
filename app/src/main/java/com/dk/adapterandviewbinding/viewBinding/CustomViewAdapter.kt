package com.dk.adapterandviewbinding.viewBinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dk.adapterandviewbinding.CustomAdapter
import com.dk.adapterandviewbinding.R
import com.dk.adapterandviewbinding.databinding.TxtRowItemsBinding

class CustomViewAdapter(private val dataSet : ArrayList<String>) : RecyclerView.Adapter<CustomViewAdapter.Viewholder>() {

    class Viewholder(binding: TxtRowItemsBinding) : RecyclerView.ViewHolder(binding.root){

        val myText : TextView = binding.myTxt
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {

        val view = TxtRowItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.myText.text = dataSet[position]
    }

    override fun getItemCount(): Int {

        return dataSet.size
    }
}