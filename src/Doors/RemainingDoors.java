package Doors;

public class RemainingDoors {

    private boolean checkChildLock;
    PowerWindowMain powerWindowMain = new PowerWindowMain();
    AutoWindowRun autoWindowRun = new AutoWindowRun();
    ManualWindowRun manualWindowRun = new ManualWindowRun();

    private boolean passengerWindow = false;
    private boolean rearRightWindow = false;
    private boolean rearLeftWindow = false;

    public boolean isCheckChildLock() {
        return checkChildLock;
    }

    public void setCheckChildLock(boolean checkChildLock) {
        this.checkChildLock = checkChildLock;
    }

    public boolean isPassengerWindow() {
        if(powerWindowMain.engineStart == true){
            if(passengerWindow){
                autoWindowRun.setPassengerDoorAuto(passengerWindow);
                autoWindowRun.isPassengerDoorAuto();

                return passengerWindow;
            }else{
                autoWindowRun.setPassengerDoorAuto(passengerWindow);
                autoWindowRun.isPassengerDoorAuto();
                return passengerWindow;
            }
        }else{
            if(passengerWindow){
                manualWindowRun.setPassengerDoorWindow(passengerWindow);
                manualWindowRun.isPassengerDoorWindow();

                return passengerWindow;
            }else{
                manualWindowRun.setPassengerDoorWindow(passengerWindow);
                manualWindowRun.isPassengerDoorWindow();
                return passengerWindow;
            }
        }
    }

    public void setPassengerWindow(boolean passengerWindow) {
        this.passengerWindow = passengerWindow;
    }

    public boolean isRearRightWindow() {
        if(checkChildLock){
            System.out.println("Door windows are locked because of child lock");
            return rearRightWindow;
        }else{
            if(rearRightWindow){
                manualWindowRun.setRearRightDoorWindow(rearRightWindow);
                manualWindowRun.isRearRightDoorWindow();

                return rearRightWindow;
            }else{
                manualWindowRun.setRearRightDoorWindow(rearRightWindow);
                manualWindowRun.isRearRightDoorWindow();

                return rearRightWindow;
            }
        }
    }

    public void setRearRightWindow(boolean rearRightWindow) {
        this.rearRightWindow = rearRightWindow;
    }

    public boolean isRearLeftWindow() {
        if(rearLeftWindow){
            manualWindowRun.setRearLeftDoorWindow(rearLeftWindow);
            manualWindowRun.isRearLeftDoorWindow();

            return rearLeftWindow;
        }else{
            manualWindowRun.setRearLeftDoorWindow(rearLeftWindow);
            manualWindowRun.isRearLeftDoorWindow();
            return rearLeftWindow;
        }
    }

    public void setRearLeftWindow(boolean rearLeftWindow) {
        this.rearLeftWindow = rearLeftWindow;
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
