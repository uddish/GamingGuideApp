package com.example.uddishverma.gameapp_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PsIntroPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps_intro_page);
    }

    public void goToPsExclusive(View v) {
        Intent i = new Intent(this, PsExclusiveList.class);
        startActivity(i);
    }

    public void goToPsAllTime(View v) {
        Intent i = new Intent(this, PsAllTimeList.class);
        startActivity(i);
    }

    public void goToPsAllGames(View v) {
        Intent i = new Intent(this, PsAllGamesList.class);
        startActivity(i);
    }
}
