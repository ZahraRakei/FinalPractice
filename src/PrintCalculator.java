import java.util.Scanner;

public class PrintCalculator {

    public static void main(String[] args) {
        Calculator.addition(2,5);
        Calculator.subtraction(6,3);
        Calculator c = new Calculator();
        c.division(15,3);
        c.multiplication(0,5);

        Cons v = new Cons();
        System.out.println(v);

        Scanner stdin = new Scanner(System.in);
    }
}
