package Model;

import java.io.*;
import java.io.File;
import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Log {


    public void logboat(Boat boat, int id) {
        int nr = 1;
        String mapID = ""+id;
        String filename = mapID+"\\"+"Boat_"+nr+".txt";
        BufferedWriter writer = null;
        File f = new File(filename);

        while (f.exists()) {
            nr++;
            filename = mapID+"\\"+"Boat_"+nr+".txt";
            f = new File(filename);
        }
        try {

            File file = new File(filename);
            writer = new BufferedWriter(new FileWriter(file));
            writer.write("Boat ID: " + boat.id);
            writer.newLine();
            writer.write("Boat Length: : " + boat.length);
            writer.newLine();
            writer.write("Boat Model: : " + boat.model);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



    public void logMem(Member mem, int id) {

        String mapID = ""+id;
        File map = new File(mapID);
        map.mkdir();

        String filename = mapID+"\\"+"Member.txt";
        BufferedWriter writer = null;

        try {

            File file = new File(filename);
            writer = new BufferedWriter(new FileWriter(file));
            writer.write("Member ID: " + mem.memberID);
            writer.newLine();
            writer.write("Member Personal Number: " + mem.personalNum);
            writer.newLine();
            writer.write("Member Name: " + mem.name);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    public boolean removeBoat(int boatID) {

        boolean rem = false;
        File file = null;
        file = new File("Boat_" + boatID + ".txt");

        rem = file.delete();


        return rem;
    }

    public boolean removeMember(int memID) {

        boolean remov = false;
        File file = null;
        file = new File("Member_" + memID + ".txt");

        remov = file.delete();


        return remov;


    }

    public String getMem(int memberID){
        String fileContent ="";
        try (Scanner scan = new Scanner(new FileReader("Member_"+memberID))) {
            while(scan.hasNextLine()) {
                fileContent = scan.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return fileContent;
    }

}
