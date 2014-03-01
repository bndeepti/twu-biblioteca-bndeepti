
package com.twu.biblioteca;
import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 * Created by deeptibn on 2/27/14.
 */
public class Customer {

    ArrayList<String> books_held;
    ArrayList<String> movies_held;
    String name;
    String password;
    String library_card_number;
    int login_status;
    String phone;
    String email_address;

    public Customer(){
        books_held=new ArrayList<String>();
        movies_held=new ArrayList<String>();
        name="Jack";
        password="xzy";
        library_card_number="123-4567";
        login_status=0;
        email_address="jack@mail.com";
        phone="9876543210";
    }
    public boolean Login(String name, String library_card_number){
        if(this.name.equals(name)&&this.library_card_number.equals(library_card_number))
        {
            this.login_status=1;
            return true;
        }
        else return false;
    }
    public String DisplayCustomerProfile() {
        String profile="";
        if(login_status==1)
            profile+="Name:"+name+" Email Address:"+email_address+" Phone:"+phone;
        return profile;
    }
}
