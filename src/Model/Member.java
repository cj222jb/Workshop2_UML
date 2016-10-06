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
    static Boat boat = new Boat();
    Boat[] boatArr = new Boat[5];



    public Member() {
    }

    public Member(String name, int personalNum, int memberID) {
        this.memberID = memberID;
        this.name = name;
        this.personalNum = personalNum;
    }

    public void logMem(){
        log.logMem(name, personalNum, memberID);
    }

}

