package main;

import java.util.List;

public class Library {

    private BookManager bookManager;
    private MemberManager memberManager;

    public Library(){
        this.bookManager = new BookManager();
        this.memberManager = new MemberManager();
    }



    public List<IBook> getBooks() {
        return bookManager.getBooks();

    }

    public List<IMember> getMembers() {
        return memberManager.getMembers();

    }

    public void addBook(IBook book1) {

        bookManager.addBook(book1);
        
    }

    public void addMember(IMember member) {
        memberManager.addMember(member);

    }

    
}
