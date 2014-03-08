package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by deeptibn on 2/27/14.
 */
public class LibraryTest {

   @Test
    public void testIfListOfBooksisDisplayed(){
        Library library = new Library();
        assertEquals(library.DisplayListOfBooks(),"Alchemist"+"\n"+"Inferno"+"\n");
    }

    @Test
    public void testIfCheckOutBookIsSuccessful(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(library.CheckOutBook("Alchemist", bibliotecaApp.current_customer), true);
    }

    @Test
    public void testIfCheckOutBookIsUnSuccessful(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(library.CheckOutBook("Famous Five",bibliotecaApp.current_customer ),false);
    }

    @Test
    public void testIfCheckInBookIsSuccessful(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        bibliotecaApp.UserLogin("Jack","100");
        library.CheckOutBook("Alchemist", bibliotecaApp.current_customer);
        assertEquals(library.CheckInBook("Alchemist",bibliotecaApp.current_customer), true);
    }

    @Test
    public void testIfCheckInBookIsUnSuccessful(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        bibliotecaApp.UserLogin("Jack","100");
        library.CheckOutBook("Alchemist",bibliotecaApp.current_customer);
        assertEquals(library.CheckInBook("Inferno",bibliotecaApp.current_customer),false);
    }

    @Test
    public void testIfListOfMovieIsDisplayed(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        assertEquals(library.DisplayListOfMovies(), "Batman"+"\n"+"Ironman"+"\n");
    }

    @Test
    public void testIfCheckOutMovieIsSuccessful(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(library.CheckOutMovie("Batman",bibliotecaApp.current_customer),true);
    }

    @Test
    public void testIfCheckOutMovieIsUnsuccessful(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(library.CheckOutMovie("Superman",bibliotecaApp.current_customer),false);
    }

    @Test
    public void testIfCheckInMovieIsSuccessful(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        bibliotecaApp.UserLogin("Jack","100");
        library.CheckOutMovie("Batman", bibliotecaApp.current_customer);
        assertEquals(library.CheckInMovie("Batman",bibliotecaApp.current_customer), true);
    }

    @Test
    public void testIfCheckInMovieIsUnSuccessful(){
        Library library = new Library();
        BibliotecaApp bibliotecaApp=new BibliotecaApp(library);
        bibliotecaApp.UserLogin("Jack","100");
        library.CheckOutMovie("Batman",bibliotecaApp.current_customer);
        assertEquals(library.CheckInMovie("Superman",bibliotecaApp.current_customer),false);
    }
}
