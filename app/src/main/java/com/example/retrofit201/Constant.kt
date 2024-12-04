package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Constant {
    companion object{
        val time :Long = 15
        val url:String = "https://dummyjson.com"
    }
}