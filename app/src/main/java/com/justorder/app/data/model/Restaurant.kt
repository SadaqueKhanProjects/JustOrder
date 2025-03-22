package com.justorder.app.data.model


data class Restaurant(
    val name: String,
    val rating: Float,
    val cuisineTypes: List<String>,
    val logoUrl: String?
)

data class RestaurantResponse(
    val restaurant: List<Restaurant>  // Ensure this matches API response
)

