package main;

import java.util.List;

public abstract class Member implements IMember{

    protected String name;
    protected List<IBook> borrowedBooks;

    public List<IBook> getBorrowedBooks(){
        return borrowedBooks;
    }
    
    public String getName() {
        return name;
    }



    public void borrowBook(IBook book){
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

    
}
