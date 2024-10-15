package main;
import java.util.ArrayList;

public class RegularMember extends Member{

    public RegularMember(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();

    }
    @Override
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);

    }

    @Override
    public int getBorrowLimit() {
        return 2;

    }


    // @Override
    // public void borrowBook(Book book){
    //     if(!book.isAvailable()){
    //         throw new RuntimeException("Book is out of stock");

    //     }
    //     else if(borrowedBooks.size() == getBorrowLimit()){
    //         throw new RuntimeException("Borrow limit exceeded");
    //     }
    //     else{
    //         borrowedBooks.add(book);
    //         book.setAvailable(false);

    //     }


    // }
    

    
}
