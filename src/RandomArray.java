public class RandomArray {

    public static void main(String[] args) {


        int[] rand = new int[13];
        for (int i =0;i<13; i++){
            rand[i]  = (int) Math.random();
            System.out.println(rand[i]);
        }
        System.out.println(rand);

    }
}
