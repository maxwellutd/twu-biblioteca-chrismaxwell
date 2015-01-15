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

    private Accounts accounts;

    @Before
    public void setUp() {
        name = "Bob";
        email = "bob@bob.com";
        phone = "123456";
        password = "thoughtworks";
        libNumber = "123-4567";
        one = new User(name,email,phone);
        accounts = new Accounts();
        accounts.addLoginDetails(libNumber,password);
        accounts.addUser(libNumber,one);


    }

    @Test
    public void testUserInfo(){
        assertEquals(name, one.getName());
        assertEquals(email, one.getEmail());
        assertEquals(phone,one.getPhone());
    }

    @Test
    public void testUserExists(){

        assertTrue(accounts.hasUser(libNumber)); //test for existing user
        assertFalse(accounts.hasUser("111-2222")); //test for non existing user

    }

    @Test
    public void testUserInfoMatchesLogin(){

        assertEquals("Bob",accounts.getUser(libNumber).getName());
        assertEquals("bob@bob.com", accounts.getUser(libNumber).getEmail());
        assertEquals("123456", accounts.getUser(libNumber).getPhone());
    }

    @Test
    public void testPrintUserInfo(){
        String expectedOutput = "Name: Bob, Email: bob@bob.com, Phone: 123456";
        assertEquals(expectedOutput, one.getAllUserInfo());
    }

    @Test
    public void testLoginWorks(){
        String username = "123-4567";
        String password = "thoughtworks";
        assertTrue(accounts.checkLoginSuccessful(username, password)); //test correct login
        String fakeUser = "111-2222";
        assertFalse(accounts.checkLoginSuccessful(fakeUser,password)); //test incorrect login
    }






}
