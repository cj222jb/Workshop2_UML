package Model;

import java.io.*;
import java.io.File;
import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Log {


    public void logboat(Boat boat, int memID) {
        int nr = 1;
        String mapID = ""+memID;
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


    public boolean removeBoat(int memID, int boatID) {


        String mapID = memID+"\\"+"Boat_"+boatID+".txt";
        boolean remov = false;
        File file = new File(mapID);

        remov = file.delete();


        return remov;
    }

    public void removeMember(int memID) {


        String mapID = ""+memID;
        File file = new File(mapID);

        String[]entries = file.list();
        for(String s: entries){
            File currentFile = new File(file.getPath(),s);
            currentFile.delete();
        }
        file.delete();
    }

    public String getMem(int memberID){
        String fileContent ="";
        try (Scanner scan = new Scanner(new FileReader(memberID+"\\"+"Member.txt"))) {
            while(scan.hasNextLine()) {
                fileContent = scan.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return fileContent;
    }



    public void changeMem(String name , int num, int id){

        BufferedWriter writer = null;
        String mapID = ""+id;
        String filename = mapID+"\\"+"Member.txt";
        File file = new File(filename);

        file.delete();

        File file2 = new File(filename);
        try {
            writer = new BufferedWriter(new FileWriter(file2));

            writer.write("Member ID: " + id);
            writer.newLine();
            writer.write("Member Personal Number: " + num);
            writer.newLine();
            writer.write("Member Name: " + name);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void changeBoat(int memID,String model , int length, int boatID){

        BufferedWriter writer = null;
        String mapID = ""+memID;
        String filename = mapID+"\\"+"Boat_"+boatID+".txt";
        File file = new File(filename);
        file.delete();


        File file2 = new File(filename);
        try {
            writer = new BufferedWriter(new FileWriter(file2));

            writer.write("Boat ID: " + boatID);
            writer.newLine();
            writer.write("Boat Length: : " + length);
            writer.newLine();
            writer.write("Boat Model: : " + model);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

