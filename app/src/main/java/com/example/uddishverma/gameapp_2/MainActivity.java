package com.example.uddishverma.gameapp_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//TODO Add links to the playstation module and nintendo module
//TODO Add links to the xbox module except the exclusive games one

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToXboxIntroPage(View v)   {
        Intent i = new Intent(this, XboxIntroPage.class);
        startActivity(i);
    }

    public void goToPsIntroPage(View v)   {
        Intent i = new Intent(this, PsIntroPage.class);
        startActivity(i);
    }

    public void goToNintendoPage(View v)    {
        Intent i = new Intent(this, NintendoList.class);
        startActivity(i);
    }
}
