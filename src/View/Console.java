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
            String userChoice = scan.nextLine();
            if (userChoice.equals("v")){
                verboseList();
                selectOrEmpty();
            }
            else if(userChoice.equals("c")){
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
            System.out.println("\n"+memArray.get(i).getName());
            System.out.println(memArray.get(i).getUniqueId());
            System.out.println("Number of boats: "+boatArray.size());
            System.out.println("If you want to change this member please press "+i+"\n");
        }
    }

    //Method not done
    public void verboseList(){
        memArray=manageMem.returnList();

        for (int i = 0; i <memArray.size() ; i++) {
            boatArray = memArray.get(i).returnBList();

            System.out.println("\n"+memArray.get(i).getName());
            System.out.println(memArray.get(i).getPersonNr());
            System.out.println(memArray.get(i).getUniqueId());
            System.out.println("My Index is :  "+(i));

            for (int j = 0; j < boatArray.size() ; j++) {
                System.out.println("Boat nr "+ j);
                System.out.println(boatArray.get(j).getType());
                System.out.println(boatArray.get(j).getLength());
            }
        }
    }

    public void memberInfo(int index){
        Scanner scan = new Scanner(System.in);
        System.out.println("To change personal nr press 1 ");
        System.out.println("To change name press 2 ");
        System.out.println("To add a new boat press 3 ");
        int userChoice = scan.nextInt();
        if (userChoice==1){

        }
        else if(userChoice==2){

        }
        else if(userChoice==3){
            System.out.println("Enter boat type : \n");
            String boatType = scan.next();

            System.out.println("Enter boat length : \n");
            int boatLength = scan.nextInt();

            memArray.get(index).addBoat(boatType,boatLength);
        }
    }

    public void createMem(){
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter members name : \n");
        String name = scan1.nextLine();

        System.out.println("Enter members personal nr : \n");
        int persNr = scan1.nextInt();

        manageMem.addMem(name, persNr,"");
    }
    public void selectOrEmpty(){
        Scanner scan = new Scanner(System.in);
        if(memArray.size()==0){
            System.out.println("There is no members yet \n");
        }else{
            System.out.println("Enter desired Index of the member \n to handle it or press 99 to go back to main menu");
            int index = scan.nextInt();
            if(index==99){
//returns to main menu
            }
            else{
                memberInfo(index);
            }
        }
    }
}
