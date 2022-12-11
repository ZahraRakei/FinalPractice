package composition;

public class Monitor {
    String mfr;
    String resolution;
    boolean isLED;
    WebCamera webcamera;

    public Monitor(String mfr, String resolution, boolean isLED, WebCamera webcamera){
        this.mfr = mfr;
        this.resolution = resolution;
        this.isLED = isLED;
        this.webcamera = webcamera;
    }
    void  turnOn(){
        System.out.println("Turning on");
    }
    void turnOff(){
        System.out.println("Turning off");
    }
}
