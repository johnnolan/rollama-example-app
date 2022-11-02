package com.example.rollama1.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.rollama1.R
import com.example.rollama1.WebViewController


class LoginFragment : Fragment() {

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        val root: View = inflater.inflate(R.layout.fragment_login, container, false)

        // Created a WebView and used the loadurl method to give url to WebViewController class
        val webView = root.findViewById<WebView>(R.id.web_view_login)
        val webSettings: WebSettings = webView.getSettings()
        webSettings.javaScriptEnabled = true
        webView.loadUrl("https://www.rollama.com/login/") // Url of portal is passed
        webView.webViewClient = WebViewController() // WebViewController is used
        return root
    }
}