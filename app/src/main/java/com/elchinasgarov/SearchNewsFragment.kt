package com.elchinasgarov

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.elchinasgarov.newsapp.MainActivity
import com.elchinasgarov.newsapp.R


class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {
    lateinit var viewModel: NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }}