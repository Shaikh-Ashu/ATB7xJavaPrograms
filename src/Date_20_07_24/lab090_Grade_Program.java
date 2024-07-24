package Date_20_07_24;

import java.util.Scanner;

public class lab090_Grade_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score");
        int score = sc.nextInt();


        //char grade = 'f';
        if (score >=90 && score<=100) {
            System.out.println("Congratulations! Your grade is -- A");

//         grade = 'A';
        } else if (score >=70 && score<=89) {
            System.out.println("Congratulations! Your grade is -- B");
//            grade = 'B';
            
        } else if (score >=35 && score <=69) {
            System.out.println("Congratulations! Your grade is -- C");
            
//            grade = 'C'

        } else if (score>100) {
            System.out.println("LOL, You are a GOD");
        } else {
//            grade= 'F';
            System.out.println("Sorry! Simmu, You are fail");
        }




    }
}
