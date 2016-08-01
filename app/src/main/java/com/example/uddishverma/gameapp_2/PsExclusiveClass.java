package com.example.uddishverma.gameapp_2;

import java.util.ArrayList;

/**
 * Created by UddishVerma on 04/07/16.
 */
public class PsExclusiveClass {

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
        details.add(new psDetails("UNCHARTED 4",R.drawable.uncharted));
        details.add(new psDetails("LAST OF US",R.drawable.lastofus));
        details.add(new psDetails("BLOODBORNE",R.drawable.bloodborne));
        details.add(new psDetails("GOD OF WAR",R.drawable.godofwar));
        details.add(new psDetails("INFAMOUS", R.drawable.infamous));
        details.add(new psDetails("UNTIL DAWN", R.drawable.untildawn));

        return details;
    }
}
