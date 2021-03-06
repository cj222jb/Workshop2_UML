package View;
import Model.Boat;
import Model.Start;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by carl on 2016-09-20.
 */

public class Console {
    static Start start = new Start();
    static ArrayList<Boat> boatArray = new ArrayList<>();

    public static void main(String[] args) throws IOException {
    start.loadFromFiles();
        startOfConsole();
    }
    public static void startOfConsole() {
        while(true){
            System.out.println("For Verbose List press v\n" +
                    "For Compact List press c\n" +
                    "Add a new member press m ");
            Scanner scan = new Scanner(System.in);
            String userChoice = scan.next();
            if (userChoice.equals("v")){
                System.out.println("The Verbose list\n");
                verboseList();
                selectOrEmpty();
            }
            else if(userChoice.equals("c")){
                System.out.println("The Compact list\n");
                compactList();
                selectOrEmpty();
            }
            else if(userChoice.equals("m")){
                createMem();
            }
            else{
                System.err.println("Choose one of the valid options");
            }
        }
    }
    public static void compactList(){

        for (int i = 0; i < start.getObject().returnList().size() ; i++) {
            boatArray = start.getObject().returnList().get(i).returnBList();
            System.out.println("Name : "+start.getObject().returnList().get(i).getName());
            System.out.println("Unique ID: "+start.getObject().returnList().get(i).getUniqueId());
            System.out.println("Number of boats: "+boatArray.size());
            System.out.println("If you want to change this member please press "+i);
            System.out.println("Current Index of this member :  "+(i)+"\n");
        }
    }
    public static void verboseList(){

        for (int i = 0; i <start.getObject().returnList().size() ; i++) {
            boatArray = start.getObject().returnList().get(i).returnBList();
            System.out.println("Name : "+start.getObject().returnList().get(i).getName());
            System.out.println("Personal Security Number : "+start.getObject().returnList().get(i).getPersonNr());
            System.out.println("Members Unique ID: "+start.getObject().returnList().get(i).getUniqueId());
            System.out.println("Current Index of this member :  "+(i)+"\n");

            for (int j = 0; j < boatArray.size() ; j++) {
                System.out.println("Boat index : "+ j);
                System.out.println("Boat model : "+boatArray.get(j).getType());
                System.out.println("Boat length : "+boatArray.get(j).getLength()+"\n");
            }
            System.out.println("\n");
        }
    }

    public static void boatInfo(int index,int mIndex){
        boolean status = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("To change a boat press 1 ");
        System.out.println("To remove a boat press 2 ");
        int userChoice = scan.nextInt();
        if(userChoice==1){
            System.out.println("Enter boat type : \n");
            String type = scan.next();
            System.out.println("Enter boat length : \n");
            double length = 0;
            try{
                length = scan.nextDouble();
            }catch(InputMismatchException e){
                System.err.println("Incorrect format of length");
                status = false;
                boatInfo(index, mIndex);
            }

            if(status)
                start.getObject().returnList().get(mIndex).changeBoat(boatArray.get(index),type,length);
        }
        else if(userChoice==2){
            start.getObject().returnList().get(mIndex).removeBoat(boatArray.get(index));
        }
    }

    public static void memberInfo(int index){
        Scanner scan = new Scanner(System.in);
        System.out.println("To change memberinfo press 1 ");
        System.out.println("To delete member press 2 ");
        int userChoice = scan.nextInt();
        scan.nextLine();

        if (userChoice==1){
            System.out.println("Enter members name : ");
            String name = scan.nextLine();
            System.out.println("Enter members personal nr with numbers only : ");
            Long persNr = scan.nextLong();
            start.getObject().changeMem(start.getObject().returnList().get(index),name,persNr);
        }

        else if(userChoice==2){
            start.getObject().removeMem(start.getObject().returnList().get(index));
        }
    }
    public static void createMem() {

        Scanner scan1 = new Scanner(System.in);
        boolean status = true;
        System.out.println("Enter members name  : ");
        String name = scan1.nextLine();
        if (isName(name) == false) {
            System.err.println("Members name cant contain number or special characters , " +
                    "\nneither can it be empty!\n" +
                    "Please enter again\n");
            createMem();
        } else {
            System.out.println("Enter members personal nr with numbers only : ");
            long persNr = 0;
            try {
                persNr = scan1.nextLong();
            } catch (InputMismatchException e) {
                System.err.println("Incorrect format");
                status = false;
                createMem();
            }
            if(status)
                start.getObject().addMem(name, persNr, "");
        }
    }

