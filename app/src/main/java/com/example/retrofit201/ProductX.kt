package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass( generateAdapter = true)
data class ProductX(
    val id: Int,
    val price: Double,
    val title: String
)