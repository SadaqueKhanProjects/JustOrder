package com.justorder.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.justorder.app.ui.theme.JustOrderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustOrderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Call your new composable here
                    JustOrderScreen()
                }
            }
        }
    }
}

/**
 * Main screen composable for your JustOrder app.
 * Allows user to enter an outcode, search for restaurants, or auto-detect location.
 */
@Composable
fun JustOrderScreen() {
    var outcode by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("No results yet") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        // Outcode TextField
        OutlinedTextField(
            value = outcode,
            onValueChange = { outcode = it },
            label = { Text("Enter Outcode") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Search Button
        Button(
            onClick = {
                if (outcode.isBlank()) {
                    resultText = "Please enter an outcode."
                } else {
                    // TODO: Call a function to fetch restaurants (e.g., via Retrofit).
                    // For now, just display a placeholder result.
                    resultText = "Searching for restaurants at $outcode..."
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Search")
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Auto-detect Button (optional)
        Button(
            onClick = {
                // TODO: Request location permission & auto-detect outcode
                // For now, just set a placeholder
                resultText = "Auto-detecting outcode..."
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Auto-detect Outcode")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Display result text or a list of restaurants
        Text(text = resultText)
    }
}

@Preview(showBackground = true)
@Composable
fun JustOrderScreenPreview() {
    JustOrderTheme {
        JustOrderScreen()
    }
}
