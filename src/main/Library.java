package main;

public class Library {

    private BookManager bookManager;
    private MemberManager memberManager;

    public Library() {
        this.bookManager = new BookManager();
        this.memberManager = new MemberManager();
    }

    public void addMember(RegularMember member) {
        memberManager.addMember(member);
    }

    public void addBook(Book book) {
        bookManager.addBook(book);
    }

    public void borrowBook(RegularMember member, Book book) {
        member.borrowBook(book);
    }    


    
}
