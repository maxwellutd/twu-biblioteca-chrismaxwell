package com.twu.biblioteca;

public class BibliotecaApp{

    private static Library mockLib;
    private static Book one,two,three,four;

    public static void initMockData() {

        mockLib = new Library();
        one = new Book("FIRST BOOK", "Andrew A");
        two = new Book("SECOND BOOK", "Bob B");
        three = new Book ("THIRD BOOK", "Chris C");
        four = new Book ("FOURTH BOOK", "Daniel D");
        mockLib.addBook(one);
        mockLib.addBook(two);
        mockLib.addBook(three);
        mockLib.addBook(four);
    }

    public static void beginConsoleApp(){
        listAllBooks();
    }

    private static void listAllBooks() {
        Library.listAllBooks();
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Bangalore Public Library");
        initMockData();
        beginConsoleApp();
    }


}
