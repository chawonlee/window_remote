package com.cookandriod.window_remote;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class web_open extends AppCompatActivity {

    private WebView mWebView;
    private WebSettings mWebSettings;
    public static String texr;
    private EditText my_ip;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        //아이피 입력 에디트텍스트
        my_ip = (EditText) findViewById(R.id.my_ip);
        texr=my_ip.getText().toString();

        mWebView = (WebView)findViewById(R.id.web_view);
        mWebView.setWebViewClient(new WebViewClient());
        mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("http://"+texr);
    }

}
