/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import com.mycompany.book.Book;
import com.mycompany.book.Library;
import com.mycompany.book.TextBook;

public class LibraryTest {

    private Library library;

    
    public void setUp() {

        library = new Library(5);

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
    }

    public void testSearchBook() {

        Book result =
                library.searchBook("B001");

        assertNotNull(result);

        assertEquals(
                "B001",
                result.getBookId());

        assertEquals(
                "Introduction to Java",
                result.getTitle());
    }

    
    public void testSearchBookNotFound() {

        Book result =
                library.searchBook("B999");

        assertNull(result);
    }

    
    public void testBorrowBook() {

        boolean result =
                library.borrowBook("B001");

        assertTrue(result);

        Book book =
                library.searchBook("B001");

        assertFalse(
                book.isAvailable());
    }

   
    public void testBorrowBookAlreadyBorrowed() {

        library.borrowBook("B001");

        boolean result =
                library.borrowBook("B001");

        assertFalse(result);
    }

    
    public void testReturnBook() {

        library.borrowBook("B001");

        boolean result =
                library.returnBook("B001");

        assertTrue(result);

        Book book =
                library.searchBook("B001");

        assertTrue(
                book.isAvailable());
    }

    
    public void testReturnBookNotBorrowed() {

        boolean result =
                library.returnBook("B001");

        assertFalse(result);
    }

   
    public void testTextBookInheritance() {

        Book book =
                library.searchBook("B002");

        assertNotNull(book);

        assertTrue(
                book instanceof TextBook);
    }

    private void assertNotNull(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertTrue(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertFalse(boolean result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertNull(Book result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String b001, String bookId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

