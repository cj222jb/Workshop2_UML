package Model;

public class Boat {
     String model;
     int length;

    public Boat(String model,int length){
        this.model=model;
        this.length=length;
    }
    public Boat(){
    }

    public String getType(){
        return this.model;
    }
    public int getLength(){
        return this.length;
    }
}


