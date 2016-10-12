package Model;

/**
 * Created by carl on 2016-10-06.
 */
import java.util.ArrayList;
public class ManageMember {
    Log log = new Log();
    ArrayList<Member> memArray = new ArrayList<>();

    public void addMem(String name, int personalNum){
        memArray.add(new Member(name, personalNum));

    }
    public ArrayList<Member> returnList(){
        return memArray;
    }

    public void addMem(String name, int personalNum, int memberID){
        memArray.add(new Member(name, personalNum));
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
}
