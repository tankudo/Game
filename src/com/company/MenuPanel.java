package com.company;


import java.awt.*;


public class MenuPanel extends Menu {


    private Image menubackground;


    public MenuPanel() {

        menubackground = Toolkit.getDefaultToolkit().createImage("data/gif/test2.gif");
        System.out.println("Menulvl");
    }


    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(menubackground, 0, 0, null);
    }


}