package com.example.newscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.newscompose.ui.screen.home.view.HomeScreen
import com.example.newscompose.ui.screen.home.viewmodel.NewsViewModel

class MainActivity : ComponentActivity() {
    val viewmodel: NewsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen(viewmodel)
//            NewsComposeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//
//                    HomeScreen()
//                }
//            }
        }
    }
}

