package composition;

public class Keyboard {

    String mfr;
    boolean isMechanichal;
    boolean isQwerty;

    public Keyboard(String mfr, boolean isMechanichal, boolean isQwerty) {

        this.mfr = mfr;
        this.isMechanichal = isMechanichal;
        this.isQwerty = isQwerty;

    }

    void turnOnBacklights(){
        System.out.println("Turned on keyboard backlights.");




    }
}
