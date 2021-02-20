package Doors;

import java.util.Scanner;

public class PowerWindowMain {

    static DriverDoor driverDoorObj = new DriverDoor();
    static PowerWindowMain powerWindowMainObj = new PowerWindowMain();
    static RemainingDoors remainingDoorsObj = new RemainingDoors();
    static RadioRemoteControl radioRemoteControlObj = new RadioRemoteControl();
    public static boolean engineStart = false;
    public static boolean childLock;

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

    public void childLock(){
        System.out.println("Do you want to turn on the child lock on or off?");
        System.out.println("Write on to turn \"ON\" the child lock or write \"OFF\" to turn off the child lock");
        System.out.println();

        Scanner childLockSc = new Scanner(System.in);
        if(childLockSc.hasNext()){
            String childLockInput = childLockSc.next();
            if(childLockInput.equalsIgnoreCase("on")){
                childLock = true;
                remainingDoorsObj.setCheckChildLock(childLock);
                //driverDoorObj.setChildLock(childLock);
            }else if (childLockInput.equalsIgnoreCase("off")){
                childLock = false;
                remainingDoorsObj.setCheckChildLock(childLock);
                //driverDoorObj.setChildLock(childLock);
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
        System.out.println("1 Window Activity Driver Door");
        System.out.println("2 Window Activity Passenger Door");
        System.out.println("3 Window Activity Rear Right");
        System.out.println("4 Window Activity Rear Left");
        System.out.println();
        powerWindowMainObj.childLock();
        System.out.println("Please select the activity or press \"B\" to return to back menu. or press \"E\" to exit");
        System.out.println();

            int userSelection;
            Scanner userInput = new Scanner(System.in);
            if(userInput.hasNextInt()){
                userSelection = userInput.nextInt();
                if(userSelection == 1){
                    System.out.println();
                    System.out.println("Press \"W\" to raise the window or Press \"S\" to lower the window");
                    System.out.println();
                    System.out.println("***** Window Activity Driver Door *****");
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
                    System.out.println();
                    System.out.println("Press \"W\" to raise the window or Press \"S\" to lower the window");
                    System.out.println();
                    System.out.println("***** Window Activity Passenger Door *****");
                    String upDown = userInput.next();
                    if(engineStart == true){
                        if(upDown.equalsIgnoreCase("w")){
                            driverDoorObj.setPushButtonPassenger(true);
                            driverDoorObj.getPushButtonPassenger();
                        }else if (upDown.equalsIgnoreCase("s")){
                            driverDoorObj.setPushButtonPassenger(false);
                            driverDoorObj.getPushButtonPassenger();
                        }else{
                            System.out.println("Please select the right input");
                        }
                    }else{
                        if(upDown.equalsIgnoreCase("w")){
                            driverDoorObj.setPushButtonPassenger(true);
                            driverDoorObj.getPushButtonPassenger();
                        }else if (upDown.equalsIgnoreCase("s")){
                            driverDoorObj.setPushButtonPassenger(false);
                            driverDoorObj.getPushButtonPassenger();
                        }else{
                            System.out.println("Please select the right input");
                        }
                    }
                }else if(userSelection == 3){
                    System.out.println();
                    System.out.println("Press \"W\" to raise the window or Press \"S\" to lower the window");
                    System.out.println();
                    System.out.println("***** Window Activity Rear Right Door *****");
                    String upDown = userInput.next();
                        if(upDown.equalsIgnoreCase("w")){
                            driverDoorObj.setPushButtonRearRight(true);
                            driverDoorObj.getPushButtonRearRight();
                        }else if (upDown.equalsIgnoreCase("s")){
                            driverDoorObj.setPushButtonRearRight(false);
                            driverDoorObj.getPushButtonRearRight();
                        }else{
                            System.out.println("Please select the right input");
                        }
                }else if(userSelection == 4){
                    System.out.println();
                    System.out.println("Press \"W\" to raise the window or Press \"S\" to lower the window");
                    System.out.println();
                    System.out.println("***** Window Activity Rear Left Door *****");
                    String upDown = userInput.next();
                    if(upDown.equalsIgnoreCase("w")){
                        driverDoorObj.setPushButtonRearLeft(true);
                        driverDoorObj.getPushButtonRearLeft();
                    }else if (upDown.equalsIgnoreCase("s")){
                        driverDoorObj.setPushButtonRearLeft(false);
                        driverDoorObj.getPushButtonRearLeft();
                    }else{
                        System.out.println("Please select the right input");
                    }
                }
            }else if(userInput.hasNext()){
                String exit_back = userInput.next();
                if(exit_back.equalsIgnoreCase("e")){
                    System.exit(0);
                }else if (exit_back.equalsIgnoreCase("b")){
                    bootUp();
                }/*else if(exit_back.equalsIgnoreCase("on")){
                    driverDoorObj.setChildLock(true);
                    driverDoor();
                }else if(exit_back.equalsIgnoreCase("off")){
                    driverDoorObj.setChildLock(false);
                    driverDoor();
                }*/
                else{
                    System.out.println("Invalid input, Please select the activity or press B to return to back menu. or press E to exit");
                }
            }
        }

    public static void remainingDoors(){

        System.out.println("**Remaining Doors**");
        System.out.println("1 Window Activity Passenger Door");
        System.out.println("2 Window Activity Rear Right Door");
        System.out.println("3 Window Activity Rear Left Door");
        System.out.println();
        System.out.println("Please select the activity or press \"B\" to return to back menu. or press \"E\" to exit");
        System.out.println();

        //driverDoorObj.setChildLock(childLock);
        //driverDoorObj.isChildLock();
        //remainingDoorsObj.isCheckChildLock();

        int userSelection;
        Scanner userInput = new Scanner(System.in);
        if(userInput.hasNextInt()) {
            userSelection = userInput.nextInt();
            if (userSelection == 1) {
                System.out.println();
                System.out.println("Press \"W\" to raise the window or Press \"S\" to lower the window");
                System.out.println();
                System.out.println("***** Remaining Door Window Activity Passenger Door *****");
                String upDown = userInput.next();
                if(engineStart == true){
                    if(upDown.equalsIgnoreCase("w")){
                        remainingDoorsObj.setPassengerWindow(true);
                        remainingDoorsObj.isPassengerWindow();
                    }else if (upDown.equalsIgnoreCase("s")){
                        remainingDoorsObj.setPassengerWindow(false);
                        remainingDoorsObj.isPassengerWindow();
                    }else{
                        System.out.println("Please select the right input");
                    }
                }else{
                    if(upDown.equalsIgnoreCase("w")){
                        remainingDoorsObj.setPassengerWindow(true);
                        remainingDoorsObj.isPassengerWindow();
                    }else if (upDown.equalsIgnoreCase("s")){
                        remainingDoorsObj.setPassengerWindow(false);
                        remainingDoorsObj.isPassengerWindow();
                    }else{
                        System.out.println("Please select the right input");
                    }
                }
            } else if (userSelection == 2) {
                System.out.println();
                System.out.println("Press \"W\" to raise the window or Press \"S\" to lower the window");
                System.out.println();
                System.out.println("***** Remaining Door Window Activity Rear Right Door *****");
                String upDown = userInput.next();
                if(upDown.equalsIgnoreCase("w")){
                    remainingDoorsObj.setRearRightWindow(true);
                    remainingDoorsObj.isRearRightWindow();
                }else if (upDown.equalsIgnoreCase("s")){
                    remainingDoorsObj.setRearRightWindow(false);
                    remainingDoorsObj.isRearRightWindow();
                }else{
                    System.out.println("Please select the right input");
                }
            }else if (userSelection == 3) {
                System.out.println();
                System.out.println("Press \"W\" to raise the window or Press \"S\" to lower the window");
                System.out.println();
                System.out.println("***** Remaining Door Window Activity Rear Left Door *****");
                String upDown = userInput.next();
                if(upDown.equalsIgnoreCase("w")){
                    remainingDoorsObj.setRearLeftWindow(true);
                    remainingDoorsObj.isRearLeftWindow();
                }else if (upDown.equalsIgnoreCase("s")){
                    remainingDoorsObj.setRearLeftWindow(false);
                    remainingDoorsObj.isRearLeftWindow();
                }else{
                    System.out.println("Please select the right input");
                }
            }
        }else if(userInput.hasNext()){
            String exit_back = userInput.next();
            if(exit_back.equalsIgnoreCase("e")){
                System.exit(0);
            }else if (exit_back.equalsIgnoreCase("b")){
                bootUp();
            }else{
                System.out.println("Invalid input, Please select the activity or press B to return to back menu. or press E to exit");
            }
        }
    }

    public static void sensors(){
        System.out.println("**Sensors**");
    }

    public static void radioRemoteControl(){
        System.out.println("**Radio Remote Control**");
        System.out.println("Please choose an action to be performed");
        System.out.println("1. Central Locking Button");
        System.out.println("2. Central Opening");
        System.out.println("3. Central Closing");
        System.out.println("4. Actuators");

        int userSelection;
        Scanner radioInput = new Scanner(System.in);
        if(radioInput.hasNextInt()) {
            userSelection = radioInput.nextInt();
            if (userSelection == 1) {
                System.out.println("***Central Locking Button***");
                System.out.println("Would you like to central lock? \"Y\" or \"N\" ");
                String userLockSelection = radioInput.next();
                if(userLockSelection.equalsIgnoreCase("Y")){
                    radioRemoteControlObj.setCentralLockingButton(true);
                    radioRemoteControlObj.isCentralLockingButton();
                }else if(userLockSelection.equalsIgnoreCase("N")){
                    radioRemoteControlObj.setCentralLockingButton(false);
                    radioRemoteControlObj.isCentralLockingButton();
                }
            }else if(userSelection == 2){
                System.out.println("***Central Opening***");
                radioRemoteControlObj.setIgnition(engineStart);
                radioRemoteControlObj.setCentralOpening(true);
                radioRemoteControlObj.isCentralOpening();
            }else if(userSelection == 3){
                System.out.println("***Central Closing***");
                radioRemoteControlObj.setIgnition(engineStart);
                radioRemoteControlObj.setCentralClosing(true);
                radioRemoteControlObj.isCentralClosing();
            }else if(userSelection == 4){
                System.out.println("***Actuators***");
                System.out.println("Please select the following");
                System.out.println("1. Window Regulator Driver Door");
                System.out.println("2. Window Regulator Passenger Door");
                System.out.println("3. Window Regulator Rear Left Door");
                System.out.println("4. Window Regulator Rear Right Door");
                int actuatorsSelection;
                if(radioInput.hasNextInt()){
                    actuatorsSelection = radioInput.nextInt();
                    if(actuatorsSelection == 1){
                        radioRemoteControlObj.setWindowRegulatorDD(true);
                        radioRemoteControlObj.isWindowRegulatorDD();
                    }else if(actuatorsSelection == 2){
                        radioRemoteControlObj.setWindowRegulatorPD(true);
                        radioRemoteControlObj.isWindowRegulatorPD();
                    }else if(actuatorsSelection == 3){
                        radioRemoteControlObj.setWindowRegulatorRF(true);
                        radioRemoteControlObj.isWindowRegulatorRF();
                    }else if(actuatorsSelection == 4){
                        radioRemoteControlObj.setWindowRegulatorRR(true);
                        radioRemoteControlObj.isWindowRegulatorRR();
                    }else{
                        System.out.println("Please select the right input");
                    }
                }
            }else{
                System.out.println("Please select the right input");
            }
        }
    }
}
