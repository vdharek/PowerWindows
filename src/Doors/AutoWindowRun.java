package Doors;

public class AutoWindowRun {

    boolean driverDoorAuto = false;
    boolean passengerDoorAuto = false;

    int v_AutoOpen = 1;
    int v_AutoClose = 1;

    public boolean isDriverDoorAuto() {
        if(driverDoorAuto){
            System.out.println("Window is raising automatically");
            return driverDoorAuto;
        }else{
            System.out.println("Window is lowering automatically");
            return driverDoorAuto;
        }
    }

    public void setDriverDoorAuto(boolean driverDoorAuto) {
        this.driverDoorAuto = driverDoorAuto;
    }

    public boolean isPassengerDoorAuto() {
        return passengerDoorAuto;
    }

    public void setPassengerDoorAuto(boolean passengerDoorAuto) {
        this.passengerDoorAuto = passengerDoorAuto;
    }

    public void functionTriger(){

    }

    public void exitFunction(){

    }

}
