package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Company(
    val address: Address,
    val department: String,
    val name: String,
    val title: String
)