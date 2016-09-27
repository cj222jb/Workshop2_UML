package Model;

/**
 * Created by carl on 2016-09-27.
 */
public class ErrorHandling {

    public boolean personalNumErr(int personalNum){
        personalNum = String.valueOf(1000).length();
        if(personalNum < 6)
            return false;
        else return true;
    }

}
