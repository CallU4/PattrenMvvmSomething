package com.example.pattrenmvvmsomething

import android.content.Context
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.pattrenmvvmsomething.databinding.BlogItemBinding
import com.example.pattrenmvvmsomething.model.Blog

class BlogAdapter(val viewModel: ViewModel, val blogArray: ArrayList<Blog>, val context: Context) : RecyclerView.Adapter<BlogAdapter.BlogHolder>() {



    inner class BlogHolder (var bind: BlogItemBinding): RecyclerView.ViewHolder(bind.root){
        
    }

    interface OnItemClickListener{
        fun onClick(view: View)
    }
}