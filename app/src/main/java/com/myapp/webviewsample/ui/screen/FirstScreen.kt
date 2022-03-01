package com.myapp.webviewsample.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.myapp.webviewsample.ui.Screens


@Composable
fun FirstScreen(navController: NavHostController) {
    FirstContent(navController)
}

@Composable
fun FirstContent(navController: NavHostController) {

    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "WebViewサンプル",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 16.dp)
        )
        Button(
            onClick = { navController.navigate(Screens.WebView.route) },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = "WebView表示")
        }
    }
}