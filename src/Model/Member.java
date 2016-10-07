package Model;

/**
 * Created by carl on 2016-10-06.
 */
import View.Console;

import java.util.ArrayList;
public class Member {
    Console cons = new Console();
    ArrayList<Boat> BoatArray = new ArrayList<>();
    public String name;
    public int personalNum;
    public int memberID;


    public Member(String name, int personalNum, int memberID){
        this.name=name;
        this.personalNum=personalNum;
        this.memberID=memberID;
    }
    public Member(){
    }

    public void addBoat(String model, int length){
        BoatArray.add(new Boat(model,length));
    }
    public Boat getBoatByModel(String model){
        for (int i = 0; i <BoatArray.size() ; i++) {
            if(BoatArray.get(i).model==model){
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
    public void iteration(){
        for (int i = 0; i < BoatArray.size() ; i++) {
            System.out.println(BoatArray.get(i).model);
            System.out.println(BoatArray.get(i).length);
            System.out.println("");
        }
    }
}
