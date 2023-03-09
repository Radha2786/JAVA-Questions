package Recursion.MAZE_PROBLEMS;

public class Move_In_All_Directions {
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        allPaths(board , 0 , 0 , "");
    }

    static void allPaths(boolean[][] board , int r , int c , String ans){
//        BASE CONDITION
        if(r == board.length-1 && c == board[0].length-1){
            System.out.println(ans);
            return;
        }

        if(r == board.length || r == -1 || c == board[0].length || c == -1 || board[r][c] == true){
            return;
        }

//        MAKE CHANGES
        board[r][c] = true;

//        MOVE DOWN
        allPaths(board , r+1 , c, ans+"D");

//        MOVE UP
        allPaths(board , r-1 , c , ans+"U");

//        MOVE LEFT
        allPaths(board , r , c-1 , ans+"L");

//        MOVE RIGHT
        allPaths(board , r , c+1 , ans+"R");


//        UNDO CHANGES
        board[r][c] = false;
    }
}
