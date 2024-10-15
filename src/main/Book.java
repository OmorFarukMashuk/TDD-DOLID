package main;


public class Book implements IBook{

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
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable(){
        return isAvailable;

    }
    @Override
    public void setAvailable(boolean availability){
        isAvailable = availability;

    }
    @Override
    public boolean isBorrowedForExtendedPeriod() {
        return this.borrowedForExtendedPeriod;
    }    
    @Override
    public void setBorrowedForExtendedPeriod(boolean ext) {
        borrowedForExtendedPeriod = true;
    }
    
}
