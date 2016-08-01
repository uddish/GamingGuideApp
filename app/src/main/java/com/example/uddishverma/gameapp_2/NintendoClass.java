package com.example.uddishverma.gameapp_2;

import java.util.ArrayList;

/**
 * Created by UddishVerma on 06/07/16.
 */
public class NintendoClass {

    public static class nintendoDetails{
        String name;
        int picture;

        public nintendoDetails(String name, int picture) {
            this.name = name;
            this.picture = picture;
        }
    }

    public static ArrayList<nintendoDetails> getDetails()   {
        ArrayList<nintendoDetails> details = new ArrayList<>();

        details.add(new nintendoDetails("SUPER MARIO BROS", R.drawable.mario));
        details.add(new nintendoDetails("SUPER MARIO BROS 3", R.drawable.mario3));
        details.add(new nintendoDetails("SUPER MARIO GALAXY", R.drawable.mariogalaxy));
        details.add(new nintendoDetails("SUPER MARIO 64", R.drawable.mariosixty));
        details.add(new nintendoDetails("LEGENDS OF ZELDA", R.drawable.zelda));
        details.add(new nintendoDetails("ANIMAL CROSSING", R.drawable.animal));
        details.add(new nintendoDetails("YOSHI'S ISLAND", R.drawable.yoshi));
        details.add(new nintendoDetails("TETRIS", R.drawable.tetris));
        details.add(new nintendoDetails("DONKEY KONG COUNTRY", R.drawable.donkey));
        details.add(new nintendoDetails("FIRE EMBLEM", R.drawable.fire));
        details.add(new nintendoDetails("POKEMON X&Y", R.drawable.pokemon));
        return details;

    }
}
