package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;


/**
 * Created by deeptibn on 2/24/14.
 */
public class Library {

    public List<String> list_of_books=new ArrayList<String>();
    public static String status_msg="";
    public Library(){
        list_of_books.add("Da Vinci Code");
        list_of_books.add("The Alchemist");
        list_of_books.add("Harry Potter");
    }
    public void AddBooks(){


    }
    public List<String> FetchList() {
        //list_of_books.add("Da Vinci Code");
       // list_of_books.add("The Alchemist");
        //list_of_books.add("Harry Potter");
        //System.out.println(list_of_books);
        /*List<String> s=new ArrayList<String>();
        for(Book b: list_of_books){
            s.add(b.Name);
            System.out.println(b.Name+" "+b.copies);
        }*/
        return list_of_books;
    }
    public List<String> CheckOut(String book){

        if(list_of_books.contains(book)){
        Customer.books[Customer.no_of_books]=book;
        Customer.no_of_books++;
            list_of_books.remove(book);
            status_msg="Thank you! Enjoy the book";
        }

        /*int flag=0;
        int n=-1;
            for(Book b: list_of_books){
                if(b.Name.equals(book)){
                    //Book bookChosen=b;
                    b.copies=b.copies-1;
                    flag=1;
                    FetchList();
                    n=b.copies;

                }
            }
        if(flag==0)
        {
            System.out.println("Book not valid.Please view the list of books");
            n=-1;
        }
        return n;*/
        //if(list_of_books.contains(book)){
          //  list_of_books.remove(book);
        //System.out.print("Thank you! Enjoy the book");
        //}
        else{
            //System.out.print("That book is not available.");
            status_msg="That book is not available";
        }
        for(int index=0;index<Customer.no_of_books;index++)
            System.out.println(Customer.books[index]);
        return list_of_books;


    }
    public List<String> CheckIn(String book){
        int flag=0;
        /*int flag=0;
        int n=-1;
            for(Book b: list_of_books){
                if(b.Name.equals(book)){
                    //Book bookChosen=b;
                    b.copies=b.copies+1;
                    FetchList();
                    n=b.copies;
                    flag=1;
                }
            }
        if(flag==0)
        {
            System.out.println("Book not valid.Please view the list of books");
            n=-1;
        }
        FetchList();
        return n;*/
        if(!list_of_books.contains(book)){
            for (int i=0;i<Customer.no_of_books;i++){
                if(Customer.books[i].equals(book));
                flag=1;
                list_of_books.add(book);
                System.out.println("Thank you for returning the book.");
                status_msg="Thank you for returning the book";

            }
            if(flag==0)
                status_msg="That is not a valid book to return";

        }
        //System.out.print("Thank you for returning the book.");
        return list_of_books;


    }
}
