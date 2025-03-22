//package com.justorder.app.network
//
//import com.justorder.app.data.model.RestaurantResponse
//import retrofit2.http.GET
//import retrofit2.http.Path
//
///**
// * Retrofit API service interface for fetching restaurant data.
// */
//interface JustEatApiService {
//    /**
//     * Fetches a list of restaurants that deliver to the specified outcode.
//     *
//     * @param outcode The outcode (postal code prefix) to search restaurants for.
//     * @return A [RestaurantResponse] containing the list of restaurants.
//     */
//    @GET("restaurants/bypostcode/{outcode}")
//    suspend fun getRestaurants(@Path("outcode") outcode: String): RestaurantResponse
//
//}
