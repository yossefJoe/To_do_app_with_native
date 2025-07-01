// MainActivity.kt
package com.example.practice1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.practice1.onBoarding.SplashScreen
import com.example.practice1.onBoarding.PageViewDemo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var showSplash by remember { mutableStateOf(true) }
            if (showSplash) {
                SplashScreen(onTimeout = { showSplash = false })
            } else {
                PageViewDemo()
            }
        }
    }
}
