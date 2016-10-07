package View;


import Model.ManageMember;
import Model.Member;

import java.util.ArrayList;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    public static ManageMember manageMem = new ManageMember();
    public static ArrayList <Member> memArr= new ArrayList<>();

    public void testingMethod(){

        manageMem.iteration();
      //  manageMem.getMemById(666).addBoat("Kukhår", 20);
        System.out.println("------");
      //  manageMem.removeMem(manageMem.getMemById(1));
        manageMem.iteration();
    }
}

