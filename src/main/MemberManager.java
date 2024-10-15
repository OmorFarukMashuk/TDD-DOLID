package main;

import java.util.ArrayList;
import java.util.List;

public class MemberManager {
    public List<Member> getMembers() {
        return members;
    }

    private List<Member> members;

    public MemberManager(){
        this.members = new ArrayList<>();

    }

}