    public static void selectOrEmpty() {
        Scanner scan = new Scanner(System.in);
        if (start.getObject().returnList().size() == 0) {
            System.out.println("There is no members yet \n");
        } else {
            System.out.println("\nIf you want to handle the member,\nplease enter the index of the member \n" +
                    "If you want to return to the main menu press 99");
            int mIndex = scan.nextInt();
            if (mIndex == 99) {
//returns to main menu
            } else if (mIndex > start.getObject().returnList().size()) {
                System.out.println("There is no member on place " + mIndex + "\n");
            } else {
                System.out.println("If you want to handle memberinfo press 1 \n" +
                        "if you want to handle boatinfo press 2 \n" +
                        "if you want to add a boat press 3 \n" +
                        "if you want to print member info press 4 \n");
                int choiceToDo = scan.nextInt();
                scan.nextLine();
                if ((choiceToDo) == 1) {
                    memberInfo(mIndex);
                } else if (choiceToDo == 2) {
                    if (start.getObject().returnList().get(mIndex).containsBoat() == true) {
                        for (int j = 0; j < boatArray.size(); j++) {
                            System.out.println("Boat index : " + j);
                            System.out.println("Boat model : " + boatArray.get(j).getType());
                            System.out.println("Boat length : " + boatArray.get(j).getLength() + "\n");
                        }
                        System.out.println("\n");
                        System.out.println("Choose which boat you want to handle by entering its index ! ");
                        int boatIndex = scan.nextInt();
                        if(boatIndex+1>boatArray.size()){
                            System.err.println("There is no boat on index : "+boatIndex);
                        }else {
                            boatInfo(boatIndex, mIndex);
                        }
                    } else if (start.getObject().returnList().get(mIndex).containsBoat() == false) {
                        System.err.println("You dont have any boats yet");
                    }
                } else if (choiceToDo == 3) {
                    boolean status = true;
                    System.out.println("Enter boat type : ");
                    String boatType = scan.nextLine();
                    System.out.println("Enter boat length : ");
                    double boatLength = 0;
                    try {
                        boatLength = scan.nextDouble();
                    } catch (InputMismatchException e) {
                        System.err.println("Incorrect format of boat lenght");
                        status = false;

                        selectOrEmpty();
                    }

                    if(status)
                        start.getObject().returnList().get(mIndex).addBoat(boatType, boatLength, false);

                } else if (choiceToDo == 4) {
                    boatArray = start.getObject().returnList().get(mIndex).returnBList();
                    System.out.println("Memberinfo and its boat/boats : \n");
                    System.out.println("Name : " + start.getObject().returnList().get(mIndex).getName());
                    System.out.println("Personal Security Number : " + start.getObject().returnList().get(mIndex).getPersonNr());
                    System.out.println("Members Unique ID: " + start.getObject().returnList().get(mIndex).getUniqueId() + "\n");

                    if (boatArray.size() > 0) {
                        for (int j = 0; j < boatArray.size(); j++) {
                            System.out.println("Boat type : " + boatArray.get(j).getType());
                            System.out.println("Boat length : " + boatArray.get(j).getLength() + "\n");
                        }
                    } else {
                        System.out.println("User doesnt have any boats yet\n");
                    }
                }
            }
        }
    }
    public static boolean isName(String name){
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
