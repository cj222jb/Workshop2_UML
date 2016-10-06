package Model;

import java.util.ArrayList;

public class Boat {
    static Log log = new Log();
    public String model;
    public int id;
    public int length;
    ArrayList<Boat> list = new ArrayList<>();

    public Boat(String model,int length,int id){
        this.model=model;
        this.id=id;
        this.length=length;
    }
    public Boat(){

    }

    public void addBoat(String model, int length, int boatID){
        list.add(new Boat(model,length,boatID));
    }

    public Boat getBoat(int boatID){
        return (list.get(boatID));
    }

    public void removeBoat(int boatID) {

        list.remove(boatID);
    }
    public void changeBoat(){
    }
}
