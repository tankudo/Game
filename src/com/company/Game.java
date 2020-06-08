package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements ActionListener, KeyListener {


    Timer tm = new Timer(5, this);
    Level level = new Level1();
    Player player = new Player();
    BonusFruit bonusFruit = new BonusFruit();
    Elevator elevator = new Elevator();


    public Game() {
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        level.paintComponent(g);
        player.paintComponent(g);
        elevator.paintComponent(g);
        bonusFruit.paintComponent(g);
        if (player.getX() == 30 && player.getY() == 515) {
            bonusFruit.setCpuX(-1000);
            bonusFruit.setCpuY(-1000);
        }
        if (player.getX()==elevator.getX() && player.getY()==elevator.getY() ) {
            System.exit(0);
        }

        System.out.println("game run");
        tm.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        elevator.update();
        player.update();
        repaint();
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if (c == KeyEvent.VK_LEFT) {
            player.setVelX(-1);
        }
        if (c == KeyEvent.VK_RIGHT) {
            player.setVelX(1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void window() {

        Game t = new Game();
        JFrame jf = new JFrame();
        jf.setTitle("GAME");
        jf.setSize(810, 595);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.add(t);

    }


}
