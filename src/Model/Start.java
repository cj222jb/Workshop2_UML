package Model;


import View.Console;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Start {


    static Console c = new Console();
    public static ManageMember manageMem = new ManageMember();
    public static void main(String[] args) throws IOException {


        File files = new File("Files");
        if (files.exists() && files.isDirectory() && files.list().length>0) {
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
                  //  System.out.println(temp[0]);
                    FileReader input = new FileReader(temp[j]);
                    BufferedReader buf = new BufferedReader(input);
                    String myLine = null;

                    while ((myLine = buf.readLine()) != null) {
                        String[] array1 = myLine.split(">");
                            if (j == temp.length - 1) {
                                //System.out.println(array1[0]);
                                manageMem.addMem(array1[2], Integer.parseInt(array1[1]),array1[0]);
                            } else {manageMem.memArray.get(i).addBoat(array1[0], Integer.parseInt(array1[1]),true);}

                        }
                        buf.close();
                        input.close();
                    }

                }

            }
        }
    }






