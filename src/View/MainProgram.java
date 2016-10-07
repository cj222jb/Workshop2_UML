package View;

import Model.ManageMember;
import Model.Member;
import java.io.*;

public class MainProgram {
    static Console c = new Console();

    static ManageMember manageMem = new ManageMember();
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
        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                File[] temp = files[i].listFiles();

                //Load Members
                for (int j = temp.length - 1; j >= 0; j--) {
                    System.out.println(temp[0]);
                    FileReader input = new FileReader(temp[j]);
                    BufferedReader buf = new BufferedReader(input);
                    String myLine = null;

                    while ((myLine = buf.readLine()) != null) {
                        String[] array1 = myLine.split("-");
                        for (int k = 0; k < array1.length; k++) {
                            if (j == temp.length - 1) {
                                manageMem.addMem(array1[2], Integer.parseInt(array1[1]), Integer.parseInt(array1[0]));
                                //add member (array1[0] = id   array1[1] = personalnumber   array1[2] = Name
                            } else {}
                            }
                        }
                    }
                }

            }
        }
    }






