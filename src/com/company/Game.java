package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Game extends JPanel implements ActionListener, KeyListener {


    Timer tm = new Timer(5, this);
    Level level = new Level1();

    public Player getPlayer() {
        return player;
    }

    Player player;
    Elevator elevator = new Elevator();
    boolean collision;
    boolean isInGame;

    ArrayList<BonusFruit> bonusFruit;
    private JFrame jf;

    public Game() {

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        isInGame = true;
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

        Iterator<BonusFruit> bonusFruitIterator = bonusFruit.iterator();
        while (bonusFruitIterator.hasNext()) {
            BonusFruit fruit = bonusFruitIterator.next();
            if (player.getX() == fruit.getCpuX() && player.getY() == fruit.getCpuY()) {
                player.addBonus(30);
                bonusFruitIterator.remove();
            }
            if (player.getX() == elevator.getX() && player.getY() == elevator.getY()) {
                System.exit(0);
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!player.isdeath) {
            collision();
        }
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
        bonusFruit = new ArrayList<>();
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
        player = new Player();
        if (jf != null){
            jf.setVisible(false);
        }
        jf = new JFrame();
        jf.setTitle("GAME");
        jf.setSize(810, 595);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.add(this);
        jf.setVisible(true);
        collision = false;
        tm.start();
        player.startTimer();
    }

    public void collision() {
        Rectangle rect1 = player.bounds();
        Rectangle rect2 = elevator.bounds();
        if (rect1.intersects(rect2)) {
            collision = true;
            player.stopTimer();


            MenuEndRunner menuEndRunner = new MenuEndRunner(this);
            menuEndRunner.endMenu();
            player.setDelay(0);


        } else {
            collision = false;
            player.collosion(collision);
        }
    }

}
