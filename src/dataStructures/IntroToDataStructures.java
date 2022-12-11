package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class IntroToDataStructures {

    static int number;
    static String title;
    static int numberOfLines;



    public IntroToDataStructures(int number, String title, int numberOfLines) {
        this.number=number;
        this.title = title;
        this.numberOfLines =numberOfLines;
    }

    public static void main(String[] args) {

        int[] myIntArray = new int[100];
        myIntArray[55] = 436;
        List myIntArrayl = new ArrayList<>();
        myIntArrayl.size();

        int[] myIntArray2 = {5, 20,395, 3661, 33, 65, 32, 77};
        myIntArray2[2]=75;
        System.out.println(myIntArray[3]+ "\n"+ myIntArray2[5]);
    }
}
