package com.example.uddishverma.gameapp_2;

import java.util.ArrayList;

/**
 * Created by UddishVerma on 04/07/16.
 */
public class XboxAllTImeClass {

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
        details.add(new xboxDetails("GTA 5", R.drawable.gtafive));
        details.add(new xboxDetails("MAX PAYNE 3",R.drawable.maxpayne));
        details.add(new xboxDetails("ASSASSINS CREED SYNDICATE", R.drawable.assasins));
        details.add(new xboxDetails("FIFA 16",R.drawable.fifa));
        details.add(new xboxDetails("NEED FOR SPEED",R.drawable.nfs));

        return details;
    }
}
