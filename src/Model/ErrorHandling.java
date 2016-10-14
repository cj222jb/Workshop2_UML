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

    public boolean isName(String name){
        if(name.length()==0){
            return false;
        }

        Pattern p = Pattern.compile("[^a-zA-Z ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(name);
        boolean b = m.find();
        if (b==true){
            return false;
        }
        return true;
    }
}
