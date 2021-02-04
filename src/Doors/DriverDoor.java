package Doors;

public class DriverDoor {

    private RearDoor rearDoor = null;

    private boolean childLock = true;

    private int pushButtonDriver;
    private int pushButtonPassenger;
    private int pushButtonRearRight;
    private int pushButtonRearLeft;

    public int getPushButtonDriver() {
        return pushButtonDriver;
    }

    public int getPushButtonPassenger() {
        return pushButtonPassenger;
    }

    public int getPushButtonRearRight() {
        return pushButtonRearRight;
    }

    public int getPushButtonRearLeft() {
        return pushButtonRearLeft;
    }

    public boolean isChildLock() {
        return childLock;
    }

    public void setChildLock(boolean childLock) {
        this.childLock = childLock;
        rearDoor.getChildlockStatus(childLock);
    }

    public void windowsActivity(int pushButtonDriver,
                                int pushButtonPassenger,
                                int pushButtonRearLeft,
                                int pushButtonRearRight){
        this.pushButtonDriver = pushButtonDriver;
        this.pushButtonPassenger = pushButtonPassenger;
        this.pushButtonRearRight = pushButtonRearRight;
        this.pushButtonRearLeft = pushButtonRearLeft;
        // we can implement switch case here.

    }

}
