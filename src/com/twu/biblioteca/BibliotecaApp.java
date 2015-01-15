package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp{

    private Library mockLib, library;
    private Book one,two,three,four; //all mock books to create mock library
    private Movie mone, mtwo, mthree, mfour; // all mock movies to create mock library
    private boolean loggedIn = false;
    private Accounts userList;
    private String loggedInUser = "";

    public void initMockData() {

        mockLib = new Library();
        one = new Book("FIRST BOOK", "Andrew A", 1999);
        two = new Book("SECOND BOOK", "Bob B",2000);
        three = new Book ("THIRD BOOK", "Chris C",1900);
        four = new Book ("FOURTH BOOK", "Daniel D",2012);
        mone = new Movie("MOVIE ONE", "1999", "ANDY A", 6);
        mtwo = new Movie("MOVIE TWO", "2012", "BENNY B", 9);
        mthree = new Movie("MOVIE THREE", "1934", "CANDY C", 1);
        mfour = new Movie("MOVIE FOUR", "2005", "DEREK D", 7);
        mockLib.addBook(one);
        mockLib.addBook(two);
        mockLib.addBook(three);
        mockLib.addBook(four);
        mockLib.addMovie(mone);
        mockLib.addMovie(mtwo);
        mockLib.addMovie(mthree);
        mockLib.addMovie(mfour);
        library = mockLib;
        String name = "Bob";
        String email = "bob@bob.com";
        String phone = "123456";
        String username = "123-4567";
        String password = "thoughtworks";
        userList = new Accounts();
        userList.addLoginDetails(username,password);
        User userOne = new User(name,email,phone);
        userList.addUser(username,userOne);

    }

    public void beginConsoleApp(){
        Scanner choose = new Scanner(System.in);
        String choice = null;

        while(!"q".equals(choice)){
            System.out.println("Please enter the number of the selection from the menu below");
            if(loggedIn) {
                System.out.println("1. List All Books");
                System.out.println("2. Check Out Book");
                System.out.println("3. Return Book");
                System.out.println("4. List All Movies");
                System.out.println("5. Check Out Movie");
                System.out.println("6. Return Movie");
                System.out.println("7. Display User Information");
                System.out.println("q. Quit");
                choice = choose.nextLine();
                if ("1".equals(choice)) {
                    displayAllBooks();
                } else if ("2".equals(choice)) {
                    checkOutBook();
                } else if ("3".equals(choice)) {
                    returnBook();
                } else if ("4".equals(choice)){
                    displayAllMovies();
                } else if ("5".equals(choice)){
                    checkOutMovie();
                } else if ("6".equals(choice)){
                    returnMovie();
                } else if ("7".equals(choice)) {
                    displayUserInfo();
                } else if ("q".equals(choice)) {
                    break; //quitting
                } else {
                    System.out.println("Select a valid option");
                }

            }
            else{
                System.out.println("1. Sign In");
                System.out.println("q. Quit");
                choice = choose.nextLine();
                if ("1".equals(choice)){
                    attemptLogin();
                }
                else if ("q".equals(choice)){
                    break; // quitting
                }
                else {
                    System.out.println("Select a valid option");
                }
            }
        }

    }

    private void returnBook() {
        Scanner input = new Scanner(System.in);
        String title = null;
        System.out.println("Please type the title of the book you are returning (case sensitive)");
        title = input.nextLine();
        if(library.returnBook(title)){
            System.out.println("Thank you for returning the book");
        }
        else{
            System.out.println("That is not a valid book to return");
        }

    }

    private void returnMovie(){
        Scanner input = new Scanner(System.in);
        String title = null;
        System.out.println("Please type the title of the movie you are returning (case sensitive)");
        title = input.nextLine();
        if(library.returnMovie(title)){
            System.out.println("Thank you for returning the Movie");
        }
        else{
            System.out.println("That is not a valid movie to return");
        }
    }

    private void checkOutBook() {
        Scanner choose = new Scanner(System.in);
        String choice = "";
        System.out.println("Please select a book to check out by entering the corresponding number");
        displayAllBooks();
        choice = choose.nextLine();
        int selection = Integer.parseInt(choice);
        if(selection < 1 || selection > library.getLibSize()){
            System.out.println("That book is not available");
        }
        else{
            library.checkOutBook((selection-1));
            System.out.println("Thank you, enjoy the book!");
        }
    }

    private void checkOutMovie(){
        Scanner choose = new Scanner(System.in);
        String choice = "";
        System.out.println("Please select a book to check out by entering the corresponding number");
        displayAllMovies();
        choice = choose.nextLine();
        int selection = Integer.parseInt(choice);
        if(selection < 1 || selection > library.getMovieLibSize()){
            System.out.println("That movie is not available");
        }
        else{
            library.checkOutMovie((selection - 1));
            System.out.println("Thank you, enjoy the movie!");
        }
    }

    private void displayAllBooks() {
        List<Book> bookList = new ArrayList<Book>();
        bookList = library.getListOfBooks();

        for(int i =0; i<bookList.size(); i++){
            System.out.println((i+1) + ". " + bookList.get(i).getBookInfo());
        }
    }

    private void displayAllMovies(){
        List<Movie> movieList = new ArrayList<Movie>();
        movieList = library.getListOfMovies();

        for(int index = 0; index < movieList.size(); index++){
            System.out.println((index+1) + ". " + movieList.get(index).getAllMovieInfo());
        }
    }

    public void attemptLogin(){
        Scanner choose = new Scanner(System.in);
        String username = "";
        String password = "";
        System.out.println("Please enter your username (library number)");
        username = choose.nextLine();
        System.out.println("Please enter password");
        password = choose.nextLine();

        if(userList.checkLoginSuccessful(username,password)){
            loggedIn = true;
            loggedInUser = username;
        }

        else{
            System.out.println("Incorrect Login Details");
        }

    }

    public void displayUserInfo(){
        System.out.println("");
        System.out.println(userList.getUser(loggedInUser).getAllUserInfo());
        System.out.println("");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Bangalore Public Library");
        BibliotecaApp start = new BibliotecaApp();
        start.initMockData();
        start.beginConsoleApp();

    }


}
