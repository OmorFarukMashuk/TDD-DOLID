package main;


public class Book {

    private String title;
    private String author;
    private boolean isAvailable;
    private boolean borrowedForExtendedPeriod;
    
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.borrowedForExtendedPeriod = false;

    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public boolean isAvailable(){
        return isAvailable;

    }
    public void setAvailable(boolean availability){
        this.isAvailable = availability;

    }
    public boolean isBorrowedForExtendedPeriod() {
        return this.borrowedForExtendedPeriod;
    }
    public void setBorrowedForExtendedPeriod(boolean ext) {
        this.borrowedForExtendedPeriod = true;
    }
    
    


    
    
}
