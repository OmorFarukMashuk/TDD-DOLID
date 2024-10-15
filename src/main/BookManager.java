package main;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<IBook> books;

    public List<IBook> getBooks() {
        return books;
    }

    public BookManager(){
        this.books = new ArrayList<>();


    }
    public void addBook(IBook book) {
        books.add(book);
    }

}
