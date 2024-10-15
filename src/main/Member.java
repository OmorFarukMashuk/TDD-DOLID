package main;

import java.util.List;

public abstract class Member {

    protected String name;
    protected List<Book> borrowedBooks;

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }
    
    public String getName() {
        return name;
    }



    public void borrowBook(Book book){
        if(!book.isAvailable()){
            throw new RuntimeException("Book is out of stock");

        }
        else if(borrowedBooks.size() == getBorrowLimit()){
            throw new RuntimeException("Borrow limit exceeded");
        }
        else{
            borrowedBooks.add(book);
            book.setAvailable(false);

        }


    }
    public abstract void returnBook(Book book);
    public abstract int getBorrowLimit();

    
}
