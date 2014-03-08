package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by deeptibn on 3/7/14.
 */
public class MenuTest {

    @Test
    public void testIfMenuIsDisplayed(){
        Menu menu=new Menu();
        assertEquals(menu.DisplayMenuItems(),"List of Books"+"\n"+"Check Out Book"+"\n"+"Check In Book"+"\n"+"list of Movies"+"\n"+"Check Out Movie"+"\n"+"Check In Movie"+"\n"+"My Profile"+"\n"+"Exit"+"\n");
    }
}
