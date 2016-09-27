package Model;

import java.util.HashMap;

/**
 * Created by user on 2016-09-20.
 */
public class Member {
    public String name;
    public int personalNum;
    public int memberID;
    HashMap<Integer, Member> memList = new HashMap<Integer, Member>();
    Log log = new Log();


    public Member(){
    }
    public Member(String name, int personalNum, int memberID){
        this.memberID = memberID;
        this.name = name;
        this.personalNum = personalNum;
    }

  /*  public boolean removeMem(int memberID){
        list.remove(memberID);
        return true;
    }*/


    public void addMem(String name, int personalNum, int memberID){
        Member newMem = new Member(name, personalNum, memberID);
        memList.put(memberID, newMem);
    }

    public Member getMem(int memberID){

        return memList.get(memberID);
    }

    public void changeMem(String name, int personalNum, int index){
      //  removeMem(index);

    }
}
