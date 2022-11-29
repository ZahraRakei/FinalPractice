package dataStructures;

public class ArrayMax {

    public static void main(String[] args) {

        int[] arr = {73,5,34,78,56,3,5,8,90};
        int max = 0;
        for (int i = 0;i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
