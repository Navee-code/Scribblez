package com.ferbotz.scribblez.widgets

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = {
                Text(
                    text = "Note",
                    color = Color(0xFFF9F9FA), // You can change the color here
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )
            },
            actions = {
                IconButton(onClick = { /* TODO: Handle search */ }) {
                    Icon(Icons.Default.Search, contentDescription = "Search")
                }
                IconButton(onClick = { /* TODO: Handle info */ }) {
                    Icon(Icons.Default.Info, contentDescription = "Info")
                }
            },
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF020202)),
            contentAlignment = Alignment.Center
        ) {
            Text("Your notes will appear here...", color = Color.Gray)
        }
    }
}
