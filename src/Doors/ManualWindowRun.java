package Doors;

public class ManualWindowRun {

    private boolean driverDoorWindow =  false;
    private boolean passengerDoorWindow =  false;
    private boolean rearLeftDoorWindow =  false;
    private boolean rearRightDoorWindow =  false;

    public boolean isDriverDoorWindow() {
        if(driverDoorWindow){
            System.out.println("Window is raising manually");
            return driverDoorWindow;
        }else{
            System.out.println("Window is lowering manually");
            return driverDoorWindow;
        }
    }

    public void setDriverDoorWindow(boolean driverDoorWindow) {
        this.driverDoorWindow = driverDoorWindow;
    }

    public boolean isPassengerDoorWindow() {
        return passengerDoorWindow;
    }

    public void setPassengerDoorWindow(boolean passengerDoorWindow) {
        this.passengerDoorWindow = passengerDoorWindow;
    }

    public boolean isRearLeftDoorWindow() {
        return rearLeftDoorWindow;
    }

    public void setRearLeftDoorWindow(boolean rearLeftDoorWindow) {
        this.rearLeftDoorWindow = rearLeftDoorWindow;
    }

    public boolean isRearRightDoorWindow() {
        return rearRightDoorWindow;
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
