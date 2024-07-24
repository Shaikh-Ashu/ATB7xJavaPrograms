package Date_20_07_24;

import java.util.Scanner;

public class lab101 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.next();

        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        System.out.println("Enter Your Sallary");
        double sallary =sc.nextDouble();

        System.out.println("Your Name is --->"+ name);
        System.out.println("Your age is---->"+ age);
        System.out.println("Your sallary is---->"+ sallary);


        sc.close();
    }
}
