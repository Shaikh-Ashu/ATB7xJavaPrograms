package Date_21_07_24;

import java.util.Scanner;

public class lab130 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Num, will print a factorial of that number");
        int n = sc.nextInt();

        int fact=1;

        for (int i = 1; i <=n ; i++) {
            fact = fact*i;

        }
        System.out.println(fact);
        sc.close();
    }
}
