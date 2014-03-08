package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by deeptibn on 2/27/14.
 */
public class Customer {

    ArrayList<Book> books_held;
    ArrayList<Movie> movies_held;
    String name;
    String password;
    String libcardnum;
    boolean loginstatus;
    String phone;
    String email;

    public Customer(String name, String password, String libcardnum, boolean loginstatus, String phone, String email){

        this.name=name;
        this.password=password;
        this.libcardnum=libcardnum;
        this.loginstatus=loginstatus;
        this.phone=phone;
        this.email=email;
        books_held=new ArrayList<Book>();
        movies_held=new ArrayList<Movie>();
    }

    public String DisplayCustomerProfile() {
        String profile="";
        if(this.loginstatus==true)
            profile+="Name:"+this.name+" Email Address:"+this.email+" Phone:"+this.phone;
        return profile;
    }
}
