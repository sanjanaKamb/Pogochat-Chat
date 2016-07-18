package com.example.ece496.pogochat_chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class ChatActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        webView = (WebView) findViewById((R.id.webView1));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://webchat.freenode.net/?nick=srkambbs&channels=43.642699_-79.387034_yellow");
    }
}
