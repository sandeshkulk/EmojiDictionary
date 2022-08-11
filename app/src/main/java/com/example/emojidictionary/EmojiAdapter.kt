package com.example.emojidictionary

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class EmojiAdapter (val emojis: ArrayList<String>) : RecyclerView.Adapter<EmojiAdapter.TextHolder> (){

    class TextHolder(v:View): RecyclerView.ViewHolder(v), View.OnClickListener{
        private var View: View? = null
        private lateinit var emoji: String
        val text=v.findViewById<TextView>(R.id.itemTextView)

        init {
            v.setOnClickListener(this)
        }


        fun bindEmoji(emoji1: String) {
            this.emoji =emoji1
            this.View=View
        }
        override fun onClick(v: View?) {
            var View: View? = v
            // var emoji1: String=""
            val detailIntent = Intent(View?.context,EmojiDetailActivity::class.java)
            detailIntent.putExtra("emoji", emoji)
            if (View != null) {
                startActivity(View.context,detailIntent,null)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row,parent,false))
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        val emoji = emojis[position]
        holder.bindEmoji(emoji)
        holder.text.text=emoji
    }
    override fun getItemCount(): Int {
        return emojis.count()
    }
}