package com.twu.biblioteca;

import java.util.HashMap;

/**
 * Created by cmaxwell on 15/01/15.
 */
public class Accounts {
    private String username, password;

    private HashMap<String, User> accounts;
    private HashMap<String, String> login;

    Accounts(){
        accounts = new HashMap<String,User>();
        login = new HashMap<String,String>();
    }

    public void addLoginDetails(String username, String password){
        login.put(username,password);
    }

    public final void addUser(String username,User userInfo){
        accounts.put(username,userInfo);
    }

    public final boolean hasUser(String username){
        return accounts.containsKey(username);
    }

    public final User getUser(String username){
        return accounts.get(username);
    }

    public Boolean checkLoginSuccessful(String username, String password){
        if(login.containsKey(username) && login.get(username).equals(password)){
            return true;
        }

        return false;
    }


}
