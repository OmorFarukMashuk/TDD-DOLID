package main;
import java.util.ArrayList;

public class RegularMember extends Member{

    public RegularMember(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();

    }
    
}
