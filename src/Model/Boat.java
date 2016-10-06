package Model;

public class Boat {
    public String model;
    public int length;
    static Member mem = new Member();

    public Boat(String model,int length){
        this.model=model;
        this.length=length;
    }
    public Boat(){

    }

}
