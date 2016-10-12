package Model;

public class Boat {
     String model;
     int length;
     int nr;

    public Boat(String model,int length,int nr){
        this.model=model;
        this.length=length;
        this.nr=nr;
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


