package com.example.vefacanbeytorun_odev3.autobio.blog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.vefacanbeytorun_odev3.R
import kotlinx.android.synthetic.main.activity_blog.*

class Blog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        alertDialog()

       val url = "https://medium.com/@vefacanbeytorun"

        customBlogView.settings.javaScriptEnabled = true
        customBlogView.loadUrl(url)
        customBlogView.webViewClient = customWebViewClient()
    }

    class customWebViewClient : WebViewClient(){

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onLoadResource(view: WebView?, url: String?) {
            super.onLoadResource(view, url)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
        }
    }

    fun alertDialog() {
        var titleView = layoutInflater.inflate(R.layout.custom_alert, null)
        var alert =AlertDialog.Builder(this)
        alert.setCustomTitle(titleView)
        alert.setMessage("Kotlin ve Android hakkında makaleler yazdığım Medium blog sayfama hoşgeldiniz!")
        alert.setPositiveButton("Tamam") { dialogInterface, i ->
        }
        alert.show()
    }
}