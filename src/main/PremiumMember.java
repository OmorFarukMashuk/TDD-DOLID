package main;
import java.util.ArrayList;

public class PremiumMember extends Member {

    public PremiumMember(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();

    }

    @Override
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public int getBorrowLimit() {
        return 5;
    }

    public void extendBorrowPeriod(Book book) {
        book.setBorrowedForExtendedPeriod(true);
        
        // throw new UnsupportedOperationException("Unimplemented method 'extendBorrowPeriod'");
    }

}
