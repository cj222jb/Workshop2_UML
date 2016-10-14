package Model;

/**
 * Created by carl on 2016-10-06.
 */
import java.util.ArrayList;
public class ManageMember {
    Log log = new Log();
    public ArrayList<Member> memArray = new ArrayList<>();

    public void addMem(String name, long personalNum,String id){
        Member temp;
        memArray.add(temp = new Member(name, personalNum,id));
        log.logMem(temp);
    }
    public ArrayList<Member> returnList(){
        return memArray;
    }

    public void changeMem(Member mem, String name, long personalNumber){
        log.changeMem(name,personalNumber,mem.uniqueId);
        memArray.get(memArray.indexOf(mem)).name = name;
        memArray.get(memArray.indexOf(mem)).personalNum = personalNumber;
    }
    public void removeMem(Member mem){
        log.removeMember(mem.uniqueId);
        memArray.remove(mem);
    }
}
