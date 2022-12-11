package finalKeyword;

public class BMW extends Car{

        public enum Models{
                BMW_128xi,
                BMW_135xi,
                BMW_230i,
                BMW_230xi,
        }



        static Manufacturers MANUFACTURER = Manufacturers.BMW;

        String model;
        int numOfCyclinders;
        int horsePower;
        boolean isXDrive;
        boolean hasTurbo;
        boolean oiCoupe;
        boolean hasMSportPackage;
        boolean hasMPerformancePackage;

        public BMW(String model){
                this. model = model;
        }

        public static void main(String[] args) {
             //   System.out.println(Manufacturers.BMW);
//                String manufacturer = Manufacturers.BMW.toString();
//                System.out.println(manufacturer);
                System.out.println(Models.BMW_135xi);
        }

}
