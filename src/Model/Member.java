package Model;

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


    public void addBoat(String model,int length){
        Boat b = new Boat(model,length);
        for (int i = 0; i <5 ; i++) {
            if(boatArr[i]==null){
                boatArr[i]=b;
                break;
            }
        }
    }
    public void deleteBoat(int index) {
        boatArr[index]=null;
    }
    public void changeBoat(int index,String model,int length) {
        boatArr[index].model=model;
        boatArr[index].length=length;
    }
}

