package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level1 extends Level   {
    private Image image0;
    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;
    private Image image5;
    private Image image6;
    private Image image7;
    private Image image8;
    private Image image9;
    private Image image10;
    private Image image11;
    private Image image12;
    private Image image13;
    private Image background;


    public Level1() {
        background = Toolkit.getDefaultToolkit().createImage("data/picture/b1.jpg");
        image0 = Toolkit.getDefaultToolkit().createImage("data/gif/380A.gif");
        image1 = Toolkit.getDefaultToolkit().createImage("data/gif/380B.gif");
        image2 = Toolkit.getDefaultToolkit().createImage("data/gif/380C.gif");
        image3 = Toolkit.getDefaultToolkit().createImage("data/gif/380D.gif");
        image4 = Toolkit.getDefaultToolkit().createImage("data/gif/380E.gif");
        image5 = Toolkit.getDefaultToolkit().createImage("data/gif/380F.gif");
        image6 = Toolkit.getDefaultToolkit().createImage("data/gif/320A.gif");
        image7 = Toolkit.getDefaultToolkit().createImage("data/gif/320B.gif");
        image8 = Toolkit.getDefaultToolkit().createImage("data/gif/320C.gif");
        image9 = Toolkit.getDefaultToolkit().createImage("data/gif/320D.gif");
        image10 = Toolkit.getDefaultToolkit().createImage("data/gif/320E.gif");
        image11 = Toolkit.getDefaultToolkit().createImage("data/gif/320F.gif");
        image12 = Toolkit.getDefaultToolkit().createImage("data/gif/arrow.gif");
        image13 = Toolkit.getDefaultToolkit().createImage("data/picture/cpu.png");
    }

    public void paintComponent(Graphics g) {
        System.out.println("Level1");
        g.drawImage(background, 0, 0, null);

        g.drawImage(image12, 770, 390, null);
        g.drawImage(image12, 0, 320, null);
        g.drawImage(image12, 770, 250, null);
        g.drawImage(image12, 0, 180, null);
        g.drawImage(image12, 770, 110, null);
        g.drawImage(image12, 0, 40, null);


        g.drawImage(image0, 0, 390, null);
        g.drawImage(image6, 420, 390, null);
        g.drawImage(image7, 60, 320, null);
        g.drawImage(image1, 420, 320, null);
        g.drawImage(image2, 0, 250, null);
        g.drawImage(image8, 420, 250, null);
        g.drawImage(image9, 60, 180, null);
        g.drawImage(image3, 420, 180, null);
        g.drawImage(image4, 0, 110, null);
        g.drawImage(image10, 420, 110, null);
        g.drawImage(image11, 60, 50, null);
        g.drawImage(image5, 420, 50, null);
        g.drawImage(image13, 60, 350, null);


    }


}
