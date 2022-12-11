package sorting;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] myUnsortedArray = {5, 56, 93, 23, 5, 1, 94, 345, 67, 34};

        System.out.println("Unsorted array: " );
        for (int x: myUnsortedArray){
            System.out.print(x + ", ");
        }

        int temp;
        for (int i=0; i<myUnsortedArray.length; i++) {
            for (int j = i + 1; j < myUnsortedArray.length; j++) {
                if (myUnsortedArray[i]> myUnsortedArray[j]){
                    temp = myUnsortedArray[i];
                   myUnsortedArray[i] = myUnsortedArray[j];
                   myUnsortedArray[j] = temp;
                }
            }
        }
        System.out.println("\nSorted array: ");
        for (int x: myUnsortedArray){
            System.out.print(x + ", ");
        }


    }
}
