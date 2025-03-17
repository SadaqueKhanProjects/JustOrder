package com.justorder.app.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Singleton object for creating the Retrofit client instance.
 */
object RetrofitClient {
    private const val BASE_URL = "https://uk.api.just-eat.io/"

    val apiService: JustEatApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JustEatApiService::class.java)
    }
}

