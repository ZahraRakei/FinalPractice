package dataStructures;

public class ArrayPractice {

    public static void main(String[] args) {

    int[] nums;
    nums = new int[7];

    IntroToDataStructures I1 = new IntroToDataStructures(1,"learnArray", 10);
    IntroToDataStructures I2 = new IntroToDataStructures(2, "arrayObjects", 12);
    IntroToDataStructures I3 = new IntroToDataStructures(3,"Cypress", 49);
    IntroToDataStructures I4 = new IntroToDataStructures(4,"tutorial",20);


        System.out.println(I1);

    IntroToDataStructures[] objArr = new IntroToDataStructures[4];
    objArr[0] = I1;
    objArr[1] = I2;
    objArr[2] = I3;
    objArr[3] = I4;

        System.out.println(objArr);

    }
}
