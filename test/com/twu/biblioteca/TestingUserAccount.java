package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by cmaxwell on 15/01/15.
 */
public class TestingUserAccount {

    private String name, email, phone, password, libNumber;
    private User one;
    private Login login;
    private Accounts accounts;

    @Before
    public void setUp() {
        name = "Bob";
        email = "bob@bob.com";
        phone = "123456";
        password = "thoughtworks";
        libNumber = "123-4567";
        one = new User(name,email,phone);
        login = new Login(libNumber,password);
        one.addLoginDetails(login);
        accounts = new Accounts();
        accounts.addUser(one.getLoginDetails(), one);


    }

    @Test
    public void testUserInfo(){
        assertEquals(name, one.getName());
        assertEquals(email, one.getEmail());
        assertEquals(phone,one.getPhone());
    }

    @Test
    public void testUserExists(){
        User two = new User("Brad", "brad@brad.com", "54321");
        assertTrue(accounts.hasUser(one.getLoginDetails()));
        assertFalse(accounts.hasUser(two.getLoginDetails()));
    }




}
