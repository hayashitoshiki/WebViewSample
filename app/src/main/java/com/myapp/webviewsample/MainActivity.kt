package com.myapp.webviewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.myapp.webviewsample.ui.WebViewSampleAppNavHost
import com.myapp.webviewsample.ui.theme.WebViewSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebViewSampleTheme {
                Surface(color = MaterialTheme.colors.background) {
                    WebViewSampleAppNavHost()
                }
            }
        }
    }
}
