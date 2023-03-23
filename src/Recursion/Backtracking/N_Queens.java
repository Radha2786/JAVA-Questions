package Recursion.Backtracking;

public class N_Queens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        placeQueens(board , 0 , 0);
    }

    static void placeQueens(boolean[][] board , int r , int queens_placed_so_far){
        if(queens_placed_so_far == board.length){
            display(board);
            return;
        }

        for(int col = 0 ; col < board[0].length ; col++){
            if(isSafe(board , r , col)){
//                PLACED QUEENS
                board[r][col] = true;
                placeQueens(board , r+1 , queens_placed_so_far+1);

//                UNDO-CHANGES
                board[r][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row , int col) {
//        UPSIDE
        for(int r = row-1 ; r >= 0 ; r--){
            if(board[r][col]){
                return false;
            }
        }

//        LEFT-DIAGONAL
        for(int r = row-1 , c = col-1 ; r >= 0 && c >= 0; r-- , c--){
            if(board[r][c]){
                return false;
            }
        }

//        RIGHT-DIAGONAL
        for(int r = row-1 , c = col+1 ; r >= 0 && c < board[0].length; r-- , c++){
            if(board[r][c]){
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j]){
                    System.out.print("q ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
