package scanner;

import java.util.Scanner;

public class ScannerPractice {


    public static String getfname(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fname = scanner.nextLine();
        return fname;
    }

    public static String getlname(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your last name:");
        String lname = scanner.nextLine();
        return lname;
    }

    public static void main(String[] args) {


        getfname();
        getlname();




    }
//public static void main(String[] args) {
//
//
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter first name:");
//    String fname = sc.nextLine();
//
//    Scanner sc1 = new Scanner(System.in);
//    System.out.println("Enter lname:");
//    String lname = sc.nextLine();
//
//    System.out.println(fname + " "+ lname);
//
//
//}
}
