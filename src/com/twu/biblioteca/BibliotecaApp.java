package com.twu.biblioteca;

public class BibliotecaApp{

    public static void beginConsoleApp(){
        listAllBooks();
    }

    private static void listAllBooks() {
        Library.listAllBooks();
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Bangalore Public Library");
        beginConsoleApp();
    }


}
