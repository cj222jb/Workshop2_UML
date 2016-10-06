package Model;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 2016-09-20.
 */
public class Boat {




    static Log log = new Log();
    public String model;
    public int id;
    public int length;
    HashMap<Integer, Boat> boatList = new HashMap<Integer, Boat>();


    public Boat(String model,int length,int id){
        this.model=model;
        this.id=id;
        this.length=length;
    }
    public Boat(){

    }

    public void addBoat(String model, int length, int boatID){
        Boat newBoat = new Boat(model,length,boatID);
            boatList.put(boatID, newBoat);
            log.logboat(newBoat,boatID);

    }

    public Boat getBoat(int boatID){
        if(containsBoat(boatID))
            return boatList.get(boatID);
        else return null;

    }

    public boolean containsBoat(int boatID){
        if(boatList.get(boatID) != null)
            return true;
        else return false;

    }

    public void removeBoat(int boatID){
        if(containsBoat(boatID))
            boatList.remove(boatID);
            //log.removeBoat(boatID);

    }
    public void changeBoat(){
    }
}
