package main;
import java.util.ArrayList;

public class RegularMember extends Member{

    public RegularMember(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();

    }
    @Override
    public void returnBook(IBook book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);

    }

    @Override
    public int getBorrowLimit() {
        return 2;

    }

    
}
