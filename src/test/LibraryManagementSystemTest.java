package test;

import main.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagementSystemTest {

    @Test
    public void testRegularMemberCanBorrowBook() {
        Library library = new Library();
        RegularMember member = new RegularMember("John");
        Book book = new Book("The Hobbit", "J.R.R. Tolkien");

        library.addMember(member);
        library.addBook(book);

        library.borrowBook(member, book);

        assertFalse(book.isAvailable());
        assertTrue(member.getBorrowedBooks().contains(book));
    }

}
