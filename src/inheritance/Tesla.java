package inheritance;

public class Tesla extends Car {


    public Tesla(String color, String model, int numOfCylinder, boolean hasRoof) {
        super(color, model, numOfCylinder, hasRoof, numberOfWheels);
    }



    public void summon(){
        System.out.println("Tesla is being summoned to your location");
    }
}
