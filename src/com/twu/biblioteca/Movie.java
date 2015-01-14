package com.twu.biblioteca;

/**
 * Created by cmaxwell on 15/01/15.
 */
public class Movie {

    private final String title;
    private final String year;
    private final String director;
    private final int rating;



    Movie(String title, String year, String director, int rating){
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getMovieTitle(){
        return title;
    }

    public String getMovieYear(){
        return year;
    }

    public String getMovieDirector(){
        return director;
    }

    public int getMovieRating(){
        return rating;
    }

    public String getAllMovieInfo(){
        return (title + " - " + year + " - " + director + " - " + rating + "/10");
    }


}
