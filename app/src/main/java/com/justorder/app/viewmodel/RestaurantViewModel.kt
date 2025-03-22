//package com.justorder.app.viewmodel
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.justorder.app.data.model.Restaurant
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.launch
//import com.justorder.app.network.RetrofitClient
//
//
//
//
///**
// * ViewModel to handle fetching restaurant data.
// */
//class RestaurantViewModel : ViewModel() {
//
//    private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
//    val restaurants: StateFlow<List<Restaurant>> = _restaurants
//
//    /**
//     * Fetch restaurants for the given outcode.
//     *
//     * @param outcode The postal code to search restaurants for.
//     */
//    fun fetchRestaurants(outcode: String) {
//        viewModelScope.launch(Dispatchers.IO) {  // Use IO Dispatcher for network calls
//            try {
//                val response = RetrofitClient.apiService.getRestaurants(outcode)
//                _restaurants.value = response.restaurant
//            } catch (e: Exception) {
//                _restaurants.value = emptyList()
//            }
//        }
//    }
//
//}
