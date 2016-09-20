package View;

import Model.Boat;
import Model.Member;
import Model.Log;


public class MainProgram {
    static Member mem = new Member();
    static Log log = new Log();
    public static void main(String[]args){

        Boat newBoat = new Boat("Anton",10,10);
        System.out.println(newBoat.id);
        mem.addMem("Lindmark", 951001, 1);
        System.out.println(log.getMem(1).toString());
    }

}
