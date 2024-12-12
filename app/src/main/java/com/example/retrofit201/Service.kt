package com.example.retrofit201

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query


interface Service {

    @GET("users")
    suspend fun getUsers():jsonReturn


    @POST("user/login")
    suspend fun getToken(@Body loginRequest:LoginRequest):LoginResponse

    @GET("product")
    suspend fun getProduct(
        @Query("limit")  limit:  Int,
        @Query("skip")   skip:   Int,
        @Query("select") select: String
    ) :product

    @PUT("product/{id}")
    suspend fun changeTitle(
        @Path("id") id: Int,
        @Body title:String
    ):ProductX
}