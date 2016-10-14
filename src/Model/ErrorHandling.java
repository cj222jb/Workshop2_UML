package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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













    public boolean checkPersonalNum(Long personalNum){
        String temp = personalNum.toString();
        System.out.println(temp);
        Pattern p = Pattern.compile("[^0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(temp);
        boolean status = m.find();

        return status;
    }

}
