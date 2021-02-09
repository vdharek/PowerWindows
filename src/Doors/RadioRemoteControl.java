package Doors;

public class RadioRemoteControl {

    private boolean centralLockingButton = false;
    private boolean ignition = false;

    private boolean windowsLowered;
    private boolean windowsRaised;

    public Object getWindowsLowered() {
        return windowsLowered;
    }

    public boolean getWindowsRaised() {
        return windowsRaised;
    }

    public void centralOpening(boolean windowsLowered) {
        if(ignition == false){
            this.windowsLowered = windowsLowered;
        }else{
            System.out.println("No action");
        }
    }

    public void centralClosing(boolean windowsRaised) {
        if(ignition == false){
            this.windowsRaised = windowsRaised;
        }else{
            System.out.println("No action");
        }
    }

    public void windowRegulatorDD(){

    }

    public void windowRegulatorPD(){

    }

    public void windowRegulatorRR(){

    }

    public void windowRegulatorRF(){

    }

}
