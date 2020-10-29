package com.example.libro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class busquedalibro extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busquedalibro);

        webView=findViewById(R.id.WBlibro);
        String libro=getIntent().getStringExtra("libro");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/search?tbm=bks&q="+libro);

    }
}