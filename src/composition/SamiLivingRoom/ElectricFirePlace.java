package composition.SamiLivingRoom;

public class ElectricFirePlace {

    public enum  HeatIntensity {
        LOW, MEDIUM, HIGH
    }

    private boolean isOn;
    private String heatIntensity;

    public ElectricFirePlace(){
        this.isOn = false;
        this.heatIntensity = null;
    }

    public boolean isOn(){
        return  isOn;
    }

    public void setOn(boolean on){
        this. isOn = on;
    }


    public void turnOn(HeatIntensity intensity){
        if (this.isOn){
            System.out.println("fireplace is already on, heat intensity is set to: "+ this.heatIntensity);

        } else {
            this.isOn = true;

            System.out.println("fireplace is on");
            this.heatIntensity = intensity.toString();
            System.out.println("Heat intensity is set to: " + this.heatIntensity);

        }
    }
    public void turnOff(){
        if (isOn){
            setOn(false);
            heatIntensity = null;
        }
        System.out.println("Fireplace is off");
    }
    public void setHeatIntensity(HeatIntensity intensity){
        this.heatIntensity = intensity.toString();
    }

    public String getHeatIntensity(){
        System.out.println("hea intensity is set to: "+ heatIntensity);
        return heatIntensity;
    }
}
