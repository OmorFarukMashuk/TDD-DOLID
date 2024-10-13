package main;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<RegularMember> members;
    private List<Book> books;

    public Library(){
        this.members = new ArrayList<RegularMember>();
        this.books = new ArrayList<Book>();

    }

    public void addMember(RegularMember  member){
        members.add(member);

    }
    public void addBook(Book book){
        books.add(book);


    }
    public void borrowBook(RegularMember member, Book book){
        member.getBorrowedBooks().add(book);
        book.setAvailable(false);


    }


    


    
}
