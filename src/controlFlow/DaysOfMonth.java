package controlFlow;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        System.out.println(daysOfMont(2,2020));
    }

    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if (year < 1 || year> 99999){
            System.out.println("enter valid year");
            return isLeapYear;
        }
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                isLeapYear = true;
            }
        return isLeapYear;
        }


    public static int daysOfMont(int month, int year) {
        int numOfDays = -1;
        if ((month<1 || month>12) || (year<1 || year>9999)){
            System.out.println("enter correct values");
            return numOfDays;
        }
        if (isLeapYear(year)) {
            switch (month){
                case 1:
                    numOfDays = 31;
                    break;
                case 2:
                    numOfDays = 29;
                    break;
                case 3:
                    numOfDays = 31;
                    break;
                case 4:
                    numOfDays = 30;
                    break;
                case 5:
                    numOfDays = 31;
                case 6:
                    numOfDays = 30;
                    break;
                case 7:
                    numOfDays = 31;
                    break;
                case 8:
                    numOfDays = 31;
                    break;
                case 9:
                    numOfDays = 30;
                case 10:
                    numOfDays = 31;
                case 11:
                    numOfDays = 30;
                case 12:
                    numOfDays = 31;
            }
            if (!isLeapYear(year)){

                switch (month){
                    case 1:
                        numOfDays = 31;
                        break;
                    case 2:
                        numOfDays = 28;
                        break;
                    case 3:
                        numOfDays = 31;
                        break;
                    case 4:
                        numOfDays = 30;
                        break;
                    case 5:
                        numOfDays = 31;
                    case 6:
                        numOfDays = 30;
                        break;
                    case 7:
                        numOfDays = 31;
                        break;
                    case 8:
                        numOfDays = 31;
                        break;
                    case 9:
                        numOfDays = 30;
                    case 10:
                        numOfDays = 31;
                    case 11:
                        numOfDays = 30;
                    case 12:
                        numOfDays = 31;
                }
            }

        }

        return numOfDays;
        }

}

