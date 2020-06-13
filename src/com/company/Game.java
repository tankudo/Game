package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Game extends JPanel implements ActionListener, KeyListener {


    Timer tm = new Timer(5, this);
    Level level = new Level1();
    Player player = new Player();
    Elevator elevator = new Elevator();
    boolean collision;
    ArrayList<BonusFruit> bonusFruit = new ArrayList<>();

    public void deleteFruit() {
        ArrayList<BonusFruit> delFruit = new ArrayList<>();
        for (BonusFruit fruit : bonusFruit) {
            if (player.getX() == fruit.getCpuX() && player.getY() == fruit.getCpuY()) {
                delFruit.add(fruit);
            }
        }
        if (delFruit.size() > 0) {
            delFruit.remove(0);
        }
    }

    public Game() {
        for (int i = 1; i < 15; i++) {
            BonusFruit fruit = new BonusFruit("data/gif/bf" + i + ".gif");
            bonusFruit.add(fruit);
            if (i % 2 != 0) {
                fruit.setCpuX(60);
                fruit.setCpuY(550 - i * 35);
            } else {
                fruit.setCpuX(690);
                fruit.setCpuY(585 - i * 35);
            }
        }
        deleteFruit();
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        level.paintComponent(g);
        if (collision) {
            player.die(g);
        } else {
            player.paintComponent(g);
        }
        elevator.paintComponent(g);
        for (BonusFruit fruit : bonusFruit) {
            fruit.paintComponent(g);
        }
        for (BonusFruit fruit : bonusFruit) {
            if (player.getX() == fruit.getCpuX() && player.getY() == fruit.getCpuY()) {
                bonusFruit.remove(fruit);
                player.setInterval(player.getInterval() + 5);
            }
            if (player.getX() == elevator.getX() && player.getY() == elevator.getY()) {
                System.exit(0);
            }

            tm.start();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        collision();
        repaint();
        if (!collision) {
            elevator.update();
            player.update();
        }

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

    public void collision() {
        Rectangle rect1 = player.bounds();
        Rectangle rect2 = elevator.bounds();
        if (rect1.intersects(rect2)) {
            collision = true;
        } else {
            collision = false;
            player.collosion(collision);
        }
    }

    public boolean isCollision() {
        return collision;
    }
}
