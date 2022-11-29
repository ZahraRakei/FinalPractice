import java.util.Scanner;

public class ScannerSumUp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i=0;i<5; i++){
            System.out.println("enter a number:");
            sum += scanner.nextInt();


        }
        System.out.println(sum);
    }
}
