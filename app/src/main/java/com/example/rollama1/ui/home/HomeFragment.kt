package com.example.rollama1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.rollama1.R
import com.example.rollama1.WebViewController

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val root: View = inflater.inflate(R.layout.fragment_home, container, false)

        // Created a WebView and used the loadurl method to give url to WebViewController class
        val webView = root.findViewById<WebView>(R.id.web_view_home)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.rollama.com/") // Url of portal is passed
        webView.webViewClient = WebViewController() // WebViewController is used
        return root
    }
}
