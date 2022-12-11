package inheritance;

public class Tesla extends Car {

    int cc;
    boolean hasfsd;
    int price;

    public Tesla(String color, String model, int numOfCylinder, boolean hasRoof, int cc, boolean hasfsd, int price, boolean isLuxury) {
        super(color, model, numOfCylinder, hasRoof, numberOfWheels, isLuxury);
        this.cc = cc;
        this.hasfsd = hasfsd;
        this.price = price;
    }





    public void summon(){
        System.out.println("Tesla is being summoned to your location");
    }
}
