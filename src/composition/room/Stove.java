package composition.room;

import java.awt.*;

public class Stove {

    public  enum HeatIntensity{
        LOW, HIGH, MEDIUM;
    }

    private boolean isOn;
    private String heatIntensity;

    String stoveMaterial;
    String stoveColor;

    public Stove(String stoveMaterial, String stoveColor){
        stoveMaterial = stoveMaterial;
        stoveColor = stoveColor;
    }

    public void setOn(boolean on){
        isOn = on;
    }

    public boolean getIsOn(){
        return isOn;
    }

    public String getHeatIntensity(){
        return heatIntensity;
    }
    public void setHeatIntensity(HeatIntensity heatIntensity){
        heatIntensity = heatIntensity;
    }

    public void turnOn(){
        System.out.println("Stove turned on");
    }
    public void turnOff(){
        System.out.println("Stove turned off");
    }
}
