package com.example.retrofit201

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface Service {

    @GET("users")
    suspend fun getUsers():jsonReturn


    @POST("user/login")
    suspend fun getToken(@Body loginRequest:LoginRequest):LoginResponse
}