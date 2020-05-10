package com.example.mymedicalsummary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mywebview = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mywebview.setWebViewClient(new WebViewClient());
        mywebview.loadUrl("http://www.mymedsum.com");
    }
}
