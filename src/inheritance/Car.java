package inheritance;

public class Car extends Vehicle{


    public  static void steerLeft(){
        System.out.println("steering left");
    }
    public static void steerRight(){
        System.out.println("steering right");
    }
    public Car(String color, String model, int numOfCylinder, boolean hasRoof) {
        super(color, model, numOfCylinder, hasRoof);
    }



}
