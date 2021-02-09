package Doors;

public class RearDoor {

    private boolean checkChildLock;

    private boolean passengerWindow = false;
    private boolean rearRight = false;
    private boolean rearLeft = false;

    public boolean getPassengerWindow() {
        return passengerWindow;
    }

    public boolean getRearRight() {
        return rearRight;
    }

    public boolean getRearLeft() {
        return rearLeft;
    }

    public boolean isCheckChildLock() {
        return checkChildLock;
    }

    public void setPassengerWindow(boolean passengerWindow) {
        this.passengerWindow = passengerWindow;
    }

    public void setRearRight(boolean rearRight) {
        this.rearRight = rearRight;
    }

    public void setRearLeft(boolean rearLeft) {
        this.rearLeft = rearLeft;
    }

    public void getChildlockStatus(boolean result){
        this.checkChildLock = result;
        System.out.println("GetChildLockStatus() is running");
    }

    public void rearDoorsWindowActivity(){
        if(checkChildLock == false){
            System.out.println("Now passenger can make a movement of a window");
            //Calling of methods.
        }
        else{
            System.out.println("Door windows will be blocked.");
        }
    }
}
