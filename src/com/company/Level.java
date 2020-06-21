package com.company;

import java.awt.*;
import java.util.ArrayList;

public abstract class Level {
    protected Image image0;
    protected Image image1;
    protected Image image2;
    protected Image image3;
    protected Image image4;
    protected Image image5;
    protected Image image6;
    protected Image image7;
    protected Image image8;
    protected Image image9;
    protected Image image10;
    protected Image image11;
    protected Image image12;
    protected Image background;
    ArrayList<Elevator> elevators = new ArrayList<>();

    public Level() {

        image0 = Toolkit.getDefaultToolkit().createImage("data/gif/wall320.png");
        image1 = Toolkit.getDefaultToolkit().createImage("data/gif/wall320.png");
        image2 = Toolkit.getDefaultToolkit().createImage("data/gif/wall320.png");
        image3 = Toolkit.getDefaultToolkit().createImage("data/gif/wall320.png");
        image4 = Toolkit.getDefaultToolkit().createImage("data/gif/wall320.png");
        image5 = Toolkit.getDefaultToolkit().createImage("data/gif/wall320.png");
        image6 = Toolkit.getDefaultToolkit().createImage("data/gif/wall380.png");
        image7 = Toolkit.getDefaultToolkit().createImage("data/gif/wall380.png");
        image8 = Toolkit.getDefaultToolkit().createImage("data/gif/wall380.png");
        image9 = Toolkit.getDefaultToolkit().createImage("data/gif/wall380.png");
        image10 = Toolkit.getDefaultToolkit().createImage("data/gif/wall380.png");
        image11 = Toolkit.getDefaultToolkit().createImage("data/gif/wall380.png");
        image12 = Toolkit.getDefaultToolkit().createImage("data/gif/rArrow.gif");



    }

    public void paintComponent(Graphics g){
        g.drawImage(background, 0, 70, null);
    }

    public ArrayList<Elevator> getElevators() {
        return elevators;
    }
}
