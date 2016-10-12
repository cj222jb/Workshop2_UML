package Model;

import java.io.*;

/**
 * Created by carl on 2016-09-20.
 */
public class Log {


    public void logboat(Boat boat, int memID) {
        int nr = 1;
        String mapID = "Files\\"+memID;
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
            writer.write(boat.model+"-"+boat.length);

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

        String mapID = "Files\\"+id;
        File map = new File(mapID);
        map.mkdir();

        String filename = mapID+"\\"+"Member.txt";
        BufferedWriter writer = null;

        try {

            File file = new File(filename);
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(mem.memberID + "-"+ mem.personalNum + "-" + mem.name);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

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
        String mapID = "Files\\" + memID;
        File file = new File(mapID);
            File[] entries = file.listFiles();

        for(int i=0;i<entries.length;i++){
            File currentFile = new File(entries[i].getAbsolutePath());
            currentFile.delete();
             }
            file.delete();
    }



    public void changeMem(String name , int num, int id){

        BufferedWriter writer = null;
        String mapID = "Files\\"+id;
        String filename = mapID+"\\"+"Member.txt";
        File file = new File(filename);

        file.delete();

        File file2 = new File(filename);
        try {
            writer = new BufferedWriter(new FileWriter(file2));

            writer.write(id+ "-"+num+ "-" +name);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void changeBoat(Boat boat, int memID){

        BufferedWriter writer = null;
        String boatID = "";
        String mapID = "Files\\"+memID;
        String filename = mapID+"\\"+"Boat_"+boatID+".txt";
        File file = new File(filename);
        file.delete();


        File file2 = new File(filename);
        try {
            writer = new BufferedWriter(new FileWriter(file2));

            writer.write(boat.model+"-"+boat.length);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

