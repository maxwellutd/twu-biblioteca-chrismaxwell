package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by cmaxwell on 15/01/15.
 */
public class TestingMovies {


    @Test
    public void testMovieFormat(){
        Movie one = new Movie("Movie One", "2000", "Aaron A", 8);
        String expected = "Movie One - 2000 - Aaron A - 8/10";
        assertEquals(expected, one.getAllMovieInfo());
    }

    @Test
    public void testAddMovieToLibrary(){
        Library lib = new Library();
        Movie one = new Movie("Movie One", "2000", "Aaron A", 8);
        lib.addMovie(one);
        assertTrue(lib.hasMovie(one));
    }

    @Test
    public void testMovieCheckOut(){
        Library lib = new Library();
        Movie one = new Movie("Movie One", "2000", "Aaron A", 8);
        lib.addMovie(one);
        lib.checkOutMovie(0);

        assertFalse(lib.hasMovie(one));
    }

    @Test
    public void testReturnBook(){
        Library lib = new Library();
        Movie one = new Movie("Movie One", "2000", "Aaron A", 8);
        lib.addMovie(one);
        lib.checkOutMovie(0);
        lib.returnMovie("Movie One");

        assertTrue(lib.hasMovie(one));

    }

    @Test
    public void testReturnFail(){
        Library lib = new Library();
        Movie one = new Movie("Movie One", "2000", "Aaron A", 8);
        lib.addMovie(one);
        assertTrue(!lib.returnMovie("Movie One"));
    }

}
