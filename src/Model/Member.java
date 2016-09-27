package Model;

import java.util.HashMap;

/**
 * Created by user on 2016-09-20.
 */
public class Member {
    public String name;
    public int personalNum;
    public int memberID;
    Log log = new Log();
    HashMap<Integer, Member> memList = new HashMap<Integer, Member>();


    public Member() {
    }

    public Member(String name, int personalNum, int memberID) {
        this.memberID = memberID;
        this.name = name;
        this.personalNum = personalNum;
    }



    public boolean removeMem(int memberID){
        memList.remove(memberID);

        return true;
    }


    public boolean addMem(String name, int personalNum, int memberID) {
        Member newMem = new Member(name, personalNum, memberID);
        if (!containsMember(memberID)) {
            memList.put(memberID, newMem);
            log.logMem(newMem,memberID);
            return true;
        } else {
            System.err.println("MemberID already exist");
            return false;
        }
    }

    public Member getMem(int memberID) { //Returns member from hashmap
        if(containsMember(memberID))
            return memList.get(memberID);
        else return null;
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

