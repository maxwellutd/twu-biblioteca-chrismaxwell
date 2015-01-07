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

    public Book getFirstBook(){
        return lib.get(0);
    }

    public Book getBookAt(int x){
        return lib.get(x);
    }

    public static String displayBookInfo(int position){
        return (lib.get(position).getTitle() + " - " + lib.get(position).getAuthor() + " - " + lib.get(position).getYear());
    }

    public static void listAllBooks() {
        for(int i = 0; i < lib.size(); i++) {
            System.out.println(displayBookInfo(i));
        }
    }
}
