package test;

import main.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class LibraryManagementSystemTest {

    @Test
    void testBookCreation() {
        Book book = new Book("1984", "George Orwell");
        assertEquals("1984", book.getTitle());
        assertEquals("George Orwell", book.getAuthor());
        assertTrue(book.isAvailable());
    }

    @Test
    void testMemberRegistration() {
        Member regularMember = new RegularMember("John");
        Member premiumMember = new PremiumMember("Alice");

        assertEquals("John", regularMember.getName());
        assertEquals("Alice", premiumMember.getName());
        assertTrue(regularMember instanceof RegularMember);
        assertTrue(premiumMember instanceof PremiumMember);
    }

    @Test
    void testBorrowBook() {
        Book book = new Book("1984", "George Orwell");
        Member member = new RegularMember("John");

        member.borrowBook(book);
        assertFalse(book.isAvailable());
        assertEquals(1, member.getBorrowedBooks().size());
    }

    @Test
    void testReturnBook() {
        Book book = new Book("1984", "George Orwell");
        Member member = new RegularMember("John");

        member.borrowBook(book);
        member.returnBook(book);

        assertTrue(book.isAvailable());
        assertEquals(0, member.getBorrowedBooks().size());
    }

    @Test
    void testBorrowLimitExceededForRegularMember() {
        Book book1 = new Book("Book1", "Author1");
        Book book2 = new Book("Book2", "Author2");
        Book book3 = new Book("Book3", "Author3");

        Member member = new RegularMember("John");

        member.borrowBook(book1);
        member.borrowBook(book2);

        // Should fail to borrow a third book
        Exception exception = assertThrows(RuntimeException.class, () -> {
            member.borrowBook(book3);
        });

        assertEquals("Borrow limit exceeded", exception.getMessage());
    }

    @Test
    void testOutOfStockNotification() {
        Book book = new Book("1984", "George Orwell");
        book.setAvailable(false); // Book is out of stock

        Member member = new RegularMember("John");

        Exception exception = assertThrows(RuntimeException.class, () -> {
            member.borrowBook(book);
        });

        assertEquals("Book is out of stock", exception.getMessage());
    }

    @Test
    void testExtendBorrowPeriodForPremiumMember() {
        Book book = new Book("1984", "George Orwell");
        PremiumMember member = new PremiumMember("Alice");

        member.borrowBook(book);
        member.extendBorrowPeriod(book);
        assertTrue(book.isBorrowedForExtendedPeriod());
    }

    @Test
    void testLibraryComposition() {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        Member member = new PremiumMember("Alice");
        library.addMember(member);

        assertEquals(2, library.getBooks().size());
        assertEquals(1, library.getMembers().size());
    }
}
