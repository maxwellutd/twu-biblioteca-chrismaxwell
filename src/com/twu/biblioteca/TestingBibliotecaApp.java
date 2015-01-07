package com.twu.biblioteca;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TestingBibliotecaApp{
    //set up mock data for books/library
    private static Library mockLib;
    private static Book one,two,three,four;

    @BeforeClass
    public static void setUp() {

        mockLib = new Library();
        one = new Book("FIRST BOOK", "Andrew A", 1999);
        two = new Book("SECOND BOOK", "Bob B");
        three = new Book ("THIRD BOOK", "Chris C");
        four = new Book ("FOURTH BOOK", "Daniel D");
        mockLib.addBook(one);
        mockLib.addBook(two);
        mockLib.addBook(three);
        mockLib.addBook(four);
    }

    @Test
    public void testBookExists(){
        Book a = new Book("book 1", "Andrew A");
        assertEquals(a.getAuthor(), "Andrew A");
        assertEquals(a.getTitle(),"book 1");
    }

    @Test
    public void testAddBookToLibrary(){
        assertEquals(mockLib.getFirstBook(), one);
    }

    @Test
    public void testLibraryList(){
        assertEquals(mockLib.getBookAt(0),one);
        assertEquals(mockLib.getBookAt(1),two);
        assertEquals(mockLib.getBookAt(2),three);
        assertEquals(mockLib.getBookAt(3),four);
    }

    @Test
    public void testBookShowsAllInfo(){
        String display = "FIRST BOOK - Andrew A - 1999";
        assertEquals(mockLib.displayBookInfo(0),display);
    }


}
