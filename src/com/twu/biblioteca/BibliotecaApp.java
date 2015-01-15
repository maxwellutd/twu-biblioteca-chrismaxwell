package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp{

    private Library mockLib, library;
    private Book one,two,three,four; //all mock books to create mock library

    public void initMockData() {

        mockLib = new Library();
        one = new Book("FIRST BOOK", "Andrew A", 1999);
        two = new Book("SECOND BOOK", "Bob B", 2005);
        three = new Book ("THIRD BOOK", "Chris C", 1977);
        four = new Book ("FOURTH BOOK", "Daniel D", 2000);
        mockLib.addBook(one);
        mockLib.addBook(two);
        mockLib.addBook(three);
        mockLib.addBook(four);
        library = mockLib;
    }

    public void beginConsoleApp(){
        Scanner choose = new Scanner(System.in);
        String choice = null;

        while(!"4".equals(choice)){
            System.out.println("Please enter the number of the selection from the menu below");
            System.out.println("1. List All Books");
            System.out.println("2. Check Out Book");
            System.out.println("3. Return Book");
            System.out.println("4. Quit");
            choice = choose.nextLine();
            if("1".equals(choice)){
                displayAllBooks();
            }
            else if("2".equals(choice)){
                checkOut();
            }
            else if("3".equals(choice)){
                returnBook();
            }
            else if("4".equals(choice)){
                break; //quitting
            }
            else{
                System.out.println("Select a valid option");
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

    private void checkOut() {
        Scanner choose = new Scanner(System.in);
        String choice = null;
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

    private void displayAllBooks() {
        List<Book> bookList = new ArrayList<Book>();
        bookList = library.getListOfBooks();

        for(int i =0; i<bookList.size(); i++){
            System.out.println((i+1) + ". " + bookList.get(i).getBookInfo());
        }
    }



    public static void main(String[] args) {

        System.out.println("Welcome to Bangalore Public Library");
        BibliotecaApp start = new BibliotecaApp();
        start.initMockData();
        start.beginConsoleApp();

    }


}
