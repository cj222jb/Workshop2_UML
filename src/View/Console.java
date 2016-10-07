package View;


import Model.Member;
import Model.ManageMember;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    public static ManageMember manageMem = new ManageMember();
    public static ArrayList <Member> memArr= new ArrayList<>();
    public void userInterface() {

    }
    public void testingMethod(){
<<<<<<< HEAD
        manageMem.addMem("Herl", 940124, 666);
        manageMem.addMem("Carlos", 941217, 667);
        manageMem.iteration();
        manageMem.removeMem(manageMem.getMemById(666));
        manageMem.iteration();

        //System.out.println(manageMem.getMemById(1336).name);
=======
        manageMem.addMem("Anton", 951001, 666);
        manageMem.addMem("Herl", 940124, 69);
        System.out.println(manageMem.getMemByName("Herl"));
>>>>>>> 4b889af5db35d1e741af55a96f98b40901c020e6

    }
}

