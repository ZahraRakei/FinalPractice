public class buildACar {

    public static void main(String[] args) {


        Tesla modelS = new Tesla();
        Tesla modelY = new Tesla();

        modelS.model = "S";
        modelY.model = "Y";
//        modelS.MANUFACTURER = "benz";
        System.out.println("model S manufacturer is " + modelS.MANUFACTURER);
        System.out.println(modelY.MANUFACTURER);
    }
}
