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
String memberName="";

    public void testingMethod(){
        manageMem.addMem("Anton", 951001, 666);
        manageMem.addMem("Herl", 940124, 69);
        System.out.println(manageMem.getMemByName("Herl"));

    }
}

