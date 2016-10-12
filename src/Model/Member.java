package Model;

/**
 * Created by carl on 2016-10-06.
 */
import View.Console;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {
    Console cons = new Console();
    ArrayList<Boat> BoatArray = new ArrayList<>();
    public String name;
    public int personalNum;
    public int memberID;
    public int userChoice;

    Boat[] boatArr = new Boat[5];
    Log log = new Log();



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
    public void iteration(){
        for (int i = 0; i < BoatArray.size() ; i++) {
            System.out.println(BoatArray.get(i).model);
            System.out.println(BoatArray.get(i).length);
            System.out.println("");
        }
    }
    public void changeBoat(int index,String model,int length) {
        boatArr[index].model = model;
        boatArr[index].length = length;
        log.changeBoat(boatArr[index], memberID);
    }
    public int numberOfBoats(){
        return BoatArray.size();
    }

    public Boat getBoatByIndex() {
        return BoatArray.get(userChoice);
    }



    public void iterateBoat(){
        for (int i = 0; i < BoatArray.size(); i++) {
            System.out.println(boatArr[i]+" Indexnumber: "+i);
        }
        System.out.println("Choose which boat you want to interfer with by entering its indexnumber\n");
        Scanner scan=new Scanner(System.in);
        userChoice =scan.nextInt();
    }
}