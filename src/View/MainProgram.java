package View;

import Model.Boat;

/**
 * Created by user on 2016-09-20.
 */
public class MainProgram {

    public static void main(String[]args){

        Boat newBoat = new Boat("Anton",10,10);
        System.out.println(newBoat.id);
    }

}
