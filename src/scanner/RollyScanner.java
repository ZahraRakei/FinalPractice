package scanner;

import java.util.Scanner;

public class RollyScanner {

    public static void main(String[] args) {

        int[] sampleArray = {24, 45, 23, 12, 87, 6, 9, 5, 56, 45, 1, 23, 23,};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            for (int i : sampleArray) {
                if (i == number) {
                    System.out.println("we have your number " + number + " in our array");
                }
            }

        }
    }
}
