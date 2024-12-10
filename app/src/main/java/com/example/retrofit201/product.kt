package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class product(
    val limit: Int,
    val products: List<ProductX>,
    val skip: Int,
    val total: Int
)