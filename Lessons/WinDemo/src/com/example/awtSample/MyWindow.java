package com.example.awtSample;

//Imported packages
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    //Settings for the window
    public MyWindow(String title) {
        super(title);
        setSize(1280, 720);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //Graphical settings for fonts and printed text
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("Java Programming Masterclass for Software Developers", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}
