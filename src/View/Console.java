package View;

import Model.Boat;
import Model.Member;

import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {

    static Boat b = new Boat();
    static Member mem = new Member();

    public static void userInterfaceBoat(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("If you want to add a boat press b , if you want to add register yourself press r, if you want to print a specific member or boat, press any key");
        String choice = scanner.nextLine();

        if(choice.equals("b")){
            System.out.print("Enter Boat type:\t");
            String boattype = scanner.nextLine();

            System.out.println("Enter length of boat in meters");
            int boatlength = scanner.nextInt();

            System.out.println("Enter ID of boat");
            int boatID = scanner.nextInt();

            b.addBoat(boattype,boatlength,boatID);
        }
        else if(choice.equals("m")){
            System.out.println(choice);
            System.out.println("Enter members name");
            String name = scanner.nextLine();

            System.out.println("Enter personal number");
            int pnumber = scanner.nextInt();

            System.out.println("Enter ID of member");
            int memberID = scanner.nextInt();

            mem.addMem(name, pnumber, memberID);
        }
            printInfo();
    }

    public static void printInfo(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter ID of member/boat");
        int printID = scanner1.nextInt();


        // add if statement to declare if boat or member print

        System.out.println("Member ID: "+ mem.getMem(printID).memberID +" Member name : " +mem.getMem(printID).name +
                "Member Personal Number : "+ mem.getMem(printID).personalNum);

        System.out.println("Boat type: "+ b.getBoat(printID).model +" Boat Length : " +b.getBoat(printID).length +
                "Boat id : "+ b.getBoat(printID).id);

    }

}
