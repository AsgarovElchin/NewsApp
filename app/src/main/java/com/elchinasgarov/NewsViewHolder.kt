package com.elchinasgarov

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.elchinasgarov.newsapp.databinding.ArticleItemBinding

class NewsViewHolder(val binding: ArticleItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(article: Article, onItemClickListener: ((Article) -> Unit)?) {
        binding.ivArticleImage.load(article.urlToImage)
        binding.tvSource.text = article.source.name
        binding.tvTitle.text = article.title
        binding.tvDescription.text = article.description
        binding.tvPublishedAt.text = article.publishedAt
        binding.root.setOnClickListener {
            onItemClickListener?.let { it(article) }
        }
    }
}