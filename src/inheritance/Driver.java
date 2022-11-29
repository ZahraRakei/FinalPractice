package inheritance;

public class Driver {

    public static void main(String[] args) {
        Car   modelS = new Tesla("white", "X", 4, true);
        Vehicle train = new Train("black", "hg", 8, true, 300);


        modelS.accelerate();
        modelS.breake();
        modelS.horn();
        modelS.steerLeft();
        modelS.steerRight();

        train.breake();
        train.accelerate();

        int x = 5;
        String name = "Sami";
    }
}
