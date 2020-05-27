package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Player extends Entity{
    int x = 0, y = 430, velX = 0;

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 30, 30);

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
        if (x == 769 && y == 430) {
            y = 360;
        }
        if (x == 1 && y == 360) {
            y = 290;
        }
        if (x == 769 && y == 290) {
            y = 220;
        }
        if (x == 1 && y == 220) {
            y = 150;
        }
        if (x == 769 && y == 150) {
            y = 80;
        }
        if (x == 1 && y == 80) {
            y = 20;
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
