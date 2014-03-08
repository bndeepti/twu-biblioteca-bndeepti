package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by deeptibn on 3/5/14.
 */
public class Repository {
    ArrayList<Customer> customers;
    ArrayList<Book> books;
    ArrayList<Movie> movies;

    public Repository(){
        customers=new ArrayList<Customer>();
        books=new ArrayList<Book>();
        movies=new ArrayList<Movie>();
        customers.addAll(Arrays.asList(new Customer("Jack","password","100",false,"9876543210","jack@mail.com"),new Customer("Jill","pwd","101",false,"4323523522","jill@email.con")));
        movies.addAll(Arrays.asList(new Movie("Batman", 2005, "Christopher Nolan", 8), new Movie("Ironman",2004,"Jon Favreau",8)));
        books.addAll(Arrays.asList(new Book("1","Alchemist"),new Book("2","Inferno")));
    }
}
