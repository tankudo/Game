package com.company;

import java.awt.*;

public class Player extends Entity{

    int x = 0, y = 415, velX = 0;
    Image walkLeft;
    Image walkRight;
    Image idleByRight;
    Image idleByLeft;
    Image deadLeft;
    Image standRight;
    Image jumpLeft;
    Image jumpRight;

    Player(){
        walkLeft = Toolkit.getDefaultToolkit().createImage("data/gif/walkLeft.gif");
        walkRight = Toolkit.getDefaultToolkit().createImage("data/gif/walkRight.gif");
        idleByRight = Toolkit.getDefaultToolkit().createImage("data/gif/idleByRight.gif");
        idleByLeft = Toolkit.getDefaultToolkit().createImage("data/gif/idleByLeft.gif");
        deadLeft = Toolkit.getDefaultToolkit().createImage("data/gif/deadLeft.gif");
        standRight = Toolkit.getDefaultToolkit().createImage("data/gif/deadRight.gif");
        jumpLeft = Toolkit.getDefaultToolkit().createImage("data/gif/jumpLeft.gif");
        jumpRight = Toolkit.getDefaultToolkit().createImage("data/gif/jumpRight.gif");
    }

    public void paintComponent(Graphics g) {
        if(velX == 0 && x == 769){
            g.drawImage(idleByLeft,x,y,null);
        }
        else if(velX == 0 && x == 1){
            g.drawImage(idleByRight,x,y,null);
        }
        else if(velX > 0) {
            g.drawImage(walkRight,x,y,null);
        }
        else {
            g.drawImage(walkLeft,x,y,null);
        }

    }

    public void update () {
        if (x < 0 || x > 770) {
            velX = -velX;
        }
        if (x == 0) {
            velX = 0;
            x = 1;

        }
        if (x == 770) {
            velX = 0;
            x = 769;
        }
        if (x == 769 && y == 415) {
            y = 345;
        }
        if (x == 1 && y == 345) {
            y = 275;
        }
        if (x == 769 && y == 275) {
            y = 205;
        }
        if (x == 1 && y == 205) {
            y = 135;
        }
        if (x == 769 && y == 135) {
            y = 65;
        }
        if (x == 1 && y == 65) {
            y = 5;
        }
        x = x + velX;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }
}
