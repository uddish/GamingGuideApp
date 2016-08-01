package com.example.uddishverma.gameapp_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//******************Contains links to gameplay,amazon for xbox exclusive games**********************
//****************** Halo5_page = Xbox Exclusive games information *********************************

public class Halo5_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halo5_page);

        //RECEIVING THE LINKS FOR THE PARTICULAR GAMEPLAY
//        Bundle b = getIntent().getExtras();
//        String cheatsString = null;
//        if(b != null)   {
//            cheatsString = b.getString("halo");
//    }
    }


    public void goToCheatsPage(View v)  {
        Bundle b = getIntent().getExtras();
        String cheatsString = null;
        if(b != null) {
            cheatsString = b.getString("cheats");
        }
//*****************************************************************************************

        Intent i = new Intent(this, WebViewCheats.class);
        i.putExtra("cheats", cheatsString);
        startActivity(i);
    }


    public void goToGameplayPage(View v)  {
        //receiving the bundle from XboxExclusiveList.java
        Bundle b = getIntent().getExtras();
        String gameplayString = null;
        if(b != null) {
            gameplayString = b.getString("gameplay");
        }

        Intent i = new Intent(this, Gameplay.class);
        i.putExtra("gameplay", gameplayString);
        startActivity(i);
    }

    public void goToAmazonPage(View v)  {
        Bundle b = getIntent().getExtras();
        String gameplayString = null;
        if(b != null) {
            gameplayString = b.getString("amazon");
        }

        Intent i = new Intent(this, Amazon
                .class);
        i.putExtra("amazon", gameplayString);
        startActivity(i);
    }
}
