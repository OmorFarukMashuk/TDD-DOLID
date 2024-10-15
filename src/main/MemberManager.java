package main;

import java.util.ArrayList;
import java.util.List;

public class MemberManager {


    private List<IMember> members;
    public List<IMember> getMembers() {
        return members;
    }

    public MemberManager(){
        this.members = new ArrayList<>();

    }

    public void addMember(IMember member) {
        members.add(member);
 
    }

}
