package com.example.retrofit201

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class deleteResponse(

  val   id:Int,
  val   title: String,
  val   isDeleted:Boolean,
  val   deletedOn:String
)
