package Doors;

public class RearDoor {

    private boolean checkChildLock;
    private int passengerWindow;
    private int rearRight;

    public int getPassengerWindow() {
        return passengerWindow;
    }

    public int getRearRight() {
        return rearRight;
    }

    public int getRearLeft() {
        return rearLeft;
    }

    private int rearLeft;

    public boolean isCheckChildLock() {
        return checkChildLock;
    }

    public void getChildlockStatus(boolean result){
        this.checkChildLock = result;
        System.out.println("GetChildLockStatus() is running");
    }

    public void rearDoorsWindowActivity(int passengerWindow,
                                        int rearLeft,
                                        int rearRight){
        if(checkChildLock == false){
            System.out.println("Now passenger can make a movement of a window");
            this.passengerWindow = passengerWindow;
            this.rearLeft = rearLeft;
            this.rearRight = rearRight;
            //we can also implement here switch case concept.
        }
        else{
            System.out.println("Door windows will be blocked.");
        }
    }

}
