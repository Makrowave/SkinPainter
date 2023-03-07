package com.makrowave.app_frame;

import com.makrowave.app_frame.listener.ProjectFrame;

import javax.swing.*;

public class ApplicationFrame extends JFrame {
    private static ApplicationFrame MAIN_FRAME = null;
    private ApplicationFrame() {
        ProjectFrame projectFrame = new ProjectFrame();
        projectFrame.setSize(200, 200);
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(projectFrame);
        this.pack();
        this.setVisible(true);
        this.setSize(200, 200);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ProjectFrame.changeMode();
    }
    public static ApplicationFrame create() {
        if(MAIN_FRAME==null)
            MAIN_FRAME = new ApplicationFrame();
        return MAIN_FRAME;
    }
}