package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Player extends Entity {

    int x = 0, y = 515, velX = 0;
    Image walkLeft;
    Image walkRight;
    Image idleByRight;
    Image idleByLeft;
    Image deadLeft;
    Image deadRight;
    Image jumpLeft;
    Image jumpRight;
    static int interval = 100;
    static Timer timer;
    int delay = 1000;
    int period = 1000;
    int score = interval; // ezt kell kimentened DR. SIKURA


    Player() {
        timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(setInterval());

            }
        },delay, period);
        walkLeft = Toolkit.getDefaultToolkit().createImage("data/gif/walkLeft.gif");
        walkRight = Toolkit.getDefaultToolkit().createImage("data/gif/walkRight.gif");
        idleByRight = Toolkit.getDefaultToolkit().createImage("data/gif/idleByRight.gif");
        idleByLeft = Toolkit.getDefaultToolkit().createImage("data/gif/idleByLeft.gif");
        deadLeft = Toolkit.getDefaultToolkit().createImage("data/gif/deadLeft.gif");
        deadRight = Toolkit.getDefaultToolkit().createImage("data/gif/deadRight.gif");
        jumpLeft = Toolkit.getDefaultToolkit().createImage("data/gif/jumpLeft.gif");
        jumpRight = Toolkit.getDefaultToolkit().createImage("data/gif/jumpRight.gif");

    }
    private  final int setInterval(){
        // x =769 y =105
        if(interval <= 0 || (x == 769 && y == 105)){

            timer.cancel();
            score = interval;
            System.out.println(score + "eredmeny");
            return 0;
        }
        else {
            return --interval;
        }
    }
    public void die(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (velX <= 0) {
            g.drawImage(deadLeft, x, y, null);
        } else {
            g.drawImage(deadRight, x, y, null);
        }
    }

    public void paintComponent(Graphics g) {
        //bonus data on the screen can be done with JLable too
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.black);
        g2.setFont(new Font("arial", Font.BOLD, 20));
        g2.drawString("Score = " + interval, 50, 50);

        if (velX == 0 && x == 769) {
            g.drawImage(idleByLeft, x, y, null);

        } else if (velX == 0 && x == 1) {
            g.drawImage(idleByRight, x, y, null);
        } else if (velX > 0) {
            g.drawImage(walkRight, x, y, null);
        } else {
            g.drawImage(walkLeft, x, y, null);
        }

    }

    public boolean collosion(boolean acollososion) {
        return acollososion;
    }

    public void update() {
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
        if (x == 769 && y == 515) {
            y = 445;
        }
        if (x == 1 && y == 445) {
            y = 375;
        }
        if (x == 769 && y == 375) {
            y = 305;
        }
        if (x == 1 && y == 305) {
            y = 235;
        }
        if (x == 769 && y == 235) {
            y = 165;
        }
        if (x == 1 && y == 165) {
            y = 95;
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

    public Rectangle bounds() {
        return (new Rectangle(x, y, 50, 50));
    }

    public  int getInterval() {
        return interval;
    }

    public  void setInterval(int interval) {
        Player.interval = interval;
    }
}
