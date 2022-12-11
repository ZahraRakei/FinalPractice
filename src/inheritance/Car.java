package inheritance;

public class Car extends Vehicle{


    boolean isLuxury;

    public Car(String color, String model, int numOfCylinder, boolean hasRoof, int numberOfWheels, boolean isLuxury) {
        super(color, model, numOfCylinder, hasRoof, numberOfWheels);
        this.isLuxury = isLuxury;
    }

    public  static void steerLeft(){
        System.out.println("steering left");
    }
    public static void steerRight(){
        System.out.println("steering right");
    }




}
