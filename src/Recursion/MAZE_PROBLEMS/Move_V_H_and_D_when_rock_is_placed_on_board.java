package Recursion.MAZE_PROBLEMS;

public class Move_V_H_and_D_when_rock_is_placed_on_board {
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        board[2][0] = true;
        allPaths(board , 0 , 0 , "");
    }

    static void allPaths(boolean[][] board , int current_row , int current_col , String ans){


        if(current_row == board.length-1 && current_col == board[0].length-1){
            System.out.println(ans);
            return;
        }

        if(current_row == board.length || current_col == board[0].length || board[current_row][current_col] == true){
            return;
        }


//        MOVE VERTICALLY
        allPaths(board , current_row+1 , current_col , ans+"v");

//        MOVE HORIZONTALLY
        allPaths(board , current_row , current_col+1 , ans+"h");


//        MOVE DIAGONALLY
        allPaths(board , current_row+1 , current_col+1 , ans+"d");

    }
}
