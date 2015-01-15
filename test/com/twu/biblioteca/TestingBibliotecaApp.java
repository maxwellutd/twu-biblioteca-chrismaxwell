package com.twu.biblioteca;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TestingBibliotecaApp{
    //set up mock data for books/library
    private static Library mockLib;
    private static Book one,two,three,four;
    private static Movie mone, mtwo, mthree, mfour;

    @Before
    public void setUp() {

        mockLib = new Library();
        one = new Book("FIRST BOOK", "Andrew A", 1999);
        two = new Book("SECOND BOOK", "Bob B",2000);
        three = new Book ("THIRD BOOK", "Chris C",1900);
        four = new Book ("FOURTH BOOK", "Daniel D",2012);
        mone = new Movie("MOVIE ONE", "1999", "ANDY A", 6);
        mtwo = new Movie("MOVIE TWO", "2012", "BENNY B", 9);
        mthree = new Movie("MOVIE THREE", "1934", "CANDY C", 1);
        mfour = new Movie("MOVIE FOUR", "2005", "DEREK D", 7);
        mockLib.addBook(one);
        mockLib.addBook(two);
        mockLib.addBook(three);
        mockLib.addBook(four);
        mockLib.addMovie(mone);
        mockLib.addMovie(mtwo);
        mockLib.addMovie(mthree);
        mockLib.addMovie(mfour);

    }


    @Test
    public void testBookExists(){
        Book a = new Book("book 1", "Andrew A",1990);
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
        assertEquals(mockLib.getBookAt(0).getBookInfo(),display);
    }

    @Test
    public void testCheckOutBook(){
        assertEquals(mockLib.getBookAt(2),three);
        mockLib.checkOutBook(2);
        assertEquals(mockLib.getBookAt(2),four);
    }

    @Test
    public void testReturnBook(){
        mockLib.checkOutBook(2);
        assertEquals(3,mockLib.getLibSize());
        mockLib.returnBook("THIRD BOOK");
        assertEquals(4, mockLib.getLibSize());
        mockLib.returnBook("FAKE BOOK");
        assertEquals(4,mockLib.getLibSize());//library size shouldn't increase if incorrect book being returned.
    }
}
