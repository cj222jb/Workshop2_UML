package View;
import Model.Boat;
import Model.ErrorHandling;
import Model.Start;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    Start start = new Start();
    ArrayList<Boat> boatArray = new ArrayList<>();
    ErrorHandling err = new ErrorHandling();

    public void testingMethod() {
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
        }
    }
    public void compactList(){

        for (int i = 0; i < start.getObject().returnList().size() ; i++) {
            boatArray = start.getObject().returnList().get(i).returnBList();
            System.out.println("Name : "+start.getObject().returnList().get(i).getName());
            System.out.println("Unique ID: "+start.getObject().returnList().get(i).getUniqueId());
            System.out.println("Number of boats: "+boatArray.size());
            System.out.println("If you want to change this member please press "+i);
            System.out.println("Current Index of this member :  "+(i)+"\n");
        }
    }

    public void verboseList(){

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

    public void boatInfo(int index,int mIndex){
        Scanner scan = new Scanner(System.in);
        System.out.println("To change a boat press 1 ");
        System.out.println("To remove a boat press 2 ");
        int userChoice = scan.nextInt();

        if(userChoice==1){
            System.out.println("Enter boat type : \n");
            String type = scan.next();

            System.out.println("Enter boat length : \n");
            double length = scan.nextDouble();

            start.getObject().returnList().get(mIndex).changeBoat(boatArray.get(index),type,length);
        }
        else if(userChoice==2){
            start.getObject().returnList().get(mIndex).removeBoat(boatArray.get(index));
        }
    }

    public void memberInfo(int index){
        Scanner scan = new Scanner(System.in);
        System.out.println("To change memberinfo press 1 ");
        System.out.println("To delete member press 2 ");
        int userChoice = scan.nextInt();
        scan.nextLine();

        if (userChoice==1){
            System.out.println("Enter members name : ");
            String name = scan.nextLine();
            System.out.println("Enter members personal nr : ");
            Long persNr = scan.nextLong();
            start.getObject().changeMem(start.getObject().returnList().get(index),name,persNr);
        }

        else if(userChoice==2){
            start.getObject().removeMem(start.getObject().returnList().get(index));
        }
    }

    public void createMem(){
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter members name : ");
        String name = scan1.nextLine();

        System.out.println("Enter members personal nr : ");
        long persNr = scan1.nextLong();

        start.getObject().addMem(name, persNr, "");
    }
    public void selectOrEmpty(){
        Scanner scan = new Scanner(System.in);
        if(start.getObject().returnList().size()==0){
            System.out.println("There is no members yet \n");
        }
        else{
            System.out.println("\nIf you want to handle the member please enter the index of the member \n" +
                    "If you want to return to the main menu press 99");
            int mIndex = scan.nextInt();
            if(mIndex==99){
//returns to main menu
            }
            else if(mIndex>start.getObject().returnList().size()){
                System.out.println("There is no member on place "+mIndex);
            }

            else{
                System.out.println("If you want to handle memberinfo press 1 \n" +
                        "if you want to handle boatinfo press 2 \n"+
                        "if you want to add a boat press 3 \n"+
                        "if you want to print member info press 4 \n");
                int choiceToDo=scan.nextInt();
                scan.nextLine();
                if ((choiceToDo)==1){
                    memberInfo(mIndex);
                }
                else if(choiceToDo==2){
                    if(start.getObject().returnList().get(mIndex).containsBoat()==true){
                        for (int j = 0; j < boatArray.size() ; j++) {
                            System.out.println("Boat index : "+ j);
                            System.out.println("Boat model : "+boatArray.get(j).getType());
                            System.out.println("Boat length : "+boatArray.get(j).getLength()+"\n");
                        }
                        System.out.println("\n");
                        System.out.println("Choose which boat you want to handle by entering its index ! ");
                        int boatIndex=scan.nextInt();
                        boatInfo(boatIndex,mIndex);
                    }
                    else if(start.getObject().returnList().get(mIndex).containsBoat()==false){
                        // No boat yet entered
                        boatInfo(0,mIndex);
                    }
                }
                else if(choiceToDo==3){
                    System.out.println("Enter boat type : ");
                    String boatType = scan.nextLine();
                    System.out.println("Enter boat length : ");
                    double boatLength = scan.nextDouble();
                    start.getObject().returnList().get(mIndex).addBoat(boatType,boatLength,false);

                }
                else if(choiceToDo==4){
                    boatArray = start.getObject().returnList().get(mIndex).returnBList();
                    System.out.println("Memberinfo and its boat/boats : \n");
                    System.out.println("Name : "+start.getObject().returnList().get(mIndex).getName());
                    System.out.println("Personal Security Number : "+start.getObject().returnList().get(mIndex).getPersonNr());
                    System.out.println("Members Unique ID: "+start.getObject().returnList().get(mIndex).getUniqueId()+"\n");

                    if(boatArray.size()>0){
                        for (int j = 0; j < boatArray.size() ; j++) {
                            System.out.println("Boat type : "+boatArray.get(j).getType());
                            System.out.println("Boat length : "+boatArray.get(j).getLength()+"\n");
                        }
                    }
                    else {
                        System.out.println("User doesnt have any boats yet\n");
                    }
                }
            }
        }
    }
}
