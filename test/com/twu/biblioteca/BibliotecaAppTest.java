package com.twu.biblioteca;


import org.junit.Test;

import java.io.IOException;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibliotecaAppTest {

    @Test
    public void test_Welcome_Msg() {

        assertEquals(BibliotecaApp.WelcomeMsg(),"Welcome to Biblioteca");
    }

    @Test
    public void test_DisplayMenu() throws IOException {
        assertEquals(BibliotecaApp.DisplayMenu(),"The menu items are:\n1.View list of books\n2.Check out books\n3.Check in books\n4.Exit");
    }

    @Test
    public void test_Invalid_Input() throws IOException {
        assertEquals(BibliotecaApp.DelegateInput(4),"Invalid option.Select a valid option!");
    }
}
