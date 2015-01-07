package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestingBibliotecaApp{

    @Test
    public void testBookExists(){
        Book a = new Book("book 1", "Andrew A");
        assertEquals(a.getAuthor(), "Andrew A");
        assertEquals(a.getTitle(),"book 1");
    }

    @Test
    public void testLibraryExists(){
        Library a =
    }
}
