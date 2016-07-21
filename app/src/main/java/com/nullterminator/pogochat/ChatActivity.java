package com.nullterminator.pogochat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.nullterminator.pogochat.R;

public class ChatActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Bundle extras = getIntent().getExtras();
        String latlong = "";
        if (extras != null) {
            latlong = extras.getString("LatLong");
            //The key argument here must match that used in the other activity
        }

        webView = (WebView) findViewById((R.id.webView1));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://webchat.freenode.net/?nick=srkambbs&channels="+latlong+"_yellow");
    }
}
