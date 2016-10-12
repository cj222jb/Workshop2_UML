package View;
import Model.Boat;
import Model.ManageMember;
import Model.Member;
import Model.Start;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    static ManageMember manageMem = Start.manageMem;
    static Member member = new Member();
    ArrayList<Member> memArray = new ArrayList<>();
    ArrayList<Boat> boatArray = new ArrayList<>();

    public void testingMethod() {

        System.out.println("If you want to print Verbose List press v\n" +
                "If you want to print Compact List press c\n" +
                "If you want to add a new member press m\n ");
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine();
        if (userChoice=="v"){
            //Prints verboselist + options
        }
        else if(userChoice=="c"){
            //Prints compactlist + options
        }
        else if(userChoice=="m"){
            //Options to add and change/delet member
        }
    }
    //Method not done
    public void compactList(){
        System.out.println();
        manageMem.addMem("Anton", 19995, "");
        manageMem.addMem("Carl", 193333, "");
        member.addBoat("Eka",23,false);

        memArray=manageMem.returnList();
        memArray.get(0).addBoat("Salbot",12,false);
        // BoatArray=member.returnBList();

        for (int i = 0; i <memArray.size() ; i++) {
            System.out.println(memArray.get(i).getName());
            System.out.println(memArray.get(i).getUniqueId());
            System.out.println("Number of boats: "+boatArray.size());
            System.out.println("If you want to change this member please press "+i+"\n");
        }
        Scanner temp = new Scanner(System.in);
        int hue = temp.nextInt();
        System.out.println(memArray.get(hue).returnBList().size());
    }

    //Method not done
    public void verboseList(){
        manageMem.addMem("Hall", 19995,"");
        manageMem.addMem("Daniel", 193333,"");

        memArray=manageMem.returnList();
        memArray.get(0).addBoat("Eka",45,false);
        for (int i = 0; i <memArray.size() ; i++) {
            boatArray = memArray.get(i).returnBList();
            System.out.println(memArray.get(i).getName());
            System.out.println(memArray.get(i).getPersonNr());
            System.out.println(memArray.get(i).getUniqueId());
            for (int j = 0; j < boatArray.size() ; j++) {
                System.out.println("Boat nr "+ j);
                System.out.println(boatArray.get(j).getType());
                System.out.println(boatArray.get(j).getLength());
            }
        }
    }
}
