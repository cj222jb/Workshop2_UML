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
    public static Member member = new Member();
    public void testingMethod() {

        manageMem.addMem("Herl", 940124, 666);
        manageMem.addMem("Carlos", 941217, 667);
        manageMem.iteration();
        manageMem.removeMem(manageMem.getMemByName("Herl"));
        manageMem.iteration();

        member.addBoat("Eka",10);
        member.addBoat("Segelbåt",25);
        member.removeBoat(member.getBoatByModel("Segelbåt"));
        member.iteration();

    }
}

