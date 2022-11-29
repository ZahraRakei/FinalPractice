package inheritance;

public class Car extends Vehicle{


    public Car(String color, String model, int numOfCylinder, boolean hasRoof, int numberOfWheels) {
        super(color, model, numOfCylinder, hasRoof, numberOfWheels);
    }

    public  static void steerLeft(){
        System.out.println("steering left");
    }
    public static void steerRight(){
        System.out.println("steering right");
    }




}
