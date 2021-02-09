package Doors;

public class DriverDoor {

    private RearDoor rearDoor = null;

    private boolean childLock = true;

    private boolean pushButtonDriver = false;
    private boolean pushButtonPassenger = false;
    private boolean pushButtonRearRight = false;
    private boolean pushButtonRearLeft = false;

    public boolean getPushButtonDriver() {
        return pushButtonDriver;
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

    public void setPushButtonDriver(boolean pushButtonDriver) {
        this.pushButtonDriver = pushButtonDriver;
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
        rearDoor.getChildlockStatus(childLock);
    }

    public void windowsActivity(){

    }
}
