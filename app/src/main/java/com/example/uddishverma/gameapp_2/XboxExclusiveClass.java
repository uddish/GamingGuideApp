package com.example.uddishverma.gameapp_2;

import java.util.ArrayList;

/**
 * Created by UddishVerma on 04/07/16.
 */
public class XboxExclusiveClass {

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
        details.add(new xboxDetails("HALO 5", R.drawable.halo));
        details.add(new xboxDetails("FORZA HORIZON 2",R.drawable.forzatwo));
        details.add(new xboxDetails("SUNSET OVERDRIVE", R.drawable.sunset));
        details.add(new xboxDetails("GEARS OF WAR 4",R.drawable.gears));
        details.add(new xboxDetails("QUANTUM BREAK",R.drawable.quantum));
        details.add(new xboxDetails("STATE OF DECAY",R.drawable.stateofdecay));

        return details;
    }
}
