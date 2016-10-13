package Model;

/**
 * Created by carl on 2016-10-06.
 */
import java.util.ArrayList;
import java.util.UUID;
public class Member {
    String uniqueId;
    Log log = new Log();
    ArrayList<Boat> BoatArray = new ArrayList<>();
    String name;
    int personalNum;

    public Member(String name, int personalNum,String id){
        this.name=name;
        this.personalNum=personalNum;
        if(id=="")
            uniqueId= UUID.randomUUID().toString();
            else
            uniqueId=id;
    }

    public ArrayList<Boat> returnBList(){
        return BoatArray;
    }
    public String getName(){
        return this.name;
    }
    public int getPersonNr(){
        return this.personalNum;
    }
    public String getUniqueId(){
        return this.uniqueId;
    }

    public void addBoat(String model, int length,boolean status) {
        int nr = 1;
        for (int i = 0; i < BoatArray.size() - 1; i++)
            if (nr == BoatArray.get(i).nr) {
                nr++;
                i = 0;
            }
        Boat temp;
        BoatArray.add(temp = new Boat(model, length, nr));
        if (!status) log.logboat(temp, uniqueId);
    }

    public void changeBoat(Boat b , String model, int length){
        BoatArray.get(BoatArray.indexOf(b)).model = model;
        BoatArray.get(BoatArray.indexOf(b)).length = length;
    }

    public void removeBoat(Boat b){
        BoatArray.remove(b);
    }
    public boolean containsBoat(){
        if(BoatArray.size()==0){
            return false;
        }
        return true;
    }
}
