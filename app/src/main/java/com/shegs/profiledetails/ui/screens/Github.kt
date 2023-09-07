package com.shegs.profiledetails.ui.screens

import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import kotlinx.coroutines.delay

@Composable
fun GithubWebViewScreen() {
    val url = "https://github.com/shegsbass"
    var isLoading by remember { mutableStateOf(true) }

    LaunchedEffect(url){
        delay(1000)
        isLoading = false
    }
    
    if (isLoading){
        ProgressIndicator()
    }else{
        WebViewComponent(url = url)
    }

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