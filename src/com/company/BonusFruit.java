package com.company;

import java.awt.*;

public class BonusFruit {
    private Image image13;

    int cpuX = 60, cpuY = 515;

    public BonusFruit() {

        image13 = Toolkit.getDefaultToolkit().createImage("data/gif/orb2.gif");

    }

    public void paintComponent(Graphics g){
        g.drawImage(image13, getCpuX(), getCpuY(), null);
    }
    public int getCpuX() {
        return cpuX;
    }

    public void setCpuX(int cpuX) {
        this.cpuX = cpuX;
    }

    public int getCpuY() {
        return cpuY;
    }

    public void setCpuY(int cpuY) {
        this.cpuY = cpuY;
    }

}
