# WebViewSample
Compose用WebViewComponentサンプル

### ソース（WebView Component)
https://github.com/hayashitoshiki/WebViewSample/blob/master/app/src/main/java/com/myapp/webviewsample/ui/component/WebViewUtil.kt

### 使用方法
```kotlin
    Column {
        Text(
            text = "WebView Sample",
            fontSize= 24.sp,
            fontWeight = FontWeight.Bold,
        )
        CustomWebView("https://github.com/hayashitoshiki")
    }
    
 ```
 https://github.com/hayashitoshiki/WebViewSample/blob/master/app/src/main/java/com/myapp/webviewsample/ui/screen/WebViewScreen.kt
