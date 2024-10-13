package main;

import java.util.List;

public abstract class Member {

    protected String name;

    protected List<Book> borrowedBooks;

    public List<Book> getBorrowedBooks(){
        return this.borrowedBooks;
    }
    
    public String getName() {
        return this.name;
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
        book.setAvailable(false);

    }
    
}
