package com.example.uddishverma.gameapp_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Gameplay extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        Bundle b = getIntent().getExtras();
        String s = null;
        if(b != null)   {
            s = b.getString("gameplay");
        }

        webView = (WebView) findViewById(R.id.gameplay);
        webView.loadUrl(s);
    }
}
