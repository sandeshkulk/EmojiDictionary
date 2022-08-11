package com.example.emojidictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager : GridLayoutManager
    lateinit var adapter:EmojiAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager= GridLayoutManager(this ,3)
        findViewById<RecyclerView>(R.id.recyclerView).layoutManager = layoutManager

        adapter = EmojiAdapter(arrayListOf("👍","🎅","😂","⛪","💰"))
        findViewById<RecyclerView>(R.id.recyclerView).adapter=adapter

    }
}