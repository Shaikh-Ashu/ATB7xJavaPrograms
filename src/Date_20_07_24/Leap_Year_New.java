package Date_20_07_24;

import java.util.Scanner;

public class Leap_Year_New {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=sc.nextInt();

        if ((year%4==0 && year%100 !=0) || (year%400==0)) {
            System.out.println("Year is leap Year");

        }else {
            System.out.println("Not a Leap Year");
        }
    }
}
