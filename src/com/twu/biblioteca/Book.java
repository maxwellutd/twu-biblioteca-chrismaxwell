package com.twu.biblioteca;

/**
 * Created by Maxwell on 6/01/2015.
 */
public class Book {

    private final String title;
    private final String author;
    private final int year;

    Book(){
        title = "";
        author = "";
        year = 0;
    }

    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

}
