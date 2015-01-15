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
    private Library mockLib;
    private Book bone, btwo;
    private Movie mone, mtwo;


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

        mockLib = new Library();
        bone = new Book("FIRST BOOK", "Andrew A", 1999);
        btwo = new Book("SECOND BOOK", "Bob B",2000);
        mone = new Movie("MOVIE ONE", "1999", "ANDY A", 6);
        mtwo = new Movie("MOVIE TWO", "2012", "BENNY B", 9);
        mockLib.addBook(bone);
        mockLib.addBook(btwo);
        mockLib.addMovie(mone);
        mockLib.addMovie(mtwo);


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

    @Test
    public void testBorrowingWithAccount(){
        mockLib.checkOutBook(0,"123-4567");
        assertEquals("123-4567", mockLib.getUserWhoBorrowedBook("FIRST BOOK"));
        assertEquals("Bob", accounts.getUser(mockLib.getUserWhoBorrowedBook("FIRST BOOK")).getName());
    }




}
