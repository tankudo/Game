package com.company;


import java.awt.*;


public abstract class Elevator extends Entity {
    int x, y, direction, speed;

    protected Image elevator;

     Elevator(int x, int speed) {
         this.x = x;
         this.speed = speed;
         loadImage();
        //elevator = Toolkit.getDefaultToolkit().createImage("data/picture/le40x40.png");
    }
    public void paintComponent(Graphics g) {
        g.drawImage(elevator,x,y,null);
//        g.setColor(Color.red);
//        g.drawRect(x,y, 50, 50);
    }

    public void update() {
        y = y + direction*speed;
    }
    public abstract void loadImage();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle bounds(){
        return (new Rectangle(x,y,50,50));
    }
}
