package Model;

/**
 * Created by carl on 2016-10-06.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Member {
    String uniqueId= UUID.randomUUID().toString();
    ArrayList<Boat> BoatArray = new ArrayList<>();
    String name;
    int personalNum;
    int memberID;
    int userChoice;

    Boat[] boatArr = new Boat[5];
    Log log = new Log();

    public String getName(){
        return this.name;
    }
    public int getPersonNr(){
        return this.personalNum;
    }
    public String getUniqueId(){
        return this.uniqueId;
    }

    public Member(String name, int personalNum){
        this.name=name;
        this.personalNum=personalNum;
    }
    public Member(){

    }
    public String returnName(){
        return this.name;
    }

    public void addBoat(String model, int length){
        BoatArray.add(new Boat(model,length));
    }
    public Boat getBoatByModel(String model) {
        for (int i = 0; i < BoatArray.size(); i++) {
            if (BoatArray.get(i).model == model) {
                return BoatArray.get(i);
            }
        }
        return null;
    }


    public void changeBoat(Boat b , String model, int length){
        BoatArray.get(BoatArray.indexOf(b)).model = model;
        BoatArray.get(BoatArray.indexOf(b)).length = length;
    }

    public void removeBoat(Boat b){
        BoatArray.remove(b);
    }

    public boolean containsBoat(Boat b){
        if(BoatArray.contains(BoatArray.indexOf(b))){
            return true;
        }
        else return false;

    }
    public int numberOfBoats(){
        return BoatArray.size();
    }

    public Boat getBoatByIndex() {
        return BoatArray.get(userChoice);
    }



    public void iterateBoat(){
        for (int i = 0; i < BoatArray.size(); i++) {
        }
        System.out.println("Choose which boat you want to interfer with by entering its indexnumber\n");
        Scanner scan=new Scanner(System.in);
        userChoice = scan.nextInt();
    }
}