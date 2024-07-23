package Date_20_07_24;

import java.util.Scanner;

public class lab087 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number, will print even or odd");

        int num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("even");

        }else {
            System.out.println("odd");
        }
    }
}
