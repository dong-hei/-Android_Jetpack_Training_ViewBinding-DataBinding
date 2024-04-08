package com.dk.adapterandviewbinding.viewBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dk.adapterandviewbinding.CustomAdapter
import com.dk.adapterandviewbinding.R
import com.dk.adapterandviewbinding.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val arr = ArrayList<String>()

        arr.add("a")
        arr.add("b")
        arr.add("c")
        arr.add("d")
        arr.add("aa")
        arr.add("bb")
        arr.add("cc")
        arr.add("dd")
        arr.add("aaa")
        arr.add("bbb")
        arr.add("ccc")
        arr.add("ddd")
        arr.add("aaa")
        arr.add("bbb")
        arr.add("ccc")
        arr.add("ddd")

        val customViewAdapter = CustomViewAdapter(arr)
        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.adapter = customViewAdapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}