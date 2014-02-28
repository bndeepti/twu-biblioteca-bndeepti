package com.twu.biblioteca;


import org.junit.Test;

import java.io.IOException;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibliotecaAppTest {

    @Test
    public void testWelcomeMessageIsDisplayed(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library(null));
        assertEquals("Welcome to Biblioteca", bibliotecaApp.DisplayWelcomeMessage());
    }

    @Test
    public void testIfMenuIsDisplayed(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library(null));
        assertEquals(bibliotecaApp.DisplayMenuItems(),"[List of books, Check Out, Check In, Exit]");
    }

    @Test
    public void testIfvalidOptionIsChosen(){
        BibliotecaApp bibliotecaApp=new BibliotecaApp(new Library(null));
        assertEquals(bibliotecaApp.CheckInput("Check Out"),"Valid option");
    }
}
