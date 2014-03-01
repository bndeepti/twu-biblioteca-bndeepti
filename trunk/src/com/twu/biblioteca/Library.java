package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by deeptibn on 2/27/14.
 */
public class Library {

    ArrayList<String> list_of_books;
    ArrayList<String> list_of_menu;
    ArrayList<Movie> list_of_movies;
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
        list_of_movies=new ArrayList<Movie>();
        list_of_movies.add(new Movie("Batman",2005,"Christopher Nolan",8));
        list_of_movies.add(new Movie("Ironman",2004,"Jon Favreau",8));
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

    public String CheckInput(String choice) {
        if(list_of_menu.contains(choice))
            return "Valid option";
        else
            return "Invalid option";
    }


    public String DisplayListOfMovies() {
        String movie="";
        Iterator<Movie> it=list_of_movies.iterator();
        while(it.hasNext()){
            movie+=it.next().name+" ";
        }
        return movie;
    }

    public String CheckOutMovie(String movie) {
        String m;
        int flag=0;
        if(ValidateUserLogin("Jack","123-4567")==true){
            Iterator<Movie> it=list_of_movies.iterator();
            while(it.hasNext()){
                m=it.next().name;
                if(m.equals(movie)&&!customer.movies_held.contains(movie))
                {
                    customer.movies_held.add(m);
                    flag=1;
                }
            }
            if(flag==0)
                return "That movie is not available";
            else
                return "Thank you! Enjoy the movie";
        }
        else return "Incorrect User Credentials";
    }

    public boolean ValidateUserLogin(String name, String library_card_number){
        if(customer.Login(name,library_card_number)==true)
            return true;
        else
            return false;
    }



}
