package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Crypto(
    val coin: String,
    val network: String,
    val wallet: String
)