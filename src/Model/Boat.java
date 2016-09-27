package Model;

import java.util.ArrayList;

/**
 * Created by user on 2016-09-20.
 */
public class Boat {

    public String model;
    public int id;
    public int length;
    ArrayList<Boat> blist = new ArrayList<>();


    public Boat(String model,int id,int length){
        this.model=model;
        this.id=id;
        this.length=length;
    }
    public Boat(){

    }

    public void addBoat(String model, int length, int id){
        Boat newBoat = new Boat(model,length,id);
        blist.add(newBoat);

    }

    public Boat getBoat(int index){


        return blist.get(index);
    }

    public void deleteBoat(int boatID){

    }
    public void changeBoat(){
    }
}
