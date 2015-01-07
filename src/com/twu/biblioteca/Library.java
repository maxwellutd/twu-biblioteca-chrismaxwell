package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Maxwell on 7/01/2015.
 */
public class Library {

    private static ArrayList<Book> lib;
    private static ArrayList<Book> borrowedList;

    Library(){
        lib = new ArrayList<Book>();
        borrowedList = new ArrayList<Book>();
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
            System.out.println((i+1) + ". " + displayBookInfo(i));
        }
    }

    public int getLibSize(){
        return lib.size();
    }

    public void checkOutBook(int i) {
        borrowedList.add(lib.remove(i));
    }

    public Boolean returnBook(String s) {

        for(int i=0; i < borrowedList.size(); i++){
            if(borrowedList.get(i).getTitle().equals(s)){
                lib.add(borrowedList.remove(i));
                return true;
            }
        }
        return false;
    }
}
