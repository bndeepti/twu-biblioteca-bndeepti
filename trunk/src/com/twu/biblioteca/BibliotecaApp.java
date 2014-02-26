package com.twu.biblioteca;
import com.sun.tools.doclets.internal.toolkit.util.DocFinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        WelcomeMsg();
        DisplayMenu();
        TakeInput();
    }
    public static String WelcomeMsg(){
        String msg="Welcome to Biblioteca";
        System.out.println("Welcome to Biblioteca");
        return msg;
    }
    public static String DisplayMenu() throws IOException {
        String menu="The menu items are:\n1.View list of books\n2.Check out books\n3.Check in books\n4.Exit";
        System.out.println("The menu items are:\n1.View list of books\n2.Check out books\n3.Check in books\n4.Exit");
        return menu;
    }
    public static void TakeInput() throws IOException {
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
            case 1:System.out.println(lib.FetchList().toString());
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
    }




}
