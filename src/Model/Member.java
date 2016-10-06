package Model;

import java.util.ArrayList;

/**
 * Created by user on 2016-09-20.
 */
public class Member {
    public String name;
    public int personalNum;
    public int memberID;
    Log log = new Log();
    Boat boat = new Boat();
    ArrayList<Member> memList = new ArrayList<>();


    public Member() {
    }

    public Member(String name, int personalNum, int memberID, Boat[] boat) {
        this.memberID = memberID;
        this.name = name;
        this.personalNum = personalNum;
    }
    public boolean removeMem(int memberID){
        memList.remove(memberID);
        log.removeMember(memberID);
        return true;
    }
    public boolean addMem(String name, int personalNum, int memberID) {

        Member newMem = new Member(name, personalNum, memberID, null);
        memList.add(newMem);

        /*
        if (!containsMember(memberID)) {
            memList.put(memberID, newMem);
            log.logMem(newMem,memberID);
            return true;
        } else {
            System.err.println("MemberID already exist");
            return false;
        }
        */
        return true;
    }
    public Member getMem(int memberID) {

        for(int i = 0; i < memList.size(); i++){
        }
        return null;
    }
    public boolean containsMember ( int memberID){ //check if Hashmap contains memberID
        if (memList.get(memberID) == null)
            return false;
        else return true;

    }
    public void changeMem(String name, int personalNum, int memberID) { //Removes old member information and replace with new
       removeMem(memberID);
        addMem(name, personalNum, memberID);
    }
}

