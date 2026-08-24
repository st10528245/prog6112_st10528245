/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author Student
 */
public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {

        books = new Book[size];

        bookCount = 0;
    }

    public boolean addBook(Book book) {

        if (bookCount >= books.length) {

            return false;
        }

        books[bookCount] = book;

        bookCount++;

        return true;
    }

    public Book searchBook(String bookId) {

        for (int i = 0; i < bookCount; i++) {

            if (books[i]
                    .getBookId()
                    .equalsIgnoreCase(bookId)) {

                return books[i];
            }
        }

        return null;
    }

    public boolean borrowBook(String bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            return false;
        }

        if (!book.isAvailable()) {

            return false;
        }

        book.setAvailable(false);

        return true;
    }

    public boolean returnBook(String bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            return false;
        }

        if (book.isAvailable()) {

            return false;
        }

        book.setAvailable(true);

        return true;
    }

    public void printReport() {

        System.out.println(
                "\nSTUDENT LIBRARY REPORT");

        System.out.println(
                "======================");

        if (bookCount == 0) {

            System.out.println(
                    "No books are currently available.");

            return;
        }

        for (int i = 0; i < bookCount; i++) {

            System.out.println(
                    "\nBOOK " + (i + 1));

            System.out.println(
                    books[i].getBookDetails());
        }
    }
}

    

