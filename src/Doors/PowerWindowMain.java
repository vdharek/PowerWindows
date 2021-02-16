package Doors;

import java.util.Scanner;

public class PowerWindowMain {

    static DriverDoor driverDoorObj = new DriverDoor();
    static PowerWindowMain powerWindowMainObj = new PowerWindowMain();
    public static boolean engineStart = false;

    public static void main(String[] args){

        powerWindowMainObj.startEngine();

    }

    public void startEngine(){

        System.out.println("Would you like to turn on the engine or just sit in there?");
        System.out.println("Press 0 to start engine or press 1 to just sit");
        int engineStatus;

        Scanner engineInput = new Scanner(System.in);
        if(engineInput.hasNextInt()){
            engineStatus = engineInput.nextInt();
            if(engineStatus == 0){
                System.out.println("Engine has been started");
                engineStart = true;
                bootUp();
            }else if(engineStatus == 1){
                System.out.println("Engine has not started");
                engineStart = false;
                bootUp();
            }else{
                System.out.println("Please enter right input");
                startEngine();
            }
        }
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
                    System.out.println("Please select correct option");
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
        System.out.println();
        System.out.println("Do you want to turn on the child lock on or off?");
        System.out.println("Write on to turn \"ON\" the child lock or write \"OFF\" to turn off the child lock");
        System.out.println();
        System.out.println("Please select the activity or press \"B\" to return to back menu. or press \"E\" to exit");
        System.out.println();

            int userSelection;
            Scanner userInput = new Scanner(System.in);
            if(userInput.hasNextInt()){
                userSelection = userInput.nextInt();
                if(userSelection == 1){
                    System.out.println("Press \"W\" to raise the window or Press \"S\" to lower the window");
                    String upDown = userInput.next();
                    if(engineStart == true){
                        if(upDown.equalsIgnoreCase("w")){
                            driverDoorObj.setPushButtonDriver(true);
                            driverDoorObj.getPushButtonDriver();
                        }else if (upDown.equalsIgnoreCase("s")){
                            driverDoorObj.setPushButtonDriver(false);
                            driverDoorObj.getPushButtonDriver();
                        }else{
                            System.out.println("Please select the right input");
                        }
                    }else{
                        if(upDown.equalsIgnoreCase("w")){
                            driverDoorObj.setPushButtonDriver(true);
                            driverDoorObj.getPushButtonDriver();
                        }else if (upDown.equalsIgnoreCase("s")){
                            driverDoorObj.setPushButtonDriver(false);
                            driverDoorObj.getPushButtonDriver();
                        }else{
                            System.out.println("Please select the right input");
                        }
                    }
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
                }else if(exit_back.equalsIgnoreCase("on")){
                    driverDoorObj.setChildLock(true);
                    driverDoor();
                }else if(exit_back.equalsIgnoreCase("off")){
                    driverDoorObj.setChildLock(false);
                    driverDoor();
                }
                else{
                    System.out.println("Invalid input, Please select the activity or press B to return to back menu. or press E to exit");
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
