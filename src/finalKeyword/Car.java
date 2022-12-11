package finalKeyword;

import inheritance.Vehicle;

public class Car {

   // String MANUFACTURER = Manufacturers.BMW;


    Car myBMW = new BMW("230xi");

    public final void turnLeft(){
        System.out.println("turning left");
    }
    public final void turnRight(){
        System.out.println("turing right");
    }
}
