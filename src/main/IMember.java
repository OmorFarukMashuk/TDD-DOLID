package main;

import java.util.List;

public interface IMember {
    List<IBook> getBorrowedBooks();
    String getName();
    void borrowBook(IBook book);
    void returnBook(IBook book);
    int getBorrowLimit();

}
