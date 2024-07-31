package Date_27_07_2024_Array;

public class lab138 {
    public static void main(String[] args) {
        int [] marks_12th_board = {90,11,96,99,100,400};
        // elements are fixed
        // lenght 6
        System.out.println(marks_12th_board);
        System.out.println(marks_12th_board[0]); //90
        System.out.println(marks_12th_board[1]);//11
        System.out.println(marks_12th_board[2]);//96
        System.out.println(marks_12th_board[3]);//99
        System.out.println(marks_12th_board[4]);//100
        System.out.println(marks_12th_board[5]);//400
        System.out.println(marks_12th_board[-1]);// ArrayIndexOutOfBoundsException
    }
}
