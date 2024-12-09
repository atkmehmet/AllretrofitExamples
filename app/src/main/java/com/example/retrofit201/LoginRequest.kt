package com.example.retrofit201

import com.squareup.moshi.JsonClass



@JsonClass(generateAdapter = true)
data class LoginRequest(
val username:String,
val password:String,
val expiresInMins:Int = 60

)





