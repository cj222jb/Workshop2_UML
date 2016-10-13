package View;
import Model.Boat;
import Model.Member;
import Model.ManageMember;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by carl on 2016-09-20.
 */
public class Console {
    static ManageMember manageMem = new ManageMember();
    static Member member = new Member();
    ArrayList<Member> memArray = new ArrayList<>();
    ArrayList<Boat> boatArray = new ArrayList<>();

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
    //Method not done
    public void compactList(){
        memArray=manageMem.returnList();

        for (int i = 0; i <memArray.size() ; i++) {
            boatArray = memArray.get(i).returnBList();
            System.out.println("Name : "+memArray.get(i).getName());
            System.out.println("Unique ID: "+memArray.get(i).getUniqueId());
            System.out.println("Number of boats: "+boatArray.size());
            System.out.println("If you want to change this member please press "+i+"\n");
        }
    }

    //Method not done
    public void verboseList(){
        memArray=manageMem.returnList();

        for (int i = 0; i <memArray.size() ; i++) {
            boatArray = memArray.get(i).returnBList();
            System.out.println("Name : "+memArray.get(i).getName());
            System.out.println("Personal Security Number : "+memArray.get(i).getPersonNr());
            System.out.println("Members Unique ID: "+memArray.get(i).getUniqueId());
            System.out.println("Current Index of this member :  "+(i));

            for (int j = 0; j < boatArray.size() ; j++) {
                System.out.println("Boat nr "+ j);
                System.out.println(boatArray.get(j).getType());
                System.out.println(boatArray.get(j).getLength());
            }
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
            int length = scan.nextInt();

            memArray.get(mIndex).changeBoat(boatArray.get(index),type,length);
        }
        else if(userChoice==2){
            memArray.get(mIndex).removeBoat(boatArray.get(index));
        }
    }

    public void memberInfo(int index){

        Scanner scan = new Scanner(System.in);
        System.out.println("To change memberinfo press 1 ");
        System.out.println("To delete member press 2 ");
        int userChoice = scan.nextInt();

        if (userChoice==1){
            System.out.println("Enter members name : ");
            String name = scan.next();

            System.out.println("Enter members personal nr : ");
            int persNr = scan.nextInt();

            manageMem.changeMem(memArray.get(index),name,persNr);
        }

        else if(userChoice==2){
            manageMem.removeMem(memArray.get(index));
        }
    }

    public void createMem(){
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter members name : \n");
        String name = scan1.next();

        System.out.println("Enter members personal nr : \n");
        int persNr = scan1.nextInt();

        manageMem.addMem(name, persNr,"");
    }
    public void selectOrEmpty(){
        Scanner scan = new Scanner(System.in);
        if(memArray.size()==0){
            System.out.println("There is no members yet \n");
        }else{
            System.out.println("\nIf you want to handle the member please enter the index of the member \n" +
                    "If you want to return to the main menu press 99");
            int mIndex = scan.nextInt();
            if(mIndex==99){
//returns to main menu
            }
            else{
                System.out.println("If you want to handle memberinfo press 1 \n" +
                        "if you want to handle boatinfo press 2 \n"+
                        "if you want to add a boat press 3 \n"+
                        "if you want to print member info press 4 \n");
                int choiceToDo=scan.nextInt();
                if ((choiceToDo)==1){
                    memberInfo(mIndex);
                }
                else if(choiceToDo==2){
                    if(memArray.get(mIndex).containsBoat()==true){
                        System.out.println("Choose which boat you want to handle by entering its index ! ");
                        int boatIndex=scan.nextInt();
                        boatInfo(boatIndex,mIndex);
                    }
                    else if(memArray.get(mIndex).containsBoat()==false){
                        // No boat yet entered
                        boatInfo(0,mIndex);
                    }
                    else{
                        System.out.println("hej2");
                    }

                }
                else if(choiceToDo==3){
                    System.out.println("Enter boat type : \n");
                    String boatType = scan.next();

                    System.out.println("Enter boat length : \n");
                    int boatLength = scan.nextInt();

                    memArray.get(mIndex).addBoat(boatType,boatLength,false);

                }
                else if(choiceToDo==4){
                    memArray=manageMem.returnList();
                    boatArray = memArray.get(mIndex).returnBList();
                    System.out.println("Memberinfo and its boat/boats : \n");

                    System.out.println("Name : "+memArray.get(mIndex).getName());
                    System.out.println("Personal Security Number : "+memArray.get(mIndex).getPersonNr());
                    System.out.println("Members Unique ID: \n"+memArray.get(mIndex).getUniqueId());

                    if(boatArray.size()>0){
                        for (int j = 0; j < boatArray.size() ; j++) {
                            System.out.println("Boat type : "+boatArray.get(j).getType());
                            System.out.println("Boat length : \n"+boatArray.get(j).getLength());
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
