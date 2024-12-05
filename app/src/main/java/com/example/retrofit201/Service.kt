package com.example.retrofit201

import retrofit2.http.GET


interface Service {

    @GET("users")
    suspend fun getUsers():List<User>
}