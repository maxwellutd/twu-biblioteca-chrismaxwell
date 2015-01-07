package com.twu.biblioteca;

/**
 * Created by Maxwell on 6/01/2015.
 */
public class Book {

    private String title;
    private String author;

    Book(){
        title = "";
        author = "";
    }

    public Book(String t, String a){
        title = t;
        author = a;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }


}
