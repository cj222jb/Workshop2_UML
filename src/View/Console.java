package View;


import Model.Member;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    public static ArrayList <Member> memArr= new ArrayList<>();
    public void userInterface(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome ! \n" +
                "If you want to handle members press m \n" +
                "if you want to handle boats press b\n" +
                "if you want to print stuff press p\n");
        String choice = scan.nextLine();
        if(choice=="m"){
            //deal with member
            System.out.println("If you want to add new member press a \n" +
                    "if you want to change a member press c\n" +
                    "if you want to remove a member press r\n");
            if (scan.nextLine()=="a"){
                //Add member
                System.out.println("Enter name of member: \n");
                String memberName=scan.nextLine();

                System.out.println("Enter Social Security Number \n");
                int ssr =scan.nextInt();

                System.out.println("Enter Member ID \n");
                int memid =scan.nextInt();

                Member memberM = new Member(memberName,ssr,memid);
                memArr.add(memberM);
            }
            else if(scan.nextLine()=="c"){
                //Change Member
            }
            else if(scan.nextLine()=="r"){
               //Remove member
            }
        }
        else if(choice=="b"){
            // Deal with boats
        }
        else if(choice=="p"){
            System.out.println("Plats 0 namn : \n"+memArr.get(0).name);
            System.out.println("Plats 0 persnr : \n"+memArr.get(0).personalNum);
            System.out.println("Plats 0 memID : \n"+memArr.get(0).memberID);
        }





     /*   System.out.println("Enter Model of the boat : "+"\t");
        String model = scan.nextLine();
        System.out.println("Enter length of the boat : "+"\t");
        int length = scan.nextInt();
        memberName.addBoat(model,length);
        for (int i = 0; i < memberName.getBoat().length ; i++) {
            if(memberName.getBoat()[i]==null){
                break;
            }
            System.out.println(memberName.getBoat()[i].model);
        }*/
    }
}

