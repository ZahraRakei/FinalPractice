public class Calculator {

    public static int addition(int a, int b) {
        int c = a + b;

        System.out.println(c);
        return c;
    }

    static int subtraction(int a, int b) {
        int c = a - b;
        System.out.println(c);
        return c;
    }

    static int remainder(int a, int b) {
        System.out.println(a % b);
        return a % b;
    }


    //dgdfhtrh

    int multiplication(int a, int b) {
        int c = a * b;
        System.out.println(c);
        return c;
    }

    void division(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("my name is \"Mary\"");
        String a = "Hi";
        String b = "Hello";
        int c = 8;
        String d = "hi";
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));
        System.out.println(a.equals(d));
        System.out.println(a.equalsIgnoreCase(d));

        int g = 90;
        Integer h = new Integer(g);

        int t = Integer.valueOf(g);
    }
}
