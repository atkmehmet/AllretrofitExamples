package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Address(
    val address: String,
    val city: String,
    val coordinates: Coordinates,
    val country: String,
    val postalCode: String,
    val state: String,
    val stateCode: String
)