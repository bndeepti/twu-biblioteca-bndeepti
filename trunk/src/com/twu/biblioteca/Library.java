
package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by deeptibn on 2/27/14.
 */
public class Library {

    ArrayList<String> list_of_books;
    ArrayList<String> list_of_menu;
    Customer customer;

    public Library(Customer customer){
        list_of_books=new ArrayList<String>();
        list_of_books.add("Alchemist");
        list_of_books.add("Inferno");
        list_of_menu=new ArrayList<String>();
        list_of_menu.add("List of books");
        list_of_menu.add("Check Out");
        list_of_menu.add("Check In");
        list_of_menu.add("Exit");
        this.customer=customer;
    }

    public String DisplayListOfBooks() {
        return list_of_books.toString();
    }


    public String CheckOut(String book) {
        if(list_of_books.contains(book)&&!customer.books_held.contains(book)){
            customer.books_held.add(book);
            list_of_books.remove(book);
            return "Thank you! Enjoy the book";
        }
        else
            return "That book is not available";
    }

    public String CheckIn(String book) {
        if(!list_of_books.contains(book)&&customer.books_held.contains(book)){
            customer.books_held.remove(book);
            list_of_books.add(book);
            return "Thank you for returning the book";
        }
        else
            return "That is not a valid book to return";
    }


}
