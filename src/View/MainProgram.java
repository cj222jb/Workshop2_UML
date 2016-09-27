package View;
import Model.Boat;
import Model.Member;

public class MainProgram {
    static Member mem = new Member();
    static Boat b = new Boat();
    static Console console = new Console();

    public static void main(String[] args){

        mem.addMem("Lindmark", 951001, 12);
        console.changeMem(12);



        System.out.println(mem.getMem(12).personalNum);
        System.out.println(mem.getMem(12).name);
    }
}
