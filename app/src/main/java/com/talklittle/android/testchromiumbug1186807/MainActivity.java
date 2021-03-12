package com.talklittle.android.testchromiumbug1186807;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webview);

        webView.stopLoading();
        webView.loadUrl("https://en.m.wikipedia.org/wiki/Main_Page");
    }
}