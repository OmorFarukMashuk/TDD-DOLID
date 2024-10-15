package main;
import java.util.ArrayList;

public class PremiumMember extends Member {

    public PremiumMember(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();

    }

    @Override
    public void returnBook(IBook book) {
        borrowedBooks.remove(book);
    }

    @Override
    public int getBorrowLimit() {
        return 5;
    }

    public void extendBorrowPeriod(IBook book) {
        book.setBorrowedForExtendedPeriod(true);
        
    }

}
