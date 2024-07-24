package Date_20_07_24;

import java.util.Scanner;

public class lab094_Vowel_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you is vowel or Not! ");
        char user_input=sc.next().charAt(0);
//        System.out.println(user_input);

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
            case'u':
                System.out.println("Vowel");
            default:
                System.out.println("Not a Vowel, It is Consonant");
        }

//        other way to Write a program
        switch (user_input){
            case 'a', 'e','i','o','u':
                System.out.println("It is Vowel");
                break;
            default:
                System.out.println("It is Consonant");
        }
    }
}
