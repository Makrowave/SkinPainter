package com.makrowave.app_frame.listener;

import javax.swing.*;

public class ProjectFrame extends JPanel implements DarkModeListener{
    private static boolean MODE = false;

    public ProjectFrame(){
        addListener();
    }

    @Override
    public void darkMode() {
        this.setBackground(DARK_BACKGROUND);
    }

    @Override
    public void lightMode() {
        this.setBackground(LIGHT_BACKGROUND);
    }
    public static void changeMode(){
        if(MODE) {
            for (DarkModeListener object : LISTENERS) {
                object.lightMode();
                MODE = !MODE;
            }
        } else {
            for (DarkModeListener object : LISTENERS) {
                object.darkMode();
                MODE = !MODE;
            }
        }
    }
}
