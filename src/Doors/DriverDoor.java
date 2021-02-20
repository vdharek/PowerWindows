package Doors;

public class DriverDoor {

    RemainingDoors remainingDoors = new RemainingDoors();
    AutoWindowRun autoWindowRun = new AutoWindowRun();
    ManualWindowRun manualWindowRun = new ManualWindowRun();
    PowerWindowMain powerWindowMain = new PowerWindowMain();

    private boolean childLock;

    private boolean pushButtonDriver = false;
    private boolean pushButtonPassenger = false;
    private boolean pushButtonRearRight = false;
    private boolean pushButtonRearLeft = false;

    
    public boolean getPushButtonDriver() {

        if(powerWindowMain.engineStart == true){
            if(pushButtonDriver){
                autoWindowRun.setDriverDoorAuto(pushButtonDriver);
                autoWindowRun.isDriverDoorAuto();

                return pushButtonDriver;
            }else{
                autoWindowRun.setDriverDoorAuto(pushButtonDriver);
                autoWindowRun.isDriverDoorAuto();
                return pushButtonDriver;
            }
        }else{
            if(pushButtonDriver){
                manualWindowRun.setDriverDoorWindow(pushButtonDriver);
                manualWindowRun.isDriverDoorWindow();

                return pushButtonDriver;
            }else{
                manualWindowRun.setDriverDoorWindow(pushButtonDriver);
                manualWindowRun.isDriverDoorWindow();
                return pushButtonDriver;
            }
        }
    }

    public void setPushButtonDriver(boolean pushButtonDriver) {
        this.pushButtonDriver = pushButtonDriver;
    }


    public boolean getPushButtonPassenger() {
        if(powerWindowMain.engineStart == true){
            if(pushButtonPassenger){
                autoWindowRun.setPassengerDoorAuto(pushButtonPassenger);
                autoWindowRun.isPassengerDoorAuto();

                return pushButtonPassenger;
            }else{
                autoWindowRun.setPassengerDoorAuto(pushButtonPassenger);
                autoWindowRun.isPassengerDoorAuto();
                return pushButtonPassenger;
            }
        }else{
            if(pushButtonPassenger){
                manualWindowRun.setPassengerDoorWindow(pushButtonPassenger);
                manualWindowRun.isPassengerDoorWindow();

                return pushButtonPassenger;
            }else{
                manualWindowRun.setPassengerDoorWindow(pushButtonPassenger);
                manualWindowRun.isPassengerDoorWindow();
                return pushButtonPassenger;
            }
        }
    }

    public boolean getPushButtonRearRight() {
        if(pushButtonRearRight){
            manualWindowRun.setRearRightDoorWindow(pushButtonRearRight);
            manualWindowRun.isRearRightDoorWindow();

            return pushButtonRearRight;
        }else{
            manualWindowRun.setRearRightDoorWindow(pushButtonRearRight);
            manualWindowRun.isRearRightDoorWindow();
            return pushButtonRearRight;
        }
    }

    public boolean getPushButtonRearLeft() {
        if(pushButtonRearLeft){
            manualWindowRun.setRearLeftDoorWindow(pushButtonRearLeft);
            manualWindowRun.isRearLeftDoorWindow();

            return pushButtonRearLeft;
        }else{
            manualWindowRun.setRearLeftDoorWindow(pushButtonRearLeft);
            manualWindowRun.isRearLeftDoorWindow();
            return pushButtonRearLeft;
        }
    }

    public void setPushButtonPassenger(boolean pushButtonPassenger) {
        this.pushButtonPassenger = pushButtonPassenger;
    }

    public void setPushButtonRearRight(boolean pushButtonRearRight) {
        this.pushButtonRearRight = pushButtonRearRight;
    }

    public void setPushButtonRearLeft(boolean pushButtonRearLeft) {
        this.pushButtonRearLeft = pushButtonRearLeft;
    }

    public boolean isChildLock() {
        remainingDoors.setCheckChildLock(childLock);
        remainingDoors.isCheckChildLock();
        return childLock;
    }

    public void setChildLock(boolean childLock) {
        this.childLock = childLock;
    }

    public void windowsActivity(){

    }
}
