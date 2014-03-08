package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BibliotecaApp {

   Library library;
    public Customer current_customer;

    public BibliotecaApp(Library library){
        this.library=library;
    }

    public String DisplayWelcomeMessage() {
        return "Welcome to Biblioteca";
    }

    public String DisplayMenuItems() {
        return library.libmenu.DisplayMenuItems();
    }

    private String DisplayListOfBooks() {
        return library.DisplayListOfBooks();
    }

    private String DisplayListOfMovies() {
        return library.DisplayListOfMovies();
    }

    public String CheckInput(String choice) {
        if(library.libmenu.menu.contains(choice))
            return "Valid option";
        else
            return "Invalid option";
    }

    public boolean UserLogin(String name, String library_card_number){
        int flag=0;
        for(Customer customer:library.repository.customers){
            if(customer.name.equals(name) && customer.libcardnum.equals(library_card_number)){
                current_customer=customer;
                current_customer.loginstatus=true;
                flag=1;
            }
        }
        if(flag==0)
            return false;
        else
            return true;
    }

    public String CheckOutBook(String book,Customer customer) {
        if(library.CheckOutBook(book, customer)==true)
            return "Thank you! Enjoy the book";
        else
            return "That book is not available";
    }

    public String CheckInBook(String book,Customer customer) {
        if(library.CheckInBook(book, customer)==true)
            return "Thank you for returning the book";
        else
            return "That is not a valid book to return";
    }


    public String DisplayCustomerProfile() {
        if(current_customer!=null)
            return current_customer.DisplayCustomerProfile();
        else
            return "Please Login\n";
    }

    public String CheckOutMovie(String movie,Customer customer) {
        if(library.CheckOutMovie(movie, customer)==true)
            return "Thank you! Enjoy the movie";
        else
            return "That movie is not available";
    }

    public String CheckInMovie(String movie,Customer customer) {
        if(library.CheckInMovie(movie, customer)==true)
            return "Thank you for returning the movie";
        else
            return "That is not a valid movie to return";
    }

    /*public void TakeInput() throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int choice=0;
        do {
            System.out.print("Enter your choice:");
            choice=Integer.parseInt(x.readLine());
            DelegateMenu(choice);
        }while(choice!=4);
    }
    public String DelegateMenu(int choice) throws IOException {

      /*  BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        switch(choice){
            case 1:library.DisplayListOfBooks();
                break;
            case 2:System.out.println("Enter the book you are checking out:");

                library.CheckOut(x.readLine());

                break;
            case 3:System.out.println("Enter the book you are checking in:");
                library.CheckIn(x.readLine());
                break;
            default:System.out.println("Invalid option.Select a valid option!");
                return "Invalid option.Select a valid option!";

        }*/
        //return "Valid Option";
    //}
    public static void main(String[] args)throws IOException{
        BibliotecaApp bibliotecaApp=new BibliotecaApp(new Library());
        System.out.println(bibliotecaApp.DisplayWelcomeMessage());
        System.out.println("\nThe menu items are:\n" + bibliotecaApp.DisplayMenuItems());
        String name,libnum;
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int choice=0;
        do {
            System.out.print("Enter your choice:");
            choice=Integer.parseInt(x.readLine());
            switch(choice){
                case 1:System.out.println("List of books:");
                    System.out.print(bibliotecaApp.DisplayListOfBooks());
                    break;
                case 2:System.out.print("Enter your name and library card number to sign in:\nName:");
                    name=x.readLine();
                    System.out.print("Library card number:");
                    libnum=x.readLine();
                    if(bibliotecaApp.UserLogin(name,libnum)){
                    System.out.println("Enter the book you are checking out:");
                    System.out.println(bibliotecaApp.CheckOutBook(x.readLine(), bibliotecaApp.current_customer));
                    }
                    else
                        System.out.print("Invalid credentials\n");
                    break;
                case 3:System.out.print("Enter your name and library card number to sign in:\nName:");
                    name=x.readLine();
                    System.out.print("Library card number:");
                    libnum=x.readLine();
                    if(bibliotecaApp.UserLogin(name,libnum)){
                    System.out.println("Enter the book you are checking in:");
                    System.out.println(bibliotecaApp.CheckInBook(x.readLine(), bibliotecaApp.current_customer));
                    }
                    else
                        System.out.print("Invalid credentials\n");
                    break;
                case 4:System.out.println("List of movies:");
                    System.out.println(bibliotecaApp.DisplayListOfMovies());
                    break;
                case 5:System.out.print("Enter your name and library card number to sign in:\nName:");
                    name=x.readLine();
                    System.out.print("Library card number:");
                    libnum=x.readLine();
                    if(bibliotecaApp.UserLogin(name,libnum)){
                    System.out.println("Enter the movie you are checking out:");
                    System.out.println(bibliotecaApp.CheckOutMovie(x.readLine(), bibliotecaApp.current_customer));
                    }
                    else
                        System.out.print("Invalid credentials\n");
                    break;
                case 6:System.out.print("Enter your name and library card number to sign in:\nName:");
                    name=x.readLine();
                    System.out.print("Library card number:");
                    libnum=x.readLine();
                    if(bibliotecaApp.UserLogin(name,libnum)){
                    System.out.println("Enter the movie you are checking in:");
                    System.out.println(bibliotecaApp.CheckInMovie(x.readLine(), bibliotecaApp.current_customer));
                    }
                    else
                        System.out.print("Invalid credentials\n");
                    break;
                case 7:
                    System.out.print(bibliotecaApp.DisplayCustomerProfile());
                    break;
                case 8:break;
                default:System.out.println("Invalid option.Select a valid option!");
                    break;
            }
        }while(choice!=8);

    }  
  /* private final PrintStream out;

    public BibliotecaApp(PrintStream out) {
        this.out = out;
    }

    public static void main(String[] args) {
        new BibliotecaApp(System.out).run("Welcome to Biblioteca");
    }

    public void run(String s) {
        out.println(s);
    }*/



}
