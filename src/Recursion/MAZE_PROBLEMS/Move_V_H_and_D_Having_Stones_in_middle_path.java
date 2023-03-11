package Recursion.MAZE_PROBLEMS;

public class Move_V_H_and_D_Having_Stones_in_middle_path {
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        board[1][1] = true;
        paths(board , 0 , 0 , "");
    }

    static void paths(boolean[][] board , int current_row , int current_col , String ans){
        if(current_row == board.length-1 && current_col == board[0].length-1){
            System.out.println(ans);
            return;
        }

        if(current_row == board.length || current_col == board[0].length || board[current_row][current_col] == true){
            return;
        }

//        MOVE VERTICALLY
        paths(board, current_row+1 , current_col , ans + "V");

//        MOVE HORIZONTALLY
        paths(board , current_row , current_col + 1  , ans + "H");

//        MOVE DIAGONALLY
        paths(board , current_row+1 , current_col + 1  , ans + "D");
    }
}
