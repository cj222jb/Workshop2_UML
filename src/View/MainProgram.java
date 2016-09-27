package View;
import Model.Boat;
import Model.Log;
import Model.Member;

public class MainProgram {
    static Member mem = new Member();
    static Boat b = new Boat();
    static Log log = new Log();

    public static void main(String[] args){
        mem.addMem("Lindmark", 951001, 0);
        mem.addMem("Lindmark", 951001, 45);
        b.addBoat("Motorbåt",1,54);
        b.addBoat("Segelbåt",6,76);
        log.removeBoat(6);
        log.removeMember(45);
    }
}
