package com.example.uddishverma.gameapp_2;

import java.util.ArrayList;

/**
 * Created by UddishVerma on 04/07/16.
 */
public class PsAllTimeClass {

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
        details.add(new psDetails("GTA 5", R.drawable.gtafive));
        details.add(new psDetails("FIFA 16",R.drawable.fifa));
        details.add(new psDetails("ASSASSINS CREED SYNDICATE", R.drawable.assasins));
        details.add(new psDetails("MAX PAYNE 3",R.drawable.maxpayne));
        details.add(new psDetails("FAR CRY 4", R.drawable.farcry));
        details.add(new psDetails("WATCHDOGS", R.drawable.watch));
        details.add(new psDetails("NEED FOR SPEED",R.drawable.nfs));

        return details;
    }
}
