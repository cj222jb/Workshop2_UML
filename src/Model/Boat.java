package Model;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by user on 2016-09-20.
 */
public class Boat {

    static Log log = new Log();
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

    public void addBoat(String model, int id, int length){
        Boat newBoat = new Boat(model,id,length);
        blist.add(newBoat);
        log.logboat(newBoat,id);

    }

    public Boat getBoat(int index){
        return blist.get(index);
    }

    public void deleteBoat(int boatID){

    }
    public void changeBoat(){
    }
}
