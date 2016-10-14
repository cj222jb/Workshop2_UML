package Model;

/**
 * Created by carl on 2016-09-27.
 */
public class ErrorHandling {
    Start start = new Start();

    public boolean personalNumErr(int personalNum){
        personalNum = String.valueOf(1000).length();
        if(personalNum < 6)
            return false;
        else return true;
    }

    public boolean memberDoesntExists(int index){

        if(start.getObject().returnList().get(index).equals(null)){
            System.out.println("ERROR");
            return true;
        }
        System.out.println("NO ERROR");
        return false;

    }

}
