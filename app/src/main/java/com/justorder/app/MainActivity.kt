package com.justorder.app.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.justorder.app.ui.theme.JustOrderTheme
import com.justorder.app.viewmodel.RestaurantViewModel

/**
 * MainActivity sets up the Compose UI and interacts with the ViewModel.
 */
class MainActivity : ComponentActivity() {

    // Obtain the ViewModel instance
    private val viewModel: RestaurantViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustOrderTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    // Observe the restaurant list from the ViewModel
                    val restaurants = viewModel.restaurants.collectAsState().value

                    // Main screen with the list and search functionality
                    MainScreen(
                        restaurants = restaurants,
                        onSearch = { outcode -> viewModel.fetchRestaurants(outcode) }
                    )
                }
            }
        }
    }
}
