package Date_27_07_2024_Array;

import java.util.Scanner;

public class lab146 {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject.
        // Figure inputs - float, scanner class

        Scanner sc= new Scanner(System.in);

    float[] marks= new float[5];

        for (int i = 0; i <marks.length ; i++) {
            System.out.println("Enter the marks of the Sub-" + (i+1));
            marks[1]=sc.nextFloat();
        }
float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg is--"+ avg);

    }
}





































