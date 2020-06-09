package com.company;


import java.awt.*;


public  class Elevator extends Entity {
    int x = 380, y = 80, velX = 0, velY = 1;

    Image elevator;

    public Elevator() {

        elevator = Toolkit.getDefaultToolkit().createImage("data/picture/spider3.png");
    }
    public void paintComponent(Graphics g) {
        g.drawImage(elevator,x,y,null);
    }

    public void update (){
        if (x == 380 && y == 571) {
            y = 80;
        }
        y = y + velY;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public Rectangle bounds (){
        return (new Rectangle(x,y,50,50));
    }

}
