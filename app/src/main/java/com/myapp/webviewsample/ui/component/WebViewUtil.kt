package com.myapp.webviewsample.ui.component

import android.util.Log
import android.view.KeyEvent
import android.webkit.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

private const val APP_NAME = "WebViewSample"
private const val TAG = "WebView"

/**
 * Util WebVie Component
 *
 * @param url 表示するURL
 */
@Composable
fun CustomWebView(url: String) {

    AndroidView(
        factory = { context ->
            WebView(context).also { webView ->
                // 戻る処理設定
                webView.setOnKeyListener { _, keyCode, event ->
                    (keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()).apply {
                        if (event.action != KeyEvent.ACTION_DOWN) return@apply
                        webView.goBack()
                        Log.d(APP_NAME, webView.url!!)
                    }
                }

                // WebViewの各種設定
                webView.webViewClient = object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                        Log.d(APP_NAME, "$TAG::shouldOverrideUrlLoading()")
                        return false
                    }

                    override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? {
                        Log.d(APP_NAME, "$TAG::shouldInterceptRequest()")
                        return super.shouldInterceptRequest(view, request)
                    }

                    override fun onPageFinished(view: WebView?, url: String?) {
                        Log.d(APP_NAME, "$TAG::onPageFinished()")
                        super.onPageFinished(view, url)
                    }

                    override fun onReceivedError(
                        view: WebView?,
                        request: WebResourceRequest?,
                        error: WebResourceError?
                    ) {
                        Log.d(APP_NAME, "$TAG::onReceivedError()")
                        super.onReceivedError(view, request, error)
                    }
                }

                // URL読み込み
                webView.loadUrl(url)
            }
        }
    )
}