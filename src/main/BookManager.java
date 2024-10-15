package main;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public BookManager(){
        this.books = new ArrayList<>();


    }

}
