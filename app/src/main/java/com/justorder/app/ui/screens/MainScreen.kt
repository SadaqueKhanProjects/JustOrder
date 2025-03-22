//package com.justorder.app.ui.screens
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import com.justorder.app.data.model.Restaurant
//
//@Composable
//fun MainScreen(
//    restaurants: List<Restaurant>,
//    onSearch: (String) -> Unit
//) {
//    var outcode by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        // Outcode input field
//        OutlinedTextField(
//            value = outcode,
//            onValueChange = { outcode = it },
//            label = { Text("Enter Outcode") },
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//
//        // Search button
//        Button(
//            onClick = { onSearch(outcode) },
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text("Search Restaurants")
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Show message when no restaurants are found
//        if (restaurants.isEmpty()) {
//            Text(
//                text = "No restaurants found. Try another outcode.",
//                modifier = Modifier.padding(16.dp),
//                style = MaterialTheme.typography.bodyLarge
//            )
//        } else {
//            // Display restaurant list
//            LazyColumn {
//                items(restaurants) { restaurant ->
//                    RestaurantItem(restaurant)
//                    Spacer(modifier = Modifier.height(8.dp))
//                }
//            }
//        }
//    }
//}
//
//// Simple UI for each restaurant
//@Composable
//fun RestaurantItem(restaurant: Restaurant) {
//    Card(
//        modifier = Modifier.fillMaxWidth(),
//        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
//    ) {
//        Column(modifier = Modifier.padding(16.dp)) {
//            Text(text = restaurant.name, style = MaterialTheme.typography.titleMedium)
//            Text(text = "⭐ Rating: ${restaurant.rating}")
//            Text(text = "🍽 Cuisine: ${restaurant.cuisineTypes.joinToString(", ")}")
//        }
//    }
//}
