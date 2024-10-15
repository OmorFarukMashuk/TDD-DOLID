package main;

import java.util.List;

public class Library {

    private BookManager bookManager;
    private MemberManager memberManager;

    public Library(){
        this.bookManager = new BookManager();
        this.memberManager = new MemberManager();
    }



    public List<Book> getBooks() {
        return bookManager.getBooks();

    }

    public List<Member> getMembers() {
        return this.memberManager.getMembers();

    }

    public void addBook(Book book1) {

        bookManager.getBooks().add(book1);
        
    }

    public void addMember(Member member) {
        memberManager.getMembers().add(member);

    }

    
}
