package com.company;

import java.awt.*;

public class Level1 extends Level {
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
    private Image background;


    public Level1() {
        background = Toolkit.getDefaultToolkit().createImage("data/picture/image2.png");
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

    }

    public void paintComponent(Graphics g) {
        System.out.println("Level1");
        g.drawImage(background, 0, 0, null);

        g.drawImage(image12, 770, 490, null);
        g.drawImage(image12, 0, 420, null);
        g.drawImage(image12, 770, 350, null);
        g.drawImage(image12, 0, 280, null);
        g.drawImage(image12, 770, 210, null);
        g.drawImage(image12, 0, 140, null);


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
        g.drawImage(image11, 60, 145, null);
        g.drawImage(image5, 420, 145, null);


    }
}



