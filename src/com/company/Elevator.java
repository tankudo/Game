package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Elevator extends Entity implements ActionListener {

    private Image background;
    private Image elevator;

    Timer tm = new Timer(11, null);
    int x = 118, y = 0, velX = 0, velY = 1;

    public Elevator() {
        tm.start();
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        background = Toolkit.getDefaultToolkit().createImage("b1.png");
        elevator = Toolkit.getDefaultToolkit().createImage("le.png");
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(background, 0, 0, this);
        g.drawImage(elevator, x, y, this);

        g.fillRect(x, y, 0, 0);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (x == 118 && y == 250) {
            y = 0;
        }
        y = y + velY;
        repaint();
    }
}
