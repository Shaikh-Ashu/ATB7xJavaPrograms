package Date_20_07_24;

import java.util.Scanner;

public class lab092_Day_Program {
    public static void main(String[] args) {

        // If Else - Condition  ( If, else If , else) - multiple condition

        // Switch - Better way to 2+ condition
        // Which day it is - Day to from 1 to 7

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day from 1 to 7, will tell what day it is");
        int day = sc.nextInt();
       

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No Idea what day it is");
        }
        System.out.println("----==== Outside the loop =====------");
    }
}
