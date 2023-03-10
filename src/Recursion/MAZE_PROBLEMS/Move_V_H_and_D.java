package Recursion.MAZE_PROBLEMS;

public class Move_V_H_and_D {
    public static void main(String[] args) {
//        boolean[][] board = new boolean[4][4];

        paths(3 , 0 , 0 , "");

    }

    static void paths(int board_length , int current_row , int current_col , String ans){
        if(current_row == board_length-1 && current_col == board_length-1){
            System.out.println(ans);
            return;
        }

        if(current_row == board_length || current_col == board_length){
            return;
        }

//        MOVE VERTICALLY
        paths(board_length, current_row+1 , current_col , ans + "V");

//        MOVE HORIZONTALLY
        paths(board_length , current_row , current_col + 1  , ans + "H");

//        MOVE DIAGONALLY
        paths(board_length , current_row+1 , current_col + 1  , ans + "D");
    }
}
