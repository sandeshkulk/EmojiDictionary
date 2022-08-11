package com.example.emojidictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class EmojiDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emoji_detail)

    }

    override fun onStart() {
        super.onStart()
        val emoji = intent.extras?.getString("emoji")
        Log.d("hello","$emoji")
        findViewById<TextView>(R.id.emojiDetailText).text = emoji
    }
}