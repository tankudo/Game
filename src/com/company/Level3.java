package com.company;

import java.awt.*;

public class Level3 extends Level {

    public Level3() {
        background = Toolkit.getDefaultToolkit().createImage("data/gif/cityBack3.jpg");
        elevators.add(new ElevatorDown(340, 1));
        elevators.add(new ElevatorUp(340, 1));
        elevators.add(new ElevatorUp(420, 1));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image12, 770, 490, null);
        g.drawImage(image12, 5, 420, null);
        g.drawImage(image12, 770, 350, null);
        g.drawImage(image12, 5, 280, null);
        g.drawImage(image12, 770, 210, null);
        g.drawImage(image12, 5, 140, null);
        g.drawImage(image0, 0, 490, null);
        g.drawImage(image6, 420, 490, null);
        g.drawImage(image7, 60, 420, null);
        g.drawImage(image1, 420, 420, null);
        g.drawImage(image2, 0, 350, null);
        g.drawImage(image8, 420, 350, null);
        g.drawImage(image9, 60, 280, null);
        g.drawImage(image3, 420, 280, null);
        g.drawImage(image4, 0, 210, null);
        g.drawImage(image10, 420, 210, null);
        g.drawImage(image11, 60, 135, null);
        g.drawImage(image5, 420, 135, null);
        g.setFont(new Font("arial", Font.BOLD, 40));
        g.drawString("Level 3", 310, 50);

    }
}
