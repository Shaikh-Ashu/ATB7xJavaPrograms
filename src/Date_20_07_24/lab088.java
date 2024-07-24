package Date_20_07_24;

import java.util.Scanner;

public class lab088 {
    public static void main(String[] args) {
        // max Number within 2 Digit/Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num1");
        int num1=sc.nextInt();

        System.out.println("Enter Num2");
        int num2=sc.nextInt();
//        int num1 = 40;
//        int num2= 30;

        if (num1 > num2) {
            System.out.println(num1 + "<----This is the Max Number");
            
        } else if (num2 > num1) {
            System.out.println(num2 + "<----This is the Max Number");

        }else {
            System.out.println("Both Numer are equals");
        }


    }
}
