package Doors;

public class DriverDoor {

    RemainingDoors remainingDoors = new RemainingDoors();
    AutoWindowRun autoWindowRun = new AutoWindowRun();
    ManualWindowRun manualWindowRun = new ManualWindowRun();
    PowerWindowMain powerWindowMain = new PowerWindowMain();

    private boolean childLock = false;

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
        return pushButtonPassenger;
    }

    public boolean getPushButtonRearRight() {
        return pushButtonRearRight;
    }

    public boolean getPushButtonRearLeft() {
        return pushButtonRearLeft;
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
        return childLock;
    }

    public void setChildLock(boolean childLock) {
        this.childLock = childLock;
        remainingDoors.setCheckChildLock(childLock);
    }

    public void windowsActivity(){

    }
}
