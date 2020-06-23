package com.company;

import java.awt.*;

public class ElevatorDown extends Elevator {

    ElevatorDown(int x, int speed) {
        super(x, speed);
        y = 80;
        direction = 1;

    }

    public void update() {
        if (y == 571) {
            y = 80;
        }
       super.update();

    }

    @Override
    public void loadImage() {
        elevator = Toolkit.getDefaultToolkit().createImage("data/picture/le40x40.png");
    }
}
