package Model;

/**
 * Created by carl on 2016-10-06.
 */

import View.Console;

import java.util.ArrayList;

public class ManageMember {
    Console cons = new Console();
    ArrayList<Member> memArray = new ArrayList<>();

    public ManageMember(){
        this.memArray = cons.memArr;
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



}
