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

        while(true) { // to try endlessly
            Scanner scanner = new Scanner(System.in);

            System.out.println("If you want to add a boat press b , " + "\n" + " if you want to add register yourself as a new member press m,"+ "\n"+"" +
                    " if you want to print a specific member or boat," +
                    " press p" + "\n" + "if you want to change a member , press c ");
            String choice = scanner.nextLine();

            if (choice.equals("b")) {
                System.out.print("Enter Boat type:\t");
                String boattype = scanner.nextLine();

                System.out.println("Enter length of boat in meters");
                int boatlength = scanner.nextInt();

                System.out.println("Enter ID of boat");
                int boatID = scanner.nextInt();

                b.addBoat(boattype, boatlength, boatID);
            } else if (choice.equals("m")) {
                System.out.println(choice);
                System.out.println("Enter members name");
                String name = scanner.nextLine();

                System.out.println("Enter personal number");
                int pnumber = scanner.nextInt();
                System.out.println("Enter ID of member");
                int memberID = scanner.nextInt();

                mem.addMem(name, pnumber, memberID);
            } else if (choice.equals("p")) {
                printInfo();
            }
            else if(choice.equals("c")){

                System.out.println("b for boat, m for member: ");
                Scanner scan1 = new Scanner(System.in);
                String choice2=scan1.nextLine();

                if(choice2.equals("b")) {
                    System.out.println("Enter boat id : ");
                    Scanner scan = new Scanner(System.in);
                    int id = scan.nextInt();
                    changeBoat(id);
                }
                else if(choice2.equals("m")){

                    System.out.println("Enter member id : ");
                    Scanner scan = new Scanner(System.in);
                    int id = scan.nextInt();
                    changeMem(id);
                }

            }
        }
    }

    public static void changeMem(int memberID) {
        System.out.println("Change information about member");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your personal number:");
        int personalNum = scan.nextInt();
        mem.changeMem(name, personalNum, memberID); //Sends to model method changeMem
    }
    public static void changeBoat(int boatID) {
        System.out.println("Change information about boat");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your boattype:");
        System.out.println();
        String boattype = scan.nextLine();
        System.out.println("Enter your boat length:");
        int boatlength = scan.nextInt();
        mem.changeMem(boattype, boatlength, boatID); //Sends to model method changeMem
    }


    public static void printInfo(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("If you want to print a boat press b , for member press m");
        String choice1 = scanner1.nextLine();

        if(choice1.equals("b")) {
            System.out.println("Enter your BoatID");
            int printID = scanner1.nextInt();
            System.out.println("Boat type: "+ b.getBoat(printID).model +" Boat Length : " +b.getBoat(printID).length +
                    "Boat id : "+ b.getBoat(printID).id);
            System.out.println("hej");
        }
        else if(choice1.equals("m")){
            System.out.println("Enter your MemberID");
            int printID2 = scanner1.nextInt();
            System.out.println("Member ID: "+ mem.getMem(printID2).memberID +" Member name : " +mem.getMem(printID2).name +
                    " Member Personal Number : "+ mem.getMem(printID2).personalNum);
        }
    }

}
