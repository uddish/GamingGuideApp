package com.example.uddishverma.gameapp_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewCheats extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_cheats);

        Bundle b = getIntent().getExtras();
        String s = null;
        if(b != null)   {
            s = b.getString("cheats");
        }

        webView = (WebView) findViewById(R.id.web_view_cheats);
        webView.loadUrl(s);
    }
}
