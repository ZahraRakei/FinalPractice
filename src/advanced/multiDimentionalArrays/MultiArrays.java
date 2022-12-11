package advanced.multiDimentionalArrays;

public class MultiArrays {

    public static void main(String[] args){

        int[][] myArray = new int[2][5];

        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[0][3] = 4;
        myArray[0][4] = 5;

        myArray[1][0] = 10;
        myArray[1][1] = 20;
        myArray[1][2] = 30;
        myArray[1][3] = 40;
        myArray[1][4] = 50;


        for (int i=0; i<2; i++){
            for (int j = 0; j<5; j++){
                System.out.println(myArray[i][j]);
            }
            // after iteration of inner loop, print a line of stars
            System.out.println("*********");
        }
    }
}
