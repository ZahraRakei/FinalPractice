package sorting;

public class CompareThreeNums {

    public static void main(String[] args) {

        int a =8;
        int b=4;
        int c = 7;

        if (a>b){

            if (a>c){
                System.out.println("a is the biggest number : " + a);
            } else if (c>a){
                System.out.println("c is biggest" + c);
            }
            } else if (a<b) {
            if (b > c)
                System.out.println("b is the biggest" + b);
        } else if (c>b){
            System.out.println("c is the biggest" + c);
        }

    }
}
