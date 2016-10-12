package View;


import Model.ManageMember;
import Model.Member;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    static ManageMember manageMem = new ManageMember();
    static Member member = new Member();
    ArrayList<Member> memArray = new ArrayList<>();
    String name;
    int personalNum;
    int memberID;
    int userChoice;

    public void testingMethod() {

        manageMem.addMem("Anton", 951001, 123);
        System.out.println();


        /*
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
=======
        manageMem.addMem("Anton", 19995, 01);
        manageMem.addMem("Carl", 193333, 02);
        memArray=manageMem.returnList();

        for (int i = 0; i <memArray.size() ; i++) {
            System.out.println(memArray.get(i).getName());
            System.out.println(memArray.get(i).getUniqueId());
            //
        }
>>>>>>> 7d5ee6fadd686e39bdf51329f18c70bcbb278c90


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
*/}
}
