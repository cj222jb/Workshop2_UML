package View;


import Model.Member;
import Model.ManageMember;

import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    public static ManageMember manageMem = new ManageMember();
    public static Member member = new Member();

    public void testingMethod() {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your Member ID");
            int memberID = scan.nextInt();
            Member theMember = manageMem.getMemById(memberID);
            if (manageMem.containsMem(theMember)) {

                System.out.println("To add boat press a\n"+
                        "To change boat press c\n"+
                        "To remove boat press r\n"+
                        "To change member press m\n"+
                        "To remove member press n\n"+
                        "To print verbose list press v\n"+
                        "To print compact list c\n");
                String choice =scan.nextLine();

                if(choice=="a"){
                    System.out.println("Enter boat model : \n");
                    String model =scan.nextLine();
                    System.out.println("Enter boat length : \n");
                    int length = scan.nextInt();
                    manageMem.getMemById(memberID).addBoat(model,length);

                }else if(choice=="c"){
                    member.iterateBoat();
                    System.out.println("Enter the new information about your boat!\n");
                    System.out.println("Enter boat model : \n");
                    String model =scan.nextLine();
                    System.out.println("Enter boat length : \n");
                    int length = scan.nextInt();
                    manageMem.getMemById(memberID).changeBoat( member.getBoatByIndex(),model,length);

                }
                else if(choice=="r"){

                }
                else if(choice=="m"){

                }
                else if(choice=="n"){

                }
                else if(choice=="v"){
                    verboseList(manageMem.getMemById(memberID));
                }
                else if(choice=="c"){
                    compactList(manageMem.getMemById(memberID));
                }


            } else {
                //Member doesnt exist -> add new member
                System.out.println("Your not a  member !\n");
                System.out.println("Enter your name\n");
                String nameNew = scan.next();
                System.out.println("Enter your social security number\n");
                int SSRNew = scan.nextInt();
                System.out.println("Enter a memberID\n");
                int memberIDNew = scan.nextInt();
                manageMem.addMem(nameNew, SSRNew, memberIDNew);
            }
        }
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

