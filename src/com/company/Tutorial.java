package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tutorial extends JPanel implements ActionListener, KeyListener {
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
    private Image lift;
    private int liftX;
    private int liftY;

    Timer tm = new Timer(5, this);
    int x = 0, y = 430, velX = 0, velY = 0;

    public Tutorial() {
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
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
        super.paintComponent(g);
        g.drawImage(background, 0, 0, this);
        g.setColor(Color.white);
        g.drawImage(image12, 770, 390, this);
        g.drawImage(image12, 0, 320, this);
        g.drawImage(image12, 770, 250, this);
        g.drawImage(image12, 0, 180, this);
        g.drawImage(image12, 770, 110, this);
        g.drawImage(image12, 0, 40, this);

        g.fillRect(x, y, 30, 30);
        g.drawImage(image0, 0, 390, this);
        g.drawImage(image6, 420, 390, this);
        g.drawImage(image7, 60, 320, this);
        g.drawImage(image1, 420, 320, this);
        g.drawImage(image2, 0, 250, this);
        g.drawImage(image8, 420, 250, this);
        g.drawImage(image9, 60, 180, this);
        g.drawImage(image3, 420, 180, this);
        g.drawImage(image4, 0, 110, this);
        g.drawImage(image10, 420, 110, this);
        g.drawImage(image11, 60, 50, this);
        g.drawImage(image5, 420, 50, this);
        g.drawImage(image13, 60, 350, this);

        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if (c == KeyEvent.VK_LEFT) {
            velX = -1;
        }
        if (c == KeyEvent.VK_RIGHT) {
            velX = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (x == 0) {
            velX = 0;
        }

    }

    public void window(){
        Tutorial t = new Tutorial();
        JFrame jf = new JFrame();
        jf.setTitle("Progmatic");
        jf.setSize(800, 495);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);

    }



}
