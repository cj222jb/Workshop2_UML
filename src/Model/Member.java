package Model;

import java.util.ArrayList;

/**
 * Created by user on 2016-09-20.
 */
public class Member {
    public String name;
    public int personalNum;
    public int memberID;
<<<<<<< HEAD
    Log log = new Log();
=======

>>>>>>> 2cf4ee598d063dd803f1bb598c52f5ffa9f8750c
    ArrayList<Member> list = new ArrayList<>();

    public Member(){
    }
    public Member(String name, int personalNum, int memberID){
        this.memberID = memberID;
        this.name = name;
        this.personalNum = personalNum;
    }

    public void removeMem(int memberID){
        list.remove(memberID);
    }
    public void addMem(String name, int personalNum, int memberID){
        Member newMem = new Member(name, personalNum, memberID);
        list.add(newMem);
    }
    public Member getMem(int index){
        return list.get(index);
    }
}
