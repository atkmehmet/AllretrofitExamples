package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Bank(
    val cardExpire: String,
    val cardNumber: String,
    val cardType: String,
    val currency: String,
    val iban: String
)