package Model;

/**
 * Created by carl on 2016-10-06.
 */
import View.Console;

import java.util.ArrayList;
public class ManageMember {
    Console cons = new Console();
    ArrayList<Member> memArray = new ArrayList<>();


    public void addMem(String name, int personalNum, int memberID){
        memArray.add(new Member(name, personalNum, memberID));
    }

    public void changeMem(Member mem, String name, int personalNumber){
        memArray.get(memArray.indexOf(mem)).name = name;
        memArray.get(memArray.indexOf(mem)).personalNum = personalNumber;
    }

    public void removeMem(Member mem){
        memArray.remove(memArray.indexOf(mem));
    }

    public boolean containsMem(Member mem){
        if(memArray.contains(memArray.indexOf(mem))){
            return true;
        }
        else return false;

    }

    public Member getMemById(int ID){
        for (int i = 0; i <memArray.size() ; i++) {
            if(memArray.get(i).memberID==ID){
                return memArray.get(i);
            }
        }
        return null;
    }

    public Member getMemByName(String name){
        return memArray.get(memArray.indexOf(name));
    }

    public void iteration(){
        for (int i = 0; i < memArray.size() ; i++) {
            System.out.println(memArray.get(i).name);
            System.out.println(memArray.get(i).personalNum);
            System.out.println(memArray.get(i).memberID);
        }
    }
}
