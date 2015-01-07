package com.twu.biblioteca;

import java.util.*;

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
        Scanner choose = new Scanner(System.in);
        String choice = null;

        while(!"2".equals(choice)){
            System.out.println("Please enter the number of the selection from the menu below");
            System.out.println("1. List All Books");
            System.out.println("2. Quit");
            choice = choose.nextLine();
            if("1".equals(choice)){
                listAllBooks();
            }
        }

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
