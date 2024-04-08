package com.dk.adapterandviewbinding.dataBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.dk.adapterandviewbinding.R
import com.dk.adapterandviewbinding.databinding.TxtRowItemsBinding

class CustomDataAdapter(private val dataSet : ArrayList<String>) : RecyclerView.Adapter<CustomDataAdapter.Viewholder>() {

    class Viewholder(binding: TxtRowItemsBinding) : RecyclerView.ViewHolder(binding.root){

        val myText : TextView = binding.myTxt
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {

        val view = DataBindingUtil.inflate<TxtRowItemsBinding>(
            LayoutInflater.from(parent.context),
            R.layout.txt_row_items,
            parent,
            false)

        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.myText.text = dataSet[position]
    }

    override fun getItemCount(): Int {

        return dataSet.size
    }
}