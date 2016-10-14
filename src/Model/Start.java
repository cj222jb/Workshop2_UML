package Model;


import View.Console;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Start {
    static Console c = new Console();
    public static ManageMember manageMem = new ManageMember();
public static void loadFromFiles() throws IOException {

    File files = new File("Files");
        if(files.exists()&&files.isDirectory()&&files.list().length>0)

    {
        loadLog();
    }else

    {
        files.mkdir();
    }

}

    public static void loadLog() throws IOException {
        File path = new File("Files");
        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                File[] temp = files[i].listFiles();

                //Load Members
                for (int j = temp.length - 1; j >= 0; j--) {
                    FileReader input = new FileReader(temp[j]);
                    BufferedReader buf = new BufferedReader(input);
                    String myLine;

                    while ((myLine = buf.readLine()) != null) {
                        String[] array1 = myLine.split(">");
                            if (j == temp.length - 1) {
                                manageMem.addMem(array1[2], Long.parseLong(array1[1]),array1[0]);
                            } else {manageMem.memArray.get(i).addBoat(array1[0], Double.parseDouble(array1[1]),true);}

                        }
                        buf.close();
                        input.close();
                    }

                }

            }
        }
        public static ManageMember getObject(){
            return manageMem;
        }
    }




