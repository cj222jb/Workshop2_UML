package Model;

/**
 * Created by user on 2016-09-20.
 */
public class Member {
    public String name;
    public int personalNum;
    public int memberID;
    Log log = new Log();
    public Member[] memArr= new Member[10];

    public Member(){

    }
    public Member(String name, int personalNum, int memberID){
        this.memberID = memberID;
        this.name = name;
        this.personalNum = personalNum;
    }


    public void removeMem(int memberID){

    }
    public void addMem(String name, int personalNum, int memberID){
        Member newMem = new Member(name, personalNum, memberID);
        memArr[1] = newMem;
    }
    public Member getMem(int index){

        return memArr[index];
    }
}
