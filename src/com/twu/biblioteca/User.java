package com.twu.biblioteca;

/**
 * Created by cmaxwell on 15/01/15.
 */
public class User {

    private final String name, email, phone;
    private Login login;

    User(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void addLoginDetails(Login login){
        this.login = new Login(login.getLibNumber(), login.getPassword());
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

    public Login getLoginDetails(){
        return this.login;
    }
}
