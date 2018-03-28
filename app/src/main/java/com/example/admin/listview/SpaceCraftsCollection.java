package com.example.admin.listview;

import java.util.ArrayList;

/**
 * Created by admin on 10/17/2016.
 */
public class SpaceCraftsCollection {

    public static ArrayList<SpaceCraft>getSpaceCrafts(){
        ArrayList<SpaceCraft>spaceCrafts=new ArrayList<>();
        SpaceCraft spaceCraft=null;

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Balloon");
        spaceCraft.setImage(R.drawable.icon_balloon);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Candle");
        spaceCraft.setImage(R.drawable.icon_candle);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Green");
        spaceCraft.setImage(R.drawable.icon_green);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Image");
        spaceCraft.setImage(R.drawable.icon_image);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Lief");
        spaceCraft.setImage(R.drawable.icon_lief);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Liefs");
        spaceCraft.setImage(R.drawable.icon_liefs);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Location");
        spaceCraft.setImage(R.drawable.icon_location);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Plant");
        spaceCraft.setImage(R.drawable.icon_plant);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Ribbon");
        spaceCraft.setImage(R.drawable.icon_ribbon);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Right");
        spaceCraft.setImage(R.drawable.icon_right);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Star");
        spaceCraft.setImage(R.drawable.icon_star);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Tree");
        spaceCraft.setImage(R.drawable.icon_tree);
        spaceCrafts.add(spaceCraft);


        return spaceCrafts;
    }
}
