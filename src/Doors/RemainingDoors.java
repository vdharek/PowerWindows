package Doors;

public class RemainingDoors {

    private boolean checkChildLock;

    private boolean passengerWindow = false;
    private boolean rearRight = false;
    private boolean rearLeft = false;

    public boolean isCheckChildLock() {
        return checkChildLock;
    }

    public void setCheckChildLock(boolean checkChildLock) {
        this.checkChildLock = checkChildLock;
    }

    public boolean isPassengerWindow() {
        return passengerWindow;
    }

    public void setPassengerWindow(boolean passengerWindow) {
        this.passengerWindow = passengerWindow;
    }

    public boolean isRearRight() {
        return rearRight;
    }

    public void setRearRight(boolean rearRight) {
        this.rearRight = rearRight;
    }

    public boolean isRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(boolean rearLeft) {
        this.rearLeft = rearLeft;
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
