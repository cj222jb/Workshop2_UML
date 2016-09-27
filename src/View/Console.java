package View;
import Model.Boat;
import Model.Member;

import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    static Member mem = new Member();













    public void changeMem(int memberID){
        System.out.println("Change information about member");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int personalNum = scan.nextInt();
        mem.changeMem(name, personalNum ,memberID); //Sends to model method changeMem

    }
}
