package Date_20_07_24;

import java.util.Scanner;

public class Age_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Sorry! you are not able to Vote");
        }else {
            System.out.println("Yes! you are able to Vote");
        }
    }
}
