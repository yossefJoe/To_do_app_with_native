@file:OptIn(ExperimentalFoundationApi::class)


package com.example.practice1.onBoarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.practice1.R
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.practice1.onBoarding.components.WaveShape


@Composable
fun PageViewDemo() {
    val pagerState = rememberPagerState(pageCount = { 3 })

    // List of drawable image resource IDs
    val images = listOf(
        R.drawable.onboarding1,
        R.drawable.onboarding2,
        R.drawable.onboarding3
    )
    val colors = listOf(
        Color.Red,
        Color.Blue,
        Color(0xFF8560F9) // red from your image
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = images[page]),
                    contentDescription = "Page $page image",
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        WaveShape(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp), // 👈 Add height!
            waveColor = Color.Red
        )

    }
}