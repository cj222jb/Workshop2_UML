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

    public void testingMethod(){
        manageMem.iteration();
        manageMem.getMemById(666).addBoat("Kukhår", 20);

    }
}

