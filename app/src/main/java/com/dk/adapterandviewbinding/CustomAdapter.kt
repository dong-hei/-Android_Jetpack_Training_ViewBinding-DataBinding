package com.dk.adapterandviewbinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet : ArrayList<String>) : RecyclerView.Adapter<CustomAdapter.Viewholder>() {

    class Viewholder(view : View) : RecyclerView.ViewHolder(view){
     val myText : TextView
     init{
         myText = view.findViewById(R.id.myTxt)
     }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.Viewholder {

        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.txt_row_items, parent, false)

        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.Viewholder, position: Int) {
        holder.myText.text = dataSet[position]
    }

    override fun getItemCount(): Int {

        return dataSet.size
    }

}