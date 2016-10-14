package Model;

import java.io.*;

/**
 * Created by carl on 2016-09-20.
 */
public class Log {

    public void logboat(Boat boat, String memID) {
        int nr = boat.nr;
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
            writer.write(boat.model+">"+boat.length);

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
    public void logMem(Member mem) {
        String mapID = "Files\\"+mem.uniqueId;
        File map = new File(mapID);
        map.mkdir();

        String filename = mapID+"\\"+"Member.txt";
        BufferedWriter writer = null;

        try {

            File file = new File(filename);
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(mem.uniqueId + ">"+ mem.personalNum + ">" + mem.name);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public boolean removeBoat(Boat boat,String memID) {

        int boatID = boat.nr;
        String mapID = "Files\\" +memID+"\\"+"Boat_"+boatID+".txt";
        boolean remov = false;
        File file = new File(mapID);

        remov = file.delete();


        return remov;
    }
    public void removeMember(String memID) {
        String mapID = "Files\\" + memID;
        File file = new File(mapID);
        File[] entries = file.listFiles();

        for(int i=0;i<entries.length;i++){
            File currentFile = new File(entries[i].getAbsolutePath());
            currentFile.delete();
        }
        file.delete();
    }
    public void changeMem(String name , int num,String id){

        BufferedWriter writer = null;
        String mapID = "Files\\"+id;
        String filename = mapID+"\\"+"Member.txt";
        File file = new File(filename);

        file.delete();

        File file2 = new File(filename);
        try {
            writer = new BufferedWriter(new FileWriter(file2));

            writer.write(id+ ">"+num+ ">" +name);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void changeBoat(Boat boat, String memID,int newLength, String newModel){

        BufferedWriter writer = null;
        int boatID = boat.nr;
        String mapID = "Files\\"+memID;
        String filename = mapID+"\\"+"Boat_"+boatID+".txt";
        File file = new File(filename);

        file.delete();

        File file2 = new File(filename);
        try {
            writer = new BufferedWriter(new FileWriter(file2));

            writer.write(newModel+">"+newLength);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

