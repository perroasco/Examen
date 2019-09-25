package org.fer.examen;

import java.util.ArrayList;

public class ListDataHelper {

    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.play, "BLUE BRIGHT", android.R.color.holo_blue_bright));
        list.add(new ListViewItem(R.drawable.play, "BLUE LIGHT", android.R.color.holo_blue_light));
        list.add(new ListViewItem(R.drawable.play, "GREEN LIGHT", android.R.color.holo_green_light));
        list.add(new ListViewItem(R.drawable.play, "ORANGE LIGHT", android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.play, "RED LIGHT", android.R.color.holo_red_light));
        list.add(new ListViewItem(R.drawable.play, "PURPLE", android.R.color.holo_purple));
        list.add(new ListViewItem(R.drawable.play, "BLUE DARK", android.R.color.holo_blue_dark));
        list.add(new ListViewItem(R.drawable.play, "GREEN DARK", android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.play, "RED DARK", android.R.color.holo_red_dark));
        list.add(new ListViewItem(R.drawable.play, "ORANGE DARK", android.R.color.holo_orange_dark));


        return list;
    }

}
