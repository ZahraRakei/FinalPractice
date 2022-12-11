package composition.room;

public class Frij {
    public enum Tempreture{
        veryCold, cold, fine
    }

    private boolean isOn;
    private Tempreture tempreture;

    int height;
    String frijType;

    public Frij(int height, String frijType){
        height = height;
        frijType = frijType;
    }

    public boolean isOn(){
        return  isOn;
    }
    public void setOn(boolean on){
        isOn = on;
    }
    public Tempreture getTempreture(){
        return tempreture;
    }
    public void setTempreture(Tempreture tempreture){
        this.tempreture = tempreture;
    }

    public void turnOn() {
        if (this.isOn) {
            System.out.println("Frij is already on");
        } else {
            this.isOn = true;
            System.out.println(" I turned on the frij");

        }
    }


}
