package View;
import Model.Boat;
import Model.Member;

public class MainProgram {
    static Member mem = new Member();
    static Boat b = new Boat();

    public static void main(String[] args){
<<<<<<< HEAD
        mem.addMem("Lindmark", 951001, 0);

=======
        mem.addMem("Lindmark", 951001, 45);
        b.addBoat("Motorbåt",1,54);
>>>>>>> 2cf4ee598d063dd803f1bb598c52f5ffa9f8750c
        System.out.println(mem.getMem(0).personalNum);
        System.out.println(b.getBoat(0).model);
    }
}
