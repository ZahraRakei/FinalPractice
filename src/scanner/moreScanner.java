package scanner;

import java.util.Scanner;

public class moreScanner {

    public static void main(String[] args) {
        System.out.println("How old are you??");
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int age = s.nextInt();
            if (age < 40) {
                System.out.println("you are young");
            } else {
                System.out.println(age + " is a good age");
            }

        }
    }
}
