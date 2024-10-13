package main;

import java.util.ArrayList;
import java.util.List;

public class MemberManager{
    private List<Member> members;


    public MemberManager() {
        // super(name);
        //TODO Auto-generated constructor stub
        members = new ArrayList<Member>();

    }



    public void borrowBook(RegularMember member, Book book){
        member.getBorrowedBooks().add(book);
        book.setAvailable(false);


    }
    public void addMember(RegularMember  member){
        members.add(member);

    }


    // private BookManager bookManager;
    // private MemeberManager memberManager;

    // private List<RegularMember> members;
    // private List<Book> books;

    // public Library(){
    //     this.members = new ArrayList<RegularMember>();
    //     this.books = new ArrayList<Book>();

    // }

    // public void addMember(RegularMember  member){
    //     members.add(member);

    // }
    // public void addBook(Book book){
    //     books.add(book);


    // }
    // public void borrowBook(RegularMember member, Book book){
    //     member.getBorrowedBooks().add(book);
    //     book.setAvailable(false);


    // }


    


    
}
