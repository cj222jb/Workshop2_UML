package Model;

/**
 * Created by carl on 2016-10-06.
 */
import View.Console;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Member {
    String uniqueId= UUID.randomUUID().toString();
    Console cons = new Console();
    ArrayList<Boat> BoatArray = new ArrayList<>();
    String name;
    int personalNum;
    int memberID;
    int userChoice;

    Log log = new Log();

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
}