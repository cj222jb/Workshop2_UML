package View;
import Model.Member;

public class MainProgram {
    static Member mem = new Member();

    public static void main(String[] args){
        mem.addMem("Lindmark", 951001, 1);

        System.out.println(mem.getMem(0).personalNum);
    }
}
