package Model;

/**
 * Created by carl on 2016-10-06.
 */
import java.util.ArrayList;
public class ManageMember {
    Log log = new Log();
    ArrayList<Member> memArray = new ArrayList<>();


    public void addMem(String name, int personalNum, int memberID){
        memArray.add(new Member(name, personalNum, memberID));
        log.logMem(getMemById(memberID), memberID);
    }

    public void changeMem(Member mem, String name, int personalNumber){
        log.changeMem(mem.name,mem.personalNum,mem.memberID);
        memArray.get(memArray.indexOf(mem)).name = name;
        memArray.get(memArray.indexOf(mem)).personalNum = personalNumber;

    }

    public void removeMem(Member mem){
        log.removeMember(mem.memberID);
        memArray.remove(mem);
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
        for (int i = 0; i < memArray.size() ; i++) {
            if(name == memArray.get(i).name){
                return memArray.get(i);
            }
        }
        return null;
    }

    public void iteration(){
        System.out.println(memArray.size());
        for (int i = 0; i < memArray.size() ; i++) {
            System.out.println(memArray.get(i).name);
            System.out.println(memArray.get(i).personalNum);
            System.out.println(memArray.get(i).memberID);
            System.out.println("");
        }
    }
}
