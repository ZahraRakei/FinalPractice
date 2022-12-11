package algorythm;

public class Numbers {
    public static <Sort> void main(String[] args) {

        ConnectToSqlDb connectToSqlDb = new ConnectToSqlDb();

        int[] num = new int[1000000];
        storeRandomNumbers(num);

        //selection sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.

    }
}
