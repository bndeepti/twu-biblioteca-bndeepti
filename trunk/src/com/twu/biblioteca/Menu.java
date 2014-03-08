package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by deeptibn on 3/5/14.
 */
public class Menu {
   // private final PrintStream out;
    ArrayList<String> menu;
    //public Menu(PrintStream out){
    public Menu(){
        menu=new ArrayList<String>();
        menu.addAll(Arrays.asList("List of Books","Check Out Book","Check In Book","list of Movies","Check Out Movie","Check In Movie","My Profile","Exit"));
       // this.out = out;
    }

    public String DisplayMenuItems() {
        String menu="";
        for(String s:this.menu)
        {
            menu+=s+"\n";
        }
        return menu;
    }


   /* public void run(String s) {
        out.println(s);
    }

    public displayMenu(){
        new Menu(System.out).run("the menu itema are:");

    }*/
}
