package constructorPractice;

public class Burger {

    static String typeOfbread;
    static String typeOfmeat;
    static boolean hasCheese;
    static String typeOfCheese;

    public Burger(String typeOfBread,String typeOfMeat, String typeOfCheese, boolean hasCheese){
        this.typeOfbread = typeOfbread;
        this.typeOfmeat = typeOfmeat;

        if(hasCheese){
            this.typeOfCheese = typeOfCheese;
        }
    }

    public Burger(String typeOfbread, String typeOfmeat, boolean hasCheese){
        typeOfbread = typeOfbread;
        typeOfmeat = typeOfmeat;
        hasCheese = hasCheese;
    }
}
