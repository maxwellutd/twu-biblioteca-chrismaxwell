Instructions for Running BibliotecaApp
=================================================

UPDATED AS OF 15/01/2015 - 6:05pm

Biblioteca App requires log in to see available books and movies to borrow.

Mock user data has been set up for testing purposes.

To Log in:

Username: 123-4567    //including hyphen
Password: thoughtworks

If successful you should get a new menu which gives you the options of borrowing/returning books/movies to the library

The is the ability to see who has borrowed a book, though at this stage it was not required to set up different
console capabilities based on whether the user was admin (librarian) or a customer. Thus the only way to see
that the username has been assigned to a borrowed book is through the test cases, more specifically test class
"TestingUserAccount".

There are 3 JUnit Test Classes to help test and run most functions of the Biblioteca Project.

Class TestingBiblioTecaApp.java - Tests the overall integration - borrowing books and movies and returning them.
Class TestingMovies.java - Tests the movie objects and small methods that retrieve their information.
Class TestingUserAccount.java - Tests all User Account related logic. From retrieving user information from username to
ensuring that a username (library number) is assigned to a borrowed book.


