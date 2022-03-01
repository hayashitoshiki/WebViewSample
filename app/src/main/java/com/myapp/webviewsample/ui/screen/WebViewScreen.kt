package com.myapp.webviewsample.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.myapp.webviewsample.ui.component.CustomWebView


@Composable
fun WebViewScreen() {
    WebViewContent()
}

@Composable
fun WebViewContent() {

    Column {
        Text(
            text = "WebView Sample",
            fontSize= 24.sp,
            fontWeight = FontWeight.Bold,
        )
        CustomWebView("https://github.com/hayashitoshiki")
    }
}