package com.example.uddishverma.gameapp_2;

import java.util.ArrayList;

/**
 * Created by UddishVerma on 04/07/16.
 */
public class PsAllGamesClass {

    public static class psDetails {
        String name;
        int picture;

        public psDetails(String name, int picture) {
            this.name = name;
            this.picture = picture;
        }
    }
    public static ArrayList<psDetails> getDetails() {
        ArrayList<psDetails> details = new ArrayList<>(10);
        details.add(new psDetails("TOM CLANCY'S THE DIVISION",R.drawable.division));
        details.add(new psDetails("GTA 4",R.drawable.gtafour));
        details.add(new psDetails("READ DEAD REDEMPTION",R.drawable.read));
        details.add(new psDetails("L.A. NOIRE",R.drawable.lanoire));
        details.add(new psDetails("MIDNIGHT CLUB L.A.",R.drawable.midnight));
        details.add(new psDetails("MIRROR'S EDGE CATALYST",R.drawable.mirrors));
        details.add(new psDetails("TITANFALL",R.drawable.titanfall));
        details.add(new psDetails("BATTLEFIELD 4",R.drawable.battlefield));
        details.add(new psDetails("CRYSIS 3",R.drawable.crysis));
        details.add(new psDetails("FAR CRY 4", R.drawable.farcry));
        details.add(new psDetails("WATCHDOGS", R.drawable.watch));
        details.add(new psDetails("CREW",R.drawable.crew));
        details.add(new psDetails("RAYMAN LEGENDS",R.drawable.rayman));

        return details;
    }
}
