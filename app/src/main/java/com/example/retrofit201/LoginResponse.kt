package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class  LoginResponse(
    val id:Int =0 ,
    val username: String="",
    val email: String = "",
    val firstName:String = "",
    val lastName:String = "",
    val gender:String = "",
    val image:String = "",
    val accessToken:String = "",
    val refreshToken:String = ""
)
