package dataStructures;

public class MyArray {

   static int[] arr = {3,4,6,7,4,2};
    int[] arr2 = new int[60];
    static String[] arr3 = new String[80];
    static int[] arr4 = new int[30];

    public static void main(String[] args) {
        System.out.println(arr.length);
        System.out.println(arr3.length);
//        for (int i=0; i<arr3.length;i++){
//            System.out.println(arr3[i]);
//            arr[3]=5;
//        }
        arr3[45]="Hi";
        System.out.println(arr3[50]);
        System.out.println(arr4[10]);
        String s1 = "Hello World!";
        String s2 = "Hello world!";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        }

    }

