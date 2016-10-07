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
    public static ArrayList<Member> memArr = new ArrayList<>();

    public static Member member = new Member();

    public void testingMethod() {

        manageMem.addMem("Herl", 940124, 666);
        manageMem.addMem("Carlos", 941217, 667);
        manageMem.iteration();
        manageMem.removeMem(manageMem.getMemByName("Herl"));
        manageMem.iteration();

        manageMem.getMemById(666).addBoat("Eka", 18);
        member.removeBoat(member.getBoatByModel("Eka"));
        compactList(manageMem.getMemById(666));
        verboseList(manageMem.getMemById(666));

    }


    public void compactList(Member mem){
        System.out.println("Members name :"+mem.name);
        System.out.println("MemberID :"+mem.memberID);
        System.out.println("Members number of boats :"+mem.numberOfBoats());
    }

    public void verboseList(Member mem){
        System.out.println("Members name :"+mem.name);
        System.out.println("Members Personalnumber :"+mem.personalNum);
        System.out.println("MemberID :"+mem.memberID);
        mem.iterateBoat();
    }
}

