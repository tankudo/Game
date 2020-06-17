package com.company;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuEndRunner extends JPanel implements ActionListener, KeyListener, LineListener {
    JFrame menue;
    Menu endmenu = new MenuEnd();
    Player player=new Player();
    Timer tm = new Timer(5, this);
    JTextField textField;
    JButton buttonNewGame;
    JButton buttonSubmit;
    JButton buttonExit;
    Game game = new Game();
    String endScore;
    String name;

    public MenuEndRunner() {
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        this.textField = new JTextField(25);
        this.buttonNewGame = new JButton("NEW GAME");
        this.buttonSubmit = new JButton("NAME SUBMIT");
        this.buttonExit = new JButton("EXIT");
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        endmenu.paintComponent(g);

        tm.start();
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
            game.window();
            game.jf.setVisible(false);
            menue.setVisible(false);





        }
    }

    public void submit(ActionEvent event){
        if (event.getActionCommand().equals("NAME SUBMIT")) {
           name=textField.getText();
            System.out.println(name);

        }
    }

    public void endMenu() {
        menue = new JFrame();
        menue.setTitle("ENDMENU");
        menue.setSize(650, 550);
        menue.setVisible(true);
        menue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menue.setLocationRelativeTo(null);
        menue.setResizable(false);
        menue.setLocationRelativeTo(null);

        MenuEndRunner panel2 = new MenuEndRunner();
        panel2.setLayout(null);
        menue.add(panel2);

        JLabel label1 = new JLabel("GAME OVER:");
        label1.setBounds(200, 30, 500, 100);
        label1.setFont(new Font("Courier", Font.BOLD, 36));
        label1.setForeground(Color.RED);
        panel2.add(label1);

        JLabel label2 = new JLabel("SCORE:");
        label2.setBounds(200, 130, 500, 100);
        label2.setFont(new Font("Courier", Font.BOLD, 36));
        label2.setForeground(Color.RED);
        panel2.add(label2);

        endScore=Integer.toString(player.score);
        JLabel label3 = new JLabel(endScore);
        label3.setBounds(370, 130, 500, 100);
        label3.setFont(new Font("Courier", Font.BOLD, 36));
        label3.setForeground(Color.RED);
        panel2.add(label3);


        textField.setBounds(230, 250, 200, 30);
        panel2.add(textField);

        buttonSubmit.setBounds(210, 300, 250, 40);
        buttonSubmit.setFont(new Font("Bauhaus 93", Font.BOLD, 28));
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setBackground(new Color(0.6f, 0.6f, 0.6f, 0.6f));
        panel2.add(buttonSubmit);
        buttonSubmit.addActionListener(this::submit);




        buttonNewGame.setBounds(30, 450, 250, 40);
        buttonNewGame.setFont(new Font("Bauhaus 93", Font.BOLD, 28));
        buttonNewGame.setForeground(Color.BLACK);
        buttonNewGame.setBackground(new Color(0.6f, 0.6f, 0.6f, 0.6f));
        panel2.add(buttonNewGame);
        buttonNewGame.addActionListener(this::newGame);


        buttonExit.setBounds(350, 450, 250, 40);
        buttonExit.setFont(new Font("Bauhaus 93", Font.BOLD, 28));
        buttonExit.setForeground(Color.BLACK);
        buttonExit.setBackground(new Color(0.6f, 0.6f, 0.6f, 0.6f));
        panel2.add(buttonExit);
        buttonExit.addActionListener(this::exit);


    }
}
