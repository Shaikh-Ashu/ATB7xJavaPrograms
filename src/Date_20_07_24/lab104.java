package Date_20_07_24;

import java.util.Scanner;

public class lab104 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter value-1");
        int value1=sc.nextInt();

        System.out.println("Enter value-2");
        int value2= sc.nextInt();

        System.out.println( "Enter value-3");
        int value3=sc.nextInt();

        if (value1>= value2 && value1>=value3) {
            System.out.println(value1);


        } else if (value2>=value1 && value2>= value3) {
            System.out.println(value2);
        }
        else {
            System.out.println(value3);
        }
    }
}
