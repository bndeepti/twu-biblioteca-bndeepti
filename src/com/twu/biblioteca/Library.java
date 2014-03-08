package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by deeptibn on 2/27/14.
 */
public class Library {

    Menu libmenu;
    Repository repository;
    ArrayList<Book> checkedOutBooks;
    ArrayList<Movie> checkedOutMovies;

    public Library(){
        repository=new Repository();
        libmenu=new Menu();
        checkedOutBooks=new ArrayList<Book>();
        checkedOutMovies=new ArrayList<Movie>();
    }

   public String DisplayListOfBooks() {

       String s="";
       for(Book book1 : repository.books ){
           if(!checkedOutBooks.contains(book1))
           s+=book1.title+"\n";
       }
       return s;
   }

    public String DisplayListOfMovies() {

        String s="";
        for(Movie movie1 : repository.movies ){
            if(!checkedOutMovies.contains(movie1))
            s+=movie1.name+"\n";
        }
        return s;
    }

    public boolean CheckOutBook(String book, Customer customer) {
        int flag=0;
        for(Book book1 : repository.books ){
            if(book1.title.equals(book) && !checkedOutBooks.contains(book1)){
                customer.books_held.add(book1);
                //repository.books.remove(book1);
                checkedOutBooks.add(book1);
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

    public boolean CheckInBook(String book, Customer customer) {
        int flag=0;
        for(Book book1 : repository.books ){
            if(book1.title.equals(book) && checkedOutBooks.contains(book1) && customer.books_held.contains(book1)){
                customer.books_held.remove(book1);
                //repository.books.add(book1);
                checkedOutBooks.remove(book1);
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

    public boolean CheckOutMovie(String movie, Customer customer) {
        int flag=0;
        for(Movie movie1 : repository.movies ){
            if(movie1.name.equals(movie) && !checkedOutMovies.contains(movie1)){
                customer.movies_held.add(movie1);
                //repository.books.remove(book1);
                checkedOutMovies.add(movie1);
                flag=1;
                break;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }

    public boolean CheckInMovie(String movie, Customer customer) {
        int flag=0;

            for(Movie movie1 : repository.movies ){
                if(movie1.name.equals(movie) && checkedOutMovies.contains(movie1)&&customer.movies_held.contains(movie1)){
                    customer.movies_held.remove(movie1);
                    //repository.books.remove(book1);
                    checkedOutMovies.remove(movie1);
                    flag=1;
                    break;
                }
            }

        if(flag==1)
            return true;
        else
            return false;
    }
}
