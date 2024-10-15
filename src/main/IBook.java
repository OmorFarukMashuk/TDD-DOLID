package main;

public interface IBook {

    String getTitle();
    String getAuthor();
    boolean isAvailable();
    void setAvailable(boolean availability);
    boolean isBorrowedForExtendedPeriod();
    void setBorrowedForExtendedPeriod(boolean ext);



}
