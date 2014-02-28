package com.twu.biblioteca;

import com.twu.biblioteca.Customer;
import com.twu.biblioteca.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by deeptibn on 2/27/14.
 */
public class LibraryTest{

    @Test
    public void testIfListOfBooksisDisplayed(){
        Library library = new Library(new Customer());
        assertEquals(library.DisplayListOfBooks(),"[Alchemist, Inferno]");
    }

    @Test
    public void testIfCheckOutIsSuccessful(){
        Library library = new Library(new Customer());
        assertEquals(library.CheckOut("Alchemist"),"Thank you! Enjoy the book");
    }

    @Test
    public void testIfCheckOutIsUnSuccessful(){
        Library library = new Library(new Customer());
        assertEquals(library.CheckOut("Lajja"), "That book is not available");
    }

    @Test
    public void testIfCheckInIsSuccessful(){
        Library library = new Library(new Customer());
        library.CheckOut("Alchemist");
        assertEquals(library.CheckIn("Alchemist"), "Thank you for returning the book");
    }

    @Test
    public void testIfCheckInIsUnSuccessful(){
        Library library = new Library(new Customer());
        library.CheckOut("Alchemist");
        assertEquals(library.CheckIn("Lajja"),"That is not a valid book to return");
    }


}
