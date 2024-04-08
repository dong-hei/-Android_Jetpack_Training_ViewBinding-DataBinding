package com.dk.adapterandviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val customAdapter = CustomAdapter(arr)
        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.adapter = customAdapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}