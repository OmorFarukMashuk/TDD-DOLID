package main;

import java.util.ArrayList;
import java.util.List;

public class RegularMember {

    private String name;

    private List<Book> borrowedBooks;

    public RegularMember(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();

    }

    public List<Book> getBorrowedBooks(){
        return this.borrowedBooks;
    }

    public String getName(){
        return this.name;
    }
    


    
    
}
