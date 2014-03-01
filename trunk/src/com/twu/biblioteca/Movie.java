package com.twu.biblioteca;

/**
 * Created by deeptibn on 2/28/14.
 */
public class Movie {
    String name;
    int year;
    String director;
    int rating;
    public Movie(String name, int year, String director, int rating){
        this.name=name;
        this.director=director;
        this.year=year;
        this.rating=rating;
    }
}
