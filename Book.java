/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author Student
 */
public class Book {

    private String bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(String bookId, String title, String author) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBookDetails() {

        return "BOOK ID: " + bookId
                + "\nTITLE: " + title
                + "\nAUTHOR: " + author
                + "\nAVAILABLE: " + available;
    }
}

    