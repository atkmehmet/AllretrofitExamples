package com.example.retrofit201

import android.app.Application
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

class MyApplication:Application() {
companion object {
    lateinit var service: Service
}
    override fun onCreate() {
        super.onCreate()

        val okHttpClient = OkHttpClient
            .Builder()
            .readTimeout(Constant.time, TimeUnit.SECONDS)
            .connectTimeout(Constant.time, TimeUnit.SECONDS)
            .build()

        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory()).build()

        val retrofit = Retrofit
            .Builder()
            .baseUrl(Constant.url)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()


        service = retrofit.create(Service::class.java)


    }

}