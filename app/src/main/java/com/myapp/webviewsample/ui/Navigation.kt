package com.myapp.webviewsample.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.myapp.webviewsample.ui.screen.FirstScreen
import com.myapp.webviewsample.ui.screen.WebViewScreen

/**
 * 画面定義
 *
 * @property route 遷移パス
 * @property screenName ナビゲーションタイトル
 */
sealed class Screens(
    val route: String,
    val screenName: String
) {

    object First : Screens("first_route", "ホーム")
    object WebView : Screens("web_view_route", "ホーム")
}

/**
 * 振り返り日記Activity用 NavigationHost
 *
 */
@Composable
fun WebViewSampleAppNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.First.route
    ) {

        composable(route = Screens.First.route) { FirstScreen(navController) }
        composable(route = Screens.WebView.route) { WebViewScreen() }
    }
}