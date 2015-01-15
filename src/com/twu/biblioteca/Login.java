package com.twu.biblioteca;

/**
 * Created by cmaxwell on 15/01/15.
 */
public class Login {

    private final String libNumber;
    private final String password;


    Login(String libNumber, String password){
        this.libNumber = libNumber;
        this.password = password;
    }

    public String getLibNumber(){
        return libNumber;
    }

    public String getPassword(){
        return password;
    }


}
