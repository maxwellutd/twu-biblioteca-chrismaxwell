package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp{

    private static Library mockLib, library;
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
        library = mockLib;
    }

    public static void beginConsoleApp(){
        Scanner choose = new Scanner(System.in);
        String choice = null;

        while(!"3".equals(choice)){
            System.out.println("Please enter the number of the selection from the menu below");
            System.out.println("1. List All Books");
            System.out.println("2. Check Out Book");
            System.out.println("3. Quit");
            choice = choose.nextLine();
            if("1".equals(choice)){
                listAllBooks();
            }
            else if("2".equals(choice)){
                checkOut();
            }
            else if("3".equals(choice)){
                //quit
            }
            else{
                System.out.println("Select a valid option");
            }
        }

    }

    private static void checkOut() {
        Scanner choose = new Scanner(System.in);
        String choice = null;
        System.out.println("Please select a book to check out by entering the corresponding number");
        listAllBooks();
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

    private static void listAllBooks() {
        Library.listAllBooks();
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Bangalore Public Library");
        initMockData();
        beginConsoleApp();
    }


}
