package Doors;

public class ForceSensors {

    private boolean driverDoorFS;
    private boolean passengerDoorFS;
    private boolean rearLeftFS;
    private boolean rearRightFS;

    int F_apm_max;
    int v_rev;
    int s_apm_rev;

    public boolean isDriverDoorFS() {
        return driverDoorFS;
    }

    public void setDriverDoorFS(boolean driverDoorFS) {
        this.driverDoorFS = driverDoorFS;
    }

    public boolean isPassengerDoorFS() {
        return passengerDoorFS;
    }

    public void setPassengerDoorFS(boolean passengerDoorFS) {
        this.passengerDoorFS = passengerDoorFS;
    }

    public boolean isRearLeftFS() {
        return rearLeftFS;
    }

    public void setRearLeftFS(boolean rearLeftFS) {
        this.rearLeftFS = rearLeftFS;
    }

    public boolean isRearRightFS() {
        return rearRightFS;
    }

    public void setRearRightFS(boolean rearRightFS) {
        this.rearRightFS = rearRightFS;
    }

    /*public void apmTriger(){

    }

    public void apmExit(){

    }*/

}
