/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.book;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Library library = new Library(10);
            
            library.addBook(
                    new Book(
                            "B001",
                            "Introduction to Java",
                            "John Smith"
                    )
            );
            
            library.addBook(
                    new TextBook(
                            "B002",
                            "Programming Fundamentals",
                            "Mary Jones",
                            "Computer Science"
                    )
            );
            
            library.addBook(
                    new TextBook(
                            "B003",
                            "Database Fundamentals",
                            "Peter Brown",
                            "Information Technology"
                    )
            );
            
            boolean running = true;
            
            while (running) {
                
                System.out.println(
                        "\nSTUDENT LIBRARY MANAGEMENT SYSTEM");
                
                System.out.println(
                        "1. Search for a book");
                
                System.out.println(
                        "2. Borrow a book");
                
                System.out.println(
                        "3. Return a book");
                
                System.out.println(
                        "4. Print library report");
                
                System.out.println(
                        "5. Exit");
                
                System.out.print(
                        "Enter your choice: ");
                
                String choice = scanner.nextLine();
                
                switch (choice) {
                    
                    case "1" -> {
                        System.out.print(
                                "Enter the book ID to search: ");
                        
                        String searchId =
                                scanner.nextLine();
                        
                        Book foundBook =
                                library.searchBook(searchId);
                        
                        if (foundBook != null) {
                            
                            System.out.println(
                                    "\n" + foundBook
                                            .getBookDetails());
                            
                        } else {
                            
                            System.out.println(
                                    "Book was not found.");
                        }
                    }
                        
                    case "2" -> {
                        System.out.print(
                                "Enter the book ID to borrow: ");
                        
                        String borrowId =
                                scanner.nextLine();
                        
                        if (library.borrowBook(borrowId)) {
                            
                            System.out.println(
                                    "Book borrowed successfully.");
                            
                        } else {
                            
                            System.out.println(
                                    "Book could not be borrowed.");
                        }
                    }
                        
                    case "3" -> {
                        System.out.print(
                                "Enter the book ID to return: ");
                        
                        String returnId =
                                scanner.nextLine();
                        
                        if (library.returnBook(returnId)) {
                            
                            System.out.println(
                                    "Book returned successfully.");
                            
                        } else {
                            
                            System.out.println(
                                    "Book could not be returned.");
                        }
                    }
                        
                    case "4" -> library.printReport();
                        
                    case "5" -> {
                        running = false;
                        
                        System.out.println(
                                "Thank you for using the "
                                        + "Student Library Management System.");
                    }
                        
                    default -> System.out.println(
                                "Invalid option. Please try again.");
                }
            }
        }
    }
}



    

