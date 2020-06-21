package com.company;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuEndRunner extends JPanel implements ActionListener, KeyListener, LineListener {
    private JFrame menue;
    private Menu endmenu = new MenuEnd();
    private JTextField textField;
    private JButton buttonNewGame;
    private JButton buttonSubmit;
    private JButton buttonExit;
    private Game game;
    private String endScore;
    private String name;
    private JLabel label3 = new JLabel();

    public MenuEndRunner(Game game) {

        this.game = game;
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        this.textField = new JTextField(25);
        this.buttonNewGame = new JButton("NEW GAME");
        this.buttonSubmit = new JButton("NAME SUBMIT");
        this.buttonExit = new JButton("EXIT");
        this.setLayout(null);
        JLabel label1 = new JLabel("GAME OVER:");
        label1.setBounds(200, 30, 500, 100);
        label1.setFont(new Font("Courier", Font.BOLD, 36));
        label1.setForeground(Color.RED);
        this.add(label1);

        JLabel label2 = new JLabel("SCORE:");
        label2.setBounds(200, 130, 500, 100);
        label2.setFont(new Font("Courier", Font.BOLD, 36));
        label2.setForeground(Color.RED);
        this.add(label2);


        label3.setBounds(370, 130, 500, 100);
        label3.setFont(new Font("Courier", Font.BOLD, 36));
        label3.setForeground(Color.RED);
        this.add(label3);


        textField.setBounds(230, 250, 200, 30);
        this.add(textField);

        buttonSubmit.setBounds(210, 300, 250, 40);
        buttonSubmit.setFont(new Font("Bauhaus 93", Font.BOLD, 28));
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setBackground(new Color(0.6f, 0.6f, 0.6f, 0.6f));
        this.add(buttonSubmit);
        buttonSubmit.addActionListener(this::submit);


        buttonNewGame.setBounds(30, 450, 250, 40);
        buttonNewGame.setFont(new Font("Bauhaus 93", Font.BOLD, 28));
        buttonNewGame.setForeground(Color.BLACK);
        buttonNewGame.setBackground(new Color(0.6f, 0.6f, 0.6f, 0.6f));
        this.add(buttonNewGame);
        buttonNewGame.addActionListener(this::newGame);


        buttonExit.setBounds(350, 450, 250, 40);
        buttonExit.setFont(new Font("Bauhaus 93", Font.BOLD, 28));
        buttonExit.setForeground(Color.BLACK);
        buttonExit.setBackground(new Color(0.6f, 0.6f, 0.6f, 0.6f));
        this.add(buttonExit);
        buttonExit.addActionListener(this::exit);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        endmenu.paintComponent(g);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void update(LineEvent event) {
    }

    public void exit(ActionEvent event) {
        if (event.getActionCommand().equals("EXIT")) {
            menue.dispatchEvent(new WindowEvent(menue, WindowEvent.WINDOW_CLOSING));
        }
    }

    public void newGame(ActionEvent event) {
        if (event.getActionCommand().equals("NEW GAME")) {
            menue.setVisible(false);
            if (game != null) {
                game.endGame();
            }
            game = new Game();
            game.window();



        }
    }

    public void submit(ActionEvent event) {
        if (event.getActionCommand().equals("NAME SUBMIT")) {
            name = textField.getText();
            System.out.println(name);

        }
    }

    public void endMenu() {
        menue = new JFrame();
        menue.setTitle("ENDMENU");
        menue.setSize(650, 550);
        menue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menue.setLocationRelativeTo(null);
        menue.setResizable(false);
        menue.setLocationRelativeTo(null);
        endScore = Integer.toString(game.getPlayer().score);
        label3.setText(endScore);
        menue.add(this);
        menue.setVisible(true);
    }

}
