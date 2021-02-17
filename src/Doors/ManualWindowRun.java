package Doors;

public class ManualWindowRun {

    private boolean driverDoorWindow =  false;
    private boolean passengerDoorWindow =  false;
    private boolean rearLeftDoorWindow =  false;
    private boolean rearRightDoorWindow =  false;

    public boolean isDriverDoorWindow() {
        if(driverDoorWindow){
            System.out.println("Driver door Window is raising manually");
            return driverDoorWindow;
        }else{
            System.out.println("Driver door Window is lowering manually");
            return driverDoorWindow;
        }
    }

    public void setDriverDoorWindow(boolean driverDoorWindow) {
        this.driverDoorWindow = driverDoorWindow;
    }

    public boolean isPassengerDoorWindow() {
        if(passengerDoorWindow){
            System.out.println("Passenger door Window is raising manually");
            return passengerDoorWindow;
        }else{
            System.out.println("Passenger door Window is lowering manually");
            return passengerDoorWindow;
        }
    }

    public void setPassengerDoorWindow(boolean passengerDoorWindow) {
        this.passengerDoorWindow = passengerDoorWindow;
    }

    public boolean isRearLeftDoorWindow() {
        if(rearLeftDoorWindow){
            System.out.println("Rear left door Window is raising manually");
            return rearLeftDoorWindow;
        }else{
            System.out.println("Rear left door Window is lowering manually");
            return rearLeftDoorWindow;
        }
    }

    public void setRearLeftDoorWindow(boolean rearLeftDoorWindow) {
        this.rearLeftDoorWindow = rearLeftDoorWindow;
    }

    public boolean isRearRightDoorWindow() {
        if(rearRightDoorWindow){
            System.out.println("Rear right door Window is raising manually");
            return rearRightDoorWindow;
        }else{
            System.out.println("Rear right door Window is lowering manually");
            return rearRightDoorWindow;
        }
    }

    public void setRearRightDoorWindow(boolean rearRightDoorWindow) {
        this.rearRightDoorWindow = rearRightDoorWindow;
    }

    public void buttonOperation(){

    }

    public void mExitByUser(){

    }

    public void mExitBySystem(){

    }

}
