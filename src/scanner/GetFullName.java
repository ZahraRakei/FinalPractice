package scanner;

import java.util.Scanner;

public class GetFullName {

    static public String getFullName(){
        String fullName = "";

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first name:");
        String fname = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter last name:");
        String lname = s2.nextLine();

        fullName = fname + " " + lname;
       return  fullName;
    }

    public static void main(String[] args) {
        System.out.println(getFullName());
    }
}
