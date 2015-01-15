package com.twu.biblioteca;

import java.util.HashMap;

/**
 * Created by cmaxwell on 15/01/15.
 */
public class Accounts {

    private HashMap<Login, User> accounts;


    Accounts(){
        accounts = new HashMap<Login, User>();
    }

    public final void addUser(Login login,User user){
        accounts.put(login,user);
    }

    public boolean hasUser(Login login){
        return accounts.containsKey(login);
    }

    public User getUser(Login login){
        return accounts.get(login);
    }


}
