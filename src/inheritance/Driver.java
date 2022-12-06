package inheritance;

public class Driver {

    public static void main(String[] args) {
        Car   modelS = new Tesla("white", "X", 4, true, 400,true, 120000, true);
        Vehicle train = new Train("black", "hg", 8, true, 300);


        modelS.accelerate();
        modelS.breake();
        modelS.horn();
        modelS.steerLeft();
        modelS.steerRight();

        train.breake();
        train.accelerate();

        Driver obj = new Driver();
        Object x = obj.getTesla("white", "S", 4, true, 790, false, 80000, false);
        if (x instanceof Vehicle){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }



    public Object getTesla(String color, String model, int numOfCylinder, boolean hasRoof, int cc, boolean hasfsd, int price, boolean isLuxury){
        Tesla tesla = new Tesla(color, model, numOfCylinder, hasRoof, cc, hasfsd, price, isLuxury);
        return tesla;
    }
    public String[] getName(){
        return new String[10];
    }
}
