package com.twu.biblioteca;
import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BibliotecaApp {

    Library library;

    public BibliotecaApp(Library library){
        this.library=library;
    }

    public String DisplayWelcomeMessage() {
        return "Welcome to Biblioteca";
    }

    public String DisplayMenuItems() {
        return library.list_of_menu.toString();
    }

    public String CheckInput(String choice) {
        if(library.list_of_menu.contains(choice))
            return "Valid option";
        else
            return "Invalid option";
    }
  /*  public static void TakeInput() throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int choice=0;
        do {
            System.out.print("Enter your choice:");
            choice=Integer.parseInt(x.readLine());
            DelegateInput(choice);
        }while(choice!=4);
    }
    public static String DelegateInput(int choice) throws IOException {
        Library lib=new Library();
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        switch(choice){
          //  case 1:System.out.println(lib.FetchList().toString());
                break;
            case 2:System.out.println("Enter the book you are checking out:");

                lib.CheckOut(x.readLine());

                break;
            case 3:System.out.println("Enter the book you are checking in:");
                lib.CheckIn(x.readLine());
                break;
            default:System.out.println("Invalid option.Select a valid option!");
                return "Invalid option.Select a valid option!";

        }
        return "Valid Option";
    }*/




}
