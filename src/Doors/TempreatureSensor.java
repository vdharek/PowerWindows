package Doors;

public class TempreatureSensor {

    private boolean driverDoorWRM = false;
    private boolean passengerDoorWRM = false;
    private boolean rearLeftDoorWRM = false;
    private boolean rearRightDoorWRM = false;

    public boolean isDriverDoorWRM() {
        return driverDoorWRM;
    }

    public void setDriverDoorWRM(boolean driverDoorWRM) {
        this.driverDoorWRM = driverDoorWRM;
    }

    public boolean isPassengerDoorWRM() {
        return passengerDoorWRM;
    }

    public void setPassengerDoorWRM(boolean passengerDoorWRM) {
        this.passengerDoorWRM = passengerDoorWRM;
    }

    public boolean isRearLeftDoorWRM() {
        return rearLeftDoorWRM;
    }

    public void setRearLeftDoorWRM(boolean rearLeftDoorWRM) {
        this.rearLeftDoorWRM = rearLeftDoorWRM;
    }

    public boolean isRearRightDoorWRM() {
        return rearRightDoorWRM;
    }

    public void setRearRightDoorWRM(boolean rearRightDoorWRM) {
        this.rearRightDoorWRM = rearRightDoorWRM;
    }

    /*public void overheatProtectionTriger(){

    }

    public void overheatProtectionExit(){

    }*/

}
