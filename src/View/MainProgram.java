package View;

import Model.Member;
import java.io.*;

public class MainProgram {
    static Console c = new Console();

    public static void main(String[] args) throws IOException {

        File files = new File("Files");
        if (files.exists() && files.isDirectory()) {
            loadLog();
        }else{
            files.mkdir();
        }

        c.testingMethod();
    }
    static public void loadLog() throws IOException {
        File path = new File("Files");
        File [] files = path.listFiles();

        for (int i=0;i< files.length;i++){
            if (files[i].isDirectory()){
                File [] temp = files[i].listFiles();

                //Load Members
                for (int j=0;j<temp.length;j++) {
                    System.out.println(temp[0]);
                    FileReader input = new FileReader(temp[j]);
                    BufferedReader buf = new BufferedReader(input);
                    String myLine = null;

                    while ( (myLine = buf.readLine()) != null){
                        String [] array1 = myLine.split("-");
                        for (int k = 0; k < array1.length; k++) {

                            c.memArr.add(new Member(array1[2], Integer.parseInt(array1[1]), Integer.parseInt(array1[0])));
                            //add member (array1[0] = id   array1[1] = personalnumber   array1[2] = Name
                        }
                    }
                }
                //Loads Boats
                for (int h=1;h<temp.length;h++) {
                    System.out.println(temp[h]);
                    FileReader input = new FileReader(temp[h]);
                    BufferedReader buf = new BufferedReader(input);
                    String myLine = null;

                    while ( (myLine = buf.readLine()) != null){
                        String [] array2 = myLine.split("-");
                        for (int k = 0; k < array2.length; k++) {

                            //add boat (array2[0] = id   array2[1] = length   array2[2] = model
                        }
                    }
                }
            }
        }
    }
}




