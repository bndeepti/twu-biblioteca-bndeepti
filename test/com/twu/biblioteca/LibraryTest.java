package com.twu.biblioteca;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Customer;
import com.twu.biblioteca.Library;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by deeptibn on 2/25/14.
 */
public class LibraryTest {

    @Test
    public void test_List_Of_Books(){
        Library lib=new Library();
        //System.out.println(lib.FetchList().toString());
        assertEquals(lib.FetchList().toString(),"[Da Vinci Code, The Alchemist, Harry Potter]");
    }

    @Test
    public void test_Check_Out_Successful(){
        Library lib=new Library();
        //Customer cust=new Customer();
      assertEquals(lib.CheckOut("Da Vinci Code").toString(), "[The Alchemist, Harry Potter]");
        assertEquals(Customer.books[--Customer.no_of_books], "Da Vinci Code");
        assertEquals(Library.status_msg,"Thank you! Enjoy the book");

    }

    @Test
    public void test_Check_Out_UnSuccessful(){
        Library lib=new Library();
        //Customer cust=new Customer();
        assertEquals(lib.CheckOut("Kite Runner").toString(), "[Da Vinci Code, The Alchemist, Harry Potter]");
        assertEquals(Library.status_msg,"That book is not available");

    }

    @Test
    public void test_Check_In(){
        Library lib=new Library();
        assertEquals(lib.CheckIn("Da Vinci Code").toString(), "[Da Vinci Code, The Alchemist, Harry Potter]");
        for (int i=0;i<Customer.no_of_books;i++){
            assertNotEquals(Customer.books[i],"Da Vinci Code");
        }
        assertEquals(Library.status_msg,"Thank you for returning the book");
    }

    @Test
    public void test_Check_In_UnSuccessful(){
        Library lib=new Library();
        //Customer cust=new Customer();
        assertEquals(lib.CheckIn("Kite Runner").toString(), "[Da Vinci Code, The Alchemist, Harry Potter]");
        assertEquals(Library.status_msg,"That is not a valid book to return");

    }
}
