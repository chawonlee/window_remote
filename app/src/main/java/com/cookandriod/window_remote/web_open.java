package com.cookandriod.window_remote;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import static com.cookandriod.window_remote.MainActivity.texr;
import static com.example.dragospc.nodemcu1.MainActivity.texr;

public class web_open extends AppCompatActivity {

    private WebView mWebView;
    private WebSettings mWebSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        //액션바(툴바) 숨김
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mWebView = (WebView)findViewById(R.id.web_view);
        mWebView.setWebViewClient(new WebViewClient());
        mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("http://"+texr);
    }

}
