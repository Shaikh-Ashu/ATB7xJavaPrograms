package Date_20_07_24;

import java.util.Scanner;

public class Grade_with_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int marks=sc.nextInt();
        // 90/10--9---90-99(A)
        // 80/10---8--80-89(B)
        // 70/10---7--70-79(C)

        marks=marks/10;
        System.out.println(marks);
        switch (marks){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
            default:
                System.out.println("fail");
        }
    }
}
