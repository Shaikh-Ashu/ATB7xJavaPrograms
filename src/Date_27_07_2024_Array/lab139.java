package Date_27_07_2024_Array;

import java.util.Scanner;

public class lab139 {
    public static void main(String[] args) {
        int[] marks = new int[4];
        //length 4
        // index 0,1,2,3,
        System.out.println(marks[0]); // o/p zero
        System.out.println(marks[1]); // o/p zero
        System.out.println(marks[2]); // o/p zero
        System.out.println(marks[3]); // o/p zero

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        marks[0] = sc.nextInt();
        marks[1] = 99;
        marks[2] = 100;
        marks[3] = 88;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        boolean[] is_married = {true, false, true};
        // To Print

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(i + "-->" + marks[i]);
//            System.out.println(marks[i]);
        }


            String weekDays[] = {"Sunday", "Monday", "Wednesday", "Thursday", "Friday", "Saturday"};

            for (int i = 0; i < weekDays.length ; i++) {
                System.out.println(weekDays[i]);
                
            }




        }
    }


