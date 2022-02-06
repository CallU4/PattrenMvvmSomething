package com.example.pattrenmvvmsomething

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.pattrenmvvmsomething.databinding.BlogItemBinding
import com.example.pattrenmvvmsomething.model.Blog

class BlogAdapter(val viewModel: ViewModel, val blogArray: ArrayList<Blog>, val context: Context,
var onClick: OnItemClickListener) :
    RecyclerView.Adapter<BlogAdapter.BlogHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogHolder {
        val bind = BlogItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )

        return BlogHolder(bind)
    }

    override fun onBindViewHolder(holder: BlogHolder, position: Int) {
         holder.bind.tvTitle.text = blogArray[position].title

        holder.itemView.setOnClickListener{
            onClick.onClick(position)
        }
    }

    override fun getItemCount(): Int = blogArray.size

    inner class BlogHolder(var bind: BlogItemBinding) : RecyclerView.ViewHolder(bind.root) {

    }

    interface OnItemClickListener {
        fun onClick(position: Int)
    }
}