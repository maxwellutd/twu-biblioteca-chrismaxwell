package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Maxwell on 7/01/2015.
 */
public class Library {

    private static ArrayList<Book> lib;

    Library(){
        lib = new ArrayList<Book>();
    }


    public static void addBook(Book b){
        lib.add(b);
    }

}
