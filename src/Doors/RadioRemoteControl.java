package Doors;

public class RadioRemoteControl {

    private boolean centralLockingButton = false;
    private boolean ignition = false;

    private boolean centralClosing;
    private boolean centralOpening;

    public boolean isCentralClosing() {
        if(ignition){
            System.out.println("Ignition is on, central closing will not work");
        }else{
            System.out.println("Central Closing is in action");
        }
        return centralClosing;
    }

    public void setCentralClosing(boolean centralClosing) {
        this.centralClosing = centralClosing;
    }

    public boolean isCentralOpening() {
        if(ignition){
            System.out.println("Ignition is on, central opening will not work");
        }else{
            System.out.println("Central Opening is in action");
        }
        return centralOpening;
    }

    public void setCentralOpening(boolean centralOpening) {
        this.centralOpening = centralOpening;
    }

    public boolean isCentralLockingButton() {
        if(centralLockingButton == true){
            System.out.println("Central Lock is activated");
        }else{
            System.out.println("Central lock is deactivated");
        }
        return centralLockingButton;
    }

    public void setCentralLockingButton(boolean centralLockingButton) {
        this.centralLockingButton = centralLockingButton;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    boolean windowRegulatorDD;
    boolean windowRegulatorPD;
    boolean windowRegulatorRR;
    boolean windowRegulatorRF;

    public boolean isWindowRegulatorDD() {
        System.out.println("Window Regulator Driver Door is in action");
        return windowRegulatorDD;
    }

    public void setWindowRegulatorDD(boolean windowRegulatorDD) {
        this.windowRegulatorDD = windowRegulatorDD;
    }

    public boolean isWindowRegulatorPD() {
        System.out.println("Window Regulator Passenger Door is in action");
        return windowRegulatorPD;
    }

    public void setWindowRegulatorPD(boolean windowRegulatorPD) {
        this.windowRegulatorPD = windowRegulatorPD;
    }

    public boolean isWindowRegulatorRR() {
        System.out.println("Window Regulator Rear Right Door is in action");
        return windowRegulatorRR;
    }

    public void setWindowRegulatorRR(boolean windowRegulatorRR) {
        this.windowRegulatorRR = windowRegulatorRR;
    }

    public boolean isWindowRegulatorRF() {
        System.out.println("Window Regulator Rear Left Door is in action");
        return windowRegulatorRF;
    }

    public void setWindowRegulatorRF(boolean windowRegulatorRF) {
        this.windowRegulatorRF = windowRegulatorRF;
    }
}
