package main;

import java.util.ArrayList;
import java.util.List;

public class BookManager{
    private List<Book> books;
    public BookManager() {
        // super(title, author);
        this.books = new ArrayList<>();

    }
    public void addBook(Book book){
        books.add(book);


    }
    
}
