package main;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();


    }

    public List<Book> getBooks() {
        return this.books;

    }

    public List<Member> getMembers() {
        return this.members;

    }

    public void addBook(Book book1) {
        books.add(book1);
        
    }

    public void addMember(Member member) {
        members.add(member);

    }





    
}
