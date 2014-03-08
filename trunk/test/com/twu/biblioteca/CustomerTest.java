package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by deeptibn on 2/28/14.
 */
public class CustomerTest {

    @Test
    public void testToDisplayCustomerProfile(){
        BibliotecaApp bibliotecaApp = new BibliotecaApp(new Library());
        bibliotecaApp.UserLogin("Jack","100");
        assertEquals(bibliotecaApp.current_customer.DisplayCustomerProfile(),"Name:Jack Email Address:jack@mail.com Phone:9876543210");
    }
}
