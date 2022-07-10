package com.elchinasgarov

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.elchinasgarov.newsapp.databinding.ArticleItemBinding

class NewsAdapter : androidx.recyclerview.widget.ListAdapter<Article, NewsViewHolder>(MainDiffUtil) {

    private var onItemClickListener : ((Article)-> Unit)? = null
    fun setOnItemClickListener(listener:(Article)-> Unit){
        onItemClickListener = listener
    }


    object MainDiffUtil : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ArticleItemBinding.inflate(inflater, parent, false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(currentList[position],onItemClickListener)
    }
}