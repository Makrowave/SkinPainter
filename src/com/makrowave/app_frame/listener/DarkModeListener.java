package com.makrowave.app_frame.listener;

import java.awt.*;
import java.util.ArrayList;

public interface DarkModeListener extends Listener{
    ArrayList<DarkModeListener> LISTENERS = new ArrayList<>();
    Color DARK_BACKGROUND = Color.BLACK; //placeholder
    Color LIGHT_BACKGROUND = Color.WHITE; //placeholder
    @Override
    default void addListener(){
        LISTENERS.add(this);
    }

    static void changeMode() {

    }

    void darkMode();
    void lightMode();

}
