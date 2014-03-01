package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by deeptibn on 2/28/14.
 */
public class CustomerTest {
    @Test
    public void testToDisplayCustomerProfile(){
        Customer customer = new Customer();
        customer.Login("Jack","123-4567");
        assertEquals(customer.DisplayCustomerProfile(),"Name:Jack Email Address:jack@mail.com Phone:9876543210");
    }

    @Test
    public void testLogin(){
        Customer customer = new Customer();
        assertEquals(customer.Login("Jack","123-4567"),true);
    }
}
