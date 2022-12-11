package composition.SamiLivingRoom;

public class Television {

    private String manufacturer;
    private  int screenSize;
    private  boolean is4k;
    private boolean isOn;

    public Television(String manufacturer, int screenSize, boolean is4k){
        manufacturer = manufacturer;
        screenSize = screenSize;
        is4k = is4k;
        isOn = false;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return  manufacturer;
    }

    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }
    public int getScreenSize(){
        return screenSize;
    }

    public void setIs4k(boolean is4k){
        this.is4k = is4k;
    }
    public boolean getIs4k(){
        return is4k;
    }

    public void turnOn(){
        if (this.isOn) {
            this.isOn = true;
            System.out.println("tv is already on");
        } else {
            this.isOn = true;
             System.out.println("tv is on");
        }
    }
    public  void  yurnOff(){
        if (this.isOn){
            this.isOn = false;
            }
        System.out.println("tv is  off");

    }

}
