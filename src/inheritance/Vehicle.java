package inheritance;

public class Vehicle {

    static String color;
    static String model;
    static int numOfCylinder;
    static boolean hasRoof;

    public Vehicle(String color, String model, int numOfCylinder, boolean hasRoof){
        this.color = color;
        this.model = model;
        this.numOfCylinder = numOfCylinder;
        this.hasRoof = hasRoof;
    }



    public static void accelerate(){
        System.out.println("I'm accelerating");
    }
    public static void breake(){
        System.out.println("break!!!");
    }
    public static void horn(){
        System.out.println("Horning---------");
    }


}
