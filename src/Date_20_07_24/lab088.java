package Date_20_07_24;

import java.util.Scanner;

public class lab088 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Age:1");
        int Sudhir_age=sc.nextInt();

        System.out.println("Enter age:2");
        int Ashpak_age= sc.nextInt();

        if (Sudhir_age > Ashpak_age) {
            System.out.println("Max age-->" + Sudhir_age);

        } else if (Ashpak_age > Sudhir_age) {
            System.out.println("max age-->" +Ashpak_age);

        }else {
            System.out.println("Both Number's are Equal");
        }
    }
}
