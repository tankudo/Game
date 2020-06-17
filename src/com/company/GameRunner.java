package com.company;

public class GameRunner {

    public static void main(String[] args) {
/*
        MenuEndRunner menuEndRunner=new MenuEndRunner();
        menuEndRunner.endMenu();
*/
        MenuRunner menuRunner = new MenuRunner();
        menuRunner.createMenu();
    }
}
