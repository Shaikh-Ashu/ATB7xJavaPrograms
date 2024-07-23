package Date_20_07_24;

import java.util.Scanner;

public class lab082
{
    public static void main(String[] args) {
        // Condition and Loops
        //
        // Condition ?
        // age  > 18 -> you allowed to / Vote
        //
        //  if age > 18 -> vote, else -> not allowed.

        // Condition - Java -> switch , If
        // syntax
//        if (condition ==> true or false){
//
//        }else{
//
//        }
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a age, will tell you its allow to Vote or Not:");
        int age= sc.nextInt();


        if (age <= 18) {
            System.out.println("Not allowed to Vote");

        }else {
            System.out.println("Allow to Vote");
        }


    }


}
