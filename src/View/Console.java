package View;


import Model.Boat;
import Model.Member;
import Model.ManageMember;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    static ManageMember manageMem = new ManageMember();
    static Member member = new Member();
    ArrayList<Member> memArray = new ArrayList<>();
    ArrayList<Boat> BoatArray = new ArrayList<>();

    public void testingMethod() {

        System.out.println();
        manageMem.addMem("Anton", 19995, 01);
        manageMem.addMem("Carl", 193333, 02);
        member.addBoat("Eka",23);

        memArray=manageMem.returnList();
        memArray.get(0).addBoat("Salbot",12);
       // BoatArray=member.returnBList();

        for (int i = 0; i <memArray.size() ; i++) {

            System.out.println(memArray.get(i).getName());
            System.out.println(memArray.get(i).getUniqueId());
            System.out.println("Number of boats: "+BoatArray.size());
            System.out.println("If you want to change this member please press "+i+"\n");

        }
        Scanner temp = new Scanner(System.in);
        int hue = temp.nextInt();
        System.out.println(memArray.get(hue).returnBList().size());


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
}
