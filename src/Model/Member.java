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
    //HashMap<Integer, Member> memList = new HashMap<Integer, Member>();
    ArrayList<Member> memList = new ArrayList<>();



    public Member() {
    }

    public Member(String name, int personalNum, int memberID, Boat[] boat) {
        this.memberID = memberID;
        this.name = name;
        this.personalNum = personalNum;
    }



    public boolean removeMem(int memberID){
        for(int i = 0; i < memList.size(); i++){
            if(memList.get(i).memberID == memberID){
                memList.remove(i);
            }
        }

        log.removeMember(memberID);
        return true;
    }


    public void addMem(String name, int personalNum, int memberID) {
        if(!containsMember(memberID)) {
            Member newMem = new Member(name, personalNum, memberID, null);
            memList.add(newMem);
        }
    }

    public Member getMem(int memberID) { //Returns member from hashmap

        for(int i = 0; i < memList.size(); i++){
            if(memList.get(i).memberID == memberID){
                return memList.get(i);
            }
            else return null;
        }


        return null;
    }

    public boolean containsMember(int ID){
        for(int i = 0; i < memList.size(); i ++){
            if(memList.get(i).memberID == ID)
                return true;
        }
        return false;
    }


    public void changeMem(String name, int personalNum, int memberID) { //Removes old member information and replace with new
       removeMem(memberID);
        addMem(name, personalNum, memberID);
    }
}

