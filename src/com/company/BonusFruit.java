package com.company;

import java.awt.*;

public class BonusFruit {

    private Image image;

    int cpuX, cpuY; //60 , 515

    public BonusFruit(String file) {

        image = Toolkit.getDefaultToolkit().createImage(file); // "data/gif/cpu1.gif"

    }

    public void paintComponent(Graphics g) {
        g.drawImage(image, getCpuX(), getCpuY(), null);
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
