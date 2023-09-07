package com.shegs.profiledetails.ui.screens

import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun GithubWebViewScreen() {
    val url = "https://github.com/shegsbass"

    WebViewComponent(url = url)
}

@Composable
fun WebViewComponent(url: String) {

    val context = LocalContext.current

    val webView = remember {
        WebView(context).apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
            settings.cacheMode = WebSettings.LOAD_NO_CACHE
        }
    }

    AndroidView(
        modifier = Modifier
            .fillMaxSize(),
        factory = {webView},
        update = {
            it.loadUrl(url)
        }
    )

}

@Preview
@Composable
fun GithubPreview() {
    GithubWebViewScreen ()
}