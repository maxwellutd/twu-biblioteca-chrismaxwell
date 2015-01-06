package com.twu.biblioteca;

public class BibliotecaApp {

    private static String WelcomeMsg = "Welcome to Bangalore Public Library";

    public static String WelcomeMessage(){
        return WelcomeMsg;
    }

    public static void main(String[] args) {
        System.out.println("" + WelcomeMessage());
    }

    public static boolean hasWelcomeMsg(){
        if(!WelcomeMessage().isEmpty()){
            return true;
        }
        return false;
    }

}
