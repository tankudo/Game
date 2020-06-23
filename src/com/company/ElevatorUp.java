package com.company;

import java.awt.*;

public class ElevatorUp extends Elevator {

    ElevatorUp(int x, int speed) {
        super(x, speed);
        y = 571;
        direction = -1;


    }

    public void update() {
        if (y == 80) {
            y = 571;
        }
       super.update();


    }

    @Override
    public void loadImage() {
        elevator = Toolkit.getDefaultToolkit().createImage("data/picture/fel40x40.jpeg");

    }
}
