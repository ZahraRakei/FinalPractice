public class Static {

    public static void main(String[] args) {


        House h1 = new House();

        House h2 = new House();
        h1.color = "white";

        h2.color = "blue";

        System.out.println(h1.color);
        System.out.println(h2.color);

    }
}
