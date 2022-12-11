package challenges;

public class ThreeProgrammersChallenge {

    public static void main(String[] args) {

        System.out.println(getDifferenceInWage(450, 978,450));
    }

    public static int getDifferenceInWage(int wage1, int wage2, int wage3){

        int largestWage = 0;
        int smallestWage = 0;

        if ((wage1 > wage2) && (wage1 > wage3) && (wage2 != wage3)){
            largestWage = wage1;
        }
        if ((wage2 >wage1) && (wage2 > wage3) && (wage1 != wage3)){
            largestWage = wage2;
        }
        if ((wage3 > wage1) && (wage3 > wage2) && (wage1 != wage2)){
            largestWage = wage3;
        }


        if ((wage1 < wage2) && (wage1 < wage3) && wage2 != wage3){
            smallestWage = wage1;
        }
        if ((wage2 < wage1) && (wage2 < wage3) && wage1 != wage3){
            smallestWage = wage2;
        }
        if ((wage3 < wage1) && (wage3 < wage2) && wage1 != wage3) {
            smallestWage = wage3;
        }




        return largestWage - smallestWage;
    }
}
