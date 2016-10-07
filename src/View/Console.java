package View;


import Model.Member;
import Model.ManageMember;
/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    public static ManageMember manageMem = new ManageMember();
    public static Member member = new Member();

    public void testingMethod() {

        manageMem.addMem("Herl", 940124, 666);
        manageMem.addMem("Carlos", 941217, 667);
        manageMem.iteration();
        manageMem.removeMem(manageMem.getMemByName("Herl"));
        manageMem.iteration();

       manageMem.getMemById(666).addBoat("Eka",23);
                
    }
}

