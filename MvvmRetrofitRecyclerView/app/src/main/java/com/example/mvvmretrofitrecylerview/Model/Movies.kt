package com.example.mvvmretrofitrecylerview.Model

data class Movies(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)