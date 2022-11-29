package controlFlow;

public class ForEachSample {

    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7,47,93,};
        printEach(arr1);
    }
    public static void printEach(int[] arr){

        for (int i:arr){
            String y= " the number is : " + i;
            System.out.println(y);
        }

    }



}
