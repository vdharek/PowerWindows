package Doors;

import java.util.Scanner;

public class PowerWindowMain {

    DriverDoor driverDoor = new DriverDoor();
    public static void main(String[] args){

        bootUp();

    }

    public static void bootUp(){

        System.out.println("Please select your activity or press E to exit");
        System.out.println("1. Driver Door");
        System.out.println("2. Remaining Door");
        System.out.println("3. Sensors");
        System.out.println("4. Radio Remote Control");

        boolean run = true;
        while(run){
            int userSelection;

            Scanner userInput = new Scanner(System.in);
            if(userInput.hasNextInt()){
                userSelection = userInput.nextInt();

                if(userSelection == 1){
                    driverDoor();
                }else if(userSelection == 2){
                    remainingDoors();
                }else if(userSelection == 3){
                    sensors();
                }else if(userSelection == 4){
                    radioRemoteControl();
                }else{
                    System.out.println("Please select carract option");
                    bootUp();
                }
            }else if(userInput.hasNext()){
                String exit = userInput.next();
                if(exit.equalsIgnoreCase("e")){
                    run = false;
                }else{
                    System.out.println("Invalid key press E to exit.");
                }
            }
        }
    }

    public static void driverDoor(){

        System.out.println("**Driver Door**");
        System.out.println("1 Window Activity DD");
        System.out.println("2 Window Activity PD");
        System.out.println("3 Window Activity RR");
        System.out.println("4 Window Activity RL");
        System.out.println("Please select the activity or press B to return to back menu. or press E to exit");

            int userSelection;
            Scanner userInput = new Scanner(System.in);
            if(userInput.hasNextInt()){
                userSelection = userInput.nextInt();
                System.out.println(userSelection);
                if(userSelection == 1){
                    System.out.println("1 window activity DD");
                }else if(userSelection == 2){
                    System.out.println("2 Window Activity PD");
                }else if(userSelection == 3){
                    System.out.println("3 Window Activity RR");
                }else if(userSelection == 4){
                    System.out.println("4 Window Activity RL");
                }
            }else if(userInput.hasNext()){
                String exit_back = userInput.next();
                if(exit_back.equalsIgnoreCase("e")){
                    System.exit(0);
                }else if (exit_back.equalsIgnoreCase("b")){
                    bootUp();
                }
            }
        }

    public static void remainingDoors(){
        System.out.println("**Remaining Doors**");
    }

    public static void sensors(){
        System.out.println("**Sensors**");
    }

    public static void radioRemoteControl(){
        System.out.println("**Radio Remote Control**");
    }
}
