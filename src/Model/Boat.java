package Model;

public class Boat {
     String model;
     double length;
     int nr;

    public Boat(String model,double length,int nr){
        this.model=model;
        this.length=length;
        this.nr=nr;
    }
    public String getType(){
        return this.model;
    }
    public double getLength(){
        return this.length;
    }
}


