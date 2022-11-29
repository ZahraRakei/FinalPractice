package controlFlow;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] ar = {4, 6, 89, 56, 345, 86, 9, 3, 0, 2};
        evenNums(ar);
    }

    static void evenNums(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }


    }
}
