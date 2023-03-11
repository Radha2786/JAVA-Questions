package Recursion.MAZE_PROBLEMS;

public class Move_in_all_directions {
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        paths(board , 0 , 0 , "");
    }

    static void paths(boolean[][] board , int current_row , int current_col , String ans){
        if(current_row == board.length-1 && current_col == board[0].length-1){
            System.out.println(ans);
            return;
        }

        if(current_row == board.length || current_row == -1 || current_col == board[0].length || current_col == -1 || board[current_row][current_col] == true){
            return;
        }

//        VISITED AT THAT BLOCK
        board[current_row][current_col] = true;

//        MOVE DOWN
        paths(board , current_row+1 , current_col , ans+"D");

//        MOVE UP
        paths(board , current_row-1 , current_col , ans+"U");

//        MOVE LEFT
        paths(board , current_row , current_col-1 , ans+"L");

//        MOVE RIGHT
        paths(board , current_row , current_col+1 , ans+"R");


//        UN-VISIT THE PATH
        board[current_row][current_col] = false;

    }
}
