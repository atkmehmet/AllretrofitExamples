package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseTitleUpdate(
    val id:Int,
    val title: String
)
