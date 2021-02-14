package Doors;

public class RadioRemoteControl {

    private boolean centralLockingButton = false;
    private boolean ignition = false;

    private boolean windowsLowered = false;
    private boolean windowsRaised = false;

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

    boolean windowRegulatorDD;
    boolean windowRegulatorPD;
    boolean windowRegulatorRR;
    boolean windowRegulatorRF;

    public boolean isWindowRegulatorDD() {
        return windowRegulatorDD;
    }

    public void setWindowRegulatorDD(boolean windowRegulatorDD) {
        this.windowRegulatorDD = windowRegulatorDD;
    }

    public boolean isWindowRegulatorPD() {
        return windowRegulatorPD;
    }

    public void setWindowRegulatorPD(boolean windowRegulatorPD) {
        this.windowRegulatorPD = windowRegulatorPD;
    }

    public boolean isWindowRegulatorRR() {
        return windowRegulatorRR;
    }

    public void setWindowRegulatorRR(boolean windowRegulatorRR) {
        this.windowRegulatorRR = windowRegulatorRR;
    }

    public boolean isWindowRegulatorRF() {
        return windowRegulatorRF;
    }

    public void setWindowRegulatorRF(boolean windowRegulatorRF) {
        this.windowRegulatorRF = windowRegulatorRF;
    }
}
