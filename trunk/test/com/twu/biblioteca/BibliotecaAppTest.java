package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void testWelcomeMessageIsDisplayed(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        assertEquals("Welcome to Biblioteca", bibliotecaApp.DisplayWelcomeMessage());
    }

    @Test
    public void testIfvalidOptionIsChosen(){
        BibliotecaApp bibliotecaApp=new BibliotecaApp(new Library());
        assertEquals(bibliotecaApp.CheckInput("Check Out Book"),"Valid option");
        assertEquals(bibliotecaApp.CheckInput("Buy a book"), "Invalid option");
    }

    @Test
    public void testValidateUserLogin(){
        BibliotecaApp bibliotecaApp=new BibliotecaApp(new Library());
        assertEquals(bibliotecaApp.UserLogin("Jack", "100"),true);
    }

        //private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        /*@Test
        public void shouldDisplayWelcomeMessage() throws Exception {
            new BibliotecaApp(new PrintStream(outContent)).run("Welcome to Biblioteca");
            String actual = outContent.toString().trim();

            assertEquals("Welcome to Biblioteca", actual);
        }*/
    @Test
    public void testIfMenuIsDisplayed(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        assertEquals(bibliotecaApp.DisplayMenuItems(),"List of Books"+"\n"+"Check Out Book"+"\n"+"Check In Book"+"\n"+"list of Movies"+"\n"+"Check Out Movie"+"\n"+"Check In Movie"+"\n"+"My Profile"+"\n"+"Exit"+"\n");
    }

    @Test
    public void testIfCheckOutBookIsSuccessful(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(bibliotecaApp.CheckOutBook("Alchemist", bibliotecaApp.current_customer), "Thank you! Enjoy the book");
    }

    @Test
    public void testIfCheckOutBookIsUnSuccessful(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(bibliotecaApp.CheckOutBook("Lajja",bibliotecaApp.current_customer),"That book is not available");
    }

    @Test
    public void testIfCheckInBookIsSuccessful(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(bibliotecaApp.CheckOutBook("Alchemist",bibliotecaApp.current_customer),"Thank you! Enjoy the book");
        assertEquals(bibliotecaApp.CheckInBook("Alchemist",bibliotecaApp.current_customer),"Thank you for returning the book");
    }

    @Test
    public void testIfCheckInBookIsUnSuccessful(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        bibliotecaApp.CheckOutBook("Alchemist",bibliotecaApp.current_customer);
        assertEquals(bibliotecaApp.CheckInBook("Lajja",bibliotecaApp.current_customer),"That is not a valid book to return");
    }

    @Test
    public void testToDisplayCustomerProfile(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(bibliotecaApp.DisplayCustomerProfile(),"Name:Jack Email Address:jack@mail.com Phone:9876543210");
    }

    @Test
    public void testIfCheckOutMovieIsSuccessful(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(bibliotecaApp.CheckOutMovie("Batman", bibliotecaApp.current_customer), "Thank you! Enjoy the movie");
    }

    @Test
    public void testIfCheckOutMovieIsUnSuccessful(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(bibliotecaApp.CheckOutMovie("Superman", bibliotecaApp.current_customer), "That movie is not available");
    }

    @Test
    public void testIfCheckInMovieIsSuccessful(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        bibliotecaApp.CheckOutMovie("Batman", bibliotecaApp.current_customer);
        assertEquals(bibliotecaApp.CheckInMovie("Batman", bibliotecaApp.current_customer), "Thank you for returning the movie");
    }

    @Test
    public void testIfCheckInMovieIsUnSuccessful(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        bibliotecaApp.CheckOutMovie("Batman", bibliotecaApp.current_customer);
        assertEquals(bibliotecaApp.CheckInMovie("Superman", bibliotecaApp.current_customer), "That is not a valid movie to return");
    }



}
