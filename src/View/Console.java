package View;


import Model.Member;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    public static ArrayList <Member> memArr= new ArrayList<>();
String memberName="";

    public void testingMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter member name s: "+"\t");
        memberName = scan.nextLine();

        Member memberName = new Member();

        System.out.println("Enter Model of the boat : "+"\t");
        String model = scan.nextLine();
        System.out.println("Enter length of the boat : "+"\t");
        int length = scan.nextInt();
        memberName.addBoat(model,length);
        for (int i = 0; i < memberName.getBoat().length ; i++) {
            if(memberName.getBoat()[i]==null){
                break;
            }
            System.out.println(memberName.getBoat()[i].model);
        }
    }
}

