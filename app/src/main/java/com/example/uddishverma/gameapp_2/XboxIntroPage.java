package com.example.uddishverma.gameapp_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class XboxIntroPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xbox_intro_page);
    }

    public void goToXboxExclusive(View v)   {
        Intent i = new Intent(this, XboxExclusiveList.class);
        startActivity(i);
    }

    public void goToXboxAllTime(View v)   {
        Intent i = new Intent(this, XboxAllTimeList.class);
        startActivity(i);
    }

    public void goToXboxAllGames(View v)   {
        Intent i = new Intent(this, XboxAllGamesList.class);
        startActivity(i);
    }
}
