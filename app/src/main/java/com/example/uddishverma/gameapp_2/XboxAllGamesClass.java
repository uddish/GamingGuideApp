package com.example.uddishverma.gameapp_2;

import java.util.ArrayList;

/**
 * Created by UddishVerma on 04/07/16.
 */
public class XboxAllGamesClass {

    public static class xboxDetails {
        String name;
        int picture;

        public xboxDetails(String name, int picture) {
            this.name = name;
            this.picture = picture;
        }
    }
    public static ArrayList<xboxDetails> getDetails() {
        ArrayList<xboxDetails> details = new ArrayList<>(10);
        details.add(new xboxDetails("MIRROR'S EDGE CATALYST",R.drawable.mirrors));
        details.add(new xboxDetails("TITANFALL",R.drawable.titanfall));
        details.add(new xboxDetails("BATTLEFIELD 4",R.drawable.battlefield));
        details.add(new xboxDetails("CRYSIS 3",R.drawable.crysis));
        details.add(new xboxDetails("FAR CRY 4", R.drawable.farcry));
        details.add(new xboxDetails("WATCHDOGS", R.drawable.watch));
        details.add(new xboxDetails("CREW",R.drawable.crew));
        details.add(new xboxDetails("RAYMAN LEGENDS",R.drawable.rayman));
        details.add(new xboxDetails("TOM CLANCY'S THE DIVISION",R.drawable.division));
        details.add(new xboxDetails("GTA 4",R.drawable.gtafour));
        details.add(new xboxDetails("READ DEAD REDEMPTION",R.drawable.read));
        details.add(new xboxDetails("L.A. NOIRE",R.drawable.lanoire));
        details.add(new xboxDetails("MIDNIGHT CLUB L.A.",R.drawable.midnight));

        return details;
    }
}
