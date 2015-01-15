package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
/**
 * Created by Maxwell on 7/01/2015.
 */
public class Library {

    private List<Book> lib;
    private List<Movie> movieLib;
    private HashMap<Movie, String> borrowedMovieList;
    private HashMap<Book, String> borrowedBookList;


    public Library(){
        this.lib = new ArrayList<Book>();
        this.movieLib = new ArrayList<Movie>();
        this.borrowedBookList = new HashMap<Book,String>();
        this.borrowedMovieList = new HashMap<Movie, String>();
    }

    public void addBook(Book book){
        this.lib.add(book);
    }

    public void addMovie(Movie movie){
        this.movieLib.add(movie);
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

    public List<Movie> getListOfMovies(){
        return movieLib;
    }

    public int getLibSize(){
        return lib.size();
    }

    public int getMovieLibSize() {
        return movieLib.size();
    }

    public void checkOutBook(int position, String username) {
        Book borrowed = lib.remove(position);
        borrowedBookList.put(borrowed,username);
    }

    public void checkOutMovie(int position, String username) {
        Movie borrowed = movieLib.remove(position);
        borrowedMovieList.put(borrowed, username);
    }

    public String getUserWhoBorrowedBook(String title){
        for(Book key : borrowedBookList.keySet()){
            if(key.getTitle().equals(title)){
                return (borrowedBookList.get(key));
            }
        }
        return "borrowed book not assigned";
    }

    public String getUserWhoBorrowedMovie(String title){
        for(Movie key : borrowedMovieList.keySet()){
            if(key.getMovieTitle().equals(title)){
                return (borrowedMovieList.get(key));
            }
        }
        return "borrowed movie not assigned";
    }

    public Boolean returnBook(String title) {

        for(Book key : borrowedBookList.keySet()){
            if(key.getTitle().equals(title)){
                borrowedBookList.remove(key);
                lib.add(key);
            }
        }

        return false;
    }

    public Boolean returnMovie(String title){

        for(Movie key : borrowedMovieList.keySet()){
            if(key.getMovieTitle().equals(title)){
                borrowedMovieList.remove(key);
                movieLib.add(key);
            }
        }

        return false;
    }

    public Boolean hasMovie(Movie movie){
        for(int index = 0; index < movieLib.size(); index ++){
            if(movieLib.get(index).equals((movie))){
                return true;
            }
        }
        return false;
    }


}
