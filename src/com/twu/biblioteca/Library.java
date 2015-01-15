package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Maxwell on 7/01/2015.
 */
public class Library {

    private List<Book> lib;
    private List<Book> borrowedList;
    private List<Movie> movieLib;
    private List<Movie> borrowedMovieList;

    public Library(){
        this.lib = new ArrayList<Book>();
        this.movieLib = new ArrayList<Movie>();
        this.borrowedList = new ArrayList<Book>();
        this.borrowedMovieList = new ArrayList<Movie>();
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

    public int getLibSize(){
        return lib.size();
    }

    public void checkOutBook(int position) {
        borrowedList.add(lib.remove(position));
    }

    public void checkOutMovie(int position) {
        borrowedMovieList.add(movieLib.remove(position));
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

    public Boolean returnMovie(String title){
        for(int index=0; index < borrowedMovieList.size(); index++){
            if(borrowedMovieList.get(index).getMovieTitle().equals(title)){
                movieLib.add(borrowedMovieList.remove(index));
                return true;
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
