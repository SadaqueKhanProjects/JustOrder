package com.justorder.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.justorder.app.model.Restaurant
import com.justorder.app.network.RetrofitClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * ViewModel to handle fetching restaurant data.
 */
class RestaurantViewModel : ViewModel() {

    private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurants: StateFlow<List<Restaurant>> = _restaurants

    /**
     * Fetch restaurants for the given outcode.
     *
     * @param outcode The postal code to search restaurants for.
     */
    fun fetchRestaurants(outcode: String) {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.apiService.getRestaurants(outcode)
                _restaurants.value = response.restaurants
            } catch (e: Exception) {
                // Handle error (you can expose an error state if needed)
                _restaurants.value = emptyList()
            }
        }
    }
}
