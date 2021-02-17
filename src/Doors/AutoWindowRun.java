package Doors;

public class AutoWindowRun {

    boolean driverDoorAuto = false;
    boolean passengerDoorAuto = false;

    int v_AutoOpen = 1;
    int v_AutoClose = 1;

    public boolean isDriverDoorAuto() {
        if(driverDoorAuto){
            System.out.println("Driver door Window is raising automatically");
            return driverDoorAuto;
        }else{
            System.out.println("Driver door Window is lowering automatically");
            return driverDoorAuto;
        }
    }

    public void setDriverDoorAuto(boolean driverDoorAuto) {
        this.driverDoorAuto = driverDoorAuto;
    }

    public boolean isPassengerDoorAuto() {
        if(passengerDoorAuto){
            System.out.println("Passenger door Window is raising automatically");
            return passengerDoorAuto;
        }else{
            System.out.println("Passenger door Window is lowering automatically");
            return passengerDoorAuto;
        }
    }

    public void setPassengerDoorAuto(boolean passengerDoorAuto) {
        this.passengerDoorAuto = passengerDoorAuto;
    }

    public void functionTriger(){

    }

    public void exitFunction(){

    }

}
