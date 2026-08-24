/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author Student
 */
public class TextBook extends Book {

    private String subject;

    public TextBook(String bookId,
                    String title,
                    String author,
                    String subject) {

        super(bookId, title, author);

        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getBookDetails() {

        return super.getBookDetails()
                + "\nSUBJECT: " + subject;
    }
}

