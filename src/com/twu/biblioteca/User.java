package com.twu.biblioteca;

/**
 * Created by cmaxwell on 15/01/15.
 */
public class User {

    private final String name, email, phone;

    User(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }


    public String getAllUserInfo(){
        return ("Name: " + name + ", Email: " + email + ", Phone: " + phone);
    }
}
