package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Maxwell on 7/01/2015.
 */
public class Library {

    private List<Book> lib;
    private List<Book> borrowedList;

    public Library(){
        this.lib = new ArrayList<Book>();
        this.borrowedList = new ArrayList<Book>();
    }


    public void addBook(Book b){
        this.lib.add(b);
    }

    public Book getFirstBook(){
        return lib.get(0);
    }

    public Book getBookAt(int bookPos){
        return lib.get(bookPos);
    }


    public List<Book> getListOfBooks() {
        return lib;
    }

    public int getLibSize(){
        return lib.size();
    }

    public void checkOutBook(int position) {
        borrowedList.add(lib.remove(position));
    }

    public Boolean returnBook(String title) {

        for(int i=0; i < borrowedList.size(); i++){
            if(borrowedList.get(i).getTitle().equals(title)){
                lib.add(borrowedList.remove(i));
                return true;
            }
        }
        return false;
    }
}
