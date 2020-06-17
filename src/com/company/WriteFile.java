package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {

    String name="győztes";


    public String getName() {
        return name;
    }
    

    public void read() throws FileNotFoundException {
        Player player=new Player();
        PrintWriter f;
        File file ;
        file = new File("Eredmeny.txt");
        f = new PrintWriter(file);
        f.println(getName()+","+player.getScore());
        f.close();

    }



}
