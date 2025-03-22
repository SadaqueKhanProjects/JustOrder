//package com.justorder.app.network
//
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import okhttp3.OkHttpClient
//
//object RetrofitClient {
//    private const val BASE_URL = "https://uk.api.just-eat.io/"
//
//    private val client = OkHttpClient.Builder().build()
//
//    private val retrofit = Retrofit.Builder()
//        .baseUrl(BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(client)
//        .build()
//
//    val apiService: JustEatApiService = retrofit.create(JustEatApiService::class.java)
//}
