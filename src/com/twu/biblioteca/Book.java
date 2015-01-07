package com.twu.biblioteca;

/**
 * Created by Maxwell on 6/01/2015.
 */
public class Book {

    private String title;
    private String author;
    private int year;

    Book(){
        title = "";
        author = "";
        year = 0;
    }

    public Book(String t, String a){
        title = t;
        author = a;
    }

    public Book(String t, String a, int y){
        title = t;
        author = a;
        year = y;
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
