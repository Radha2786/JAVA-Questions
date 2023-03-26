package Recursion.MAZE_PROBLEMS;

import java.util.Scanner;

public class Print_Path_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] board = new boolean[n][m];
        int[][] ans = new int[n][m];

        paths(board , 0 , 0 , ans , 1);

    }


//    MOVE IN ALL DIRECTIONS
    static void paths(boolean[][] board , int current_row , int current_col , int[][] ans , int step){
        if(current_row == board.length-1 && current_col == board[0].length-1){
//            System.out.println(ans);
            ans[current_row][current_col] = step;
            printBoard(ans);
            ans[current_row][current_col] = 0;
            return;
        }

        if(current_row == board.length || current_row == -1 || current_col == board[0].length || current_col == -1 || board[current_row][current_col]){
            return;
        }

//        VISITED AT THAT BLOCK
        board[current_row][current_col] = true;

        ans[current_row][current_col] = step;

        int[] row = {1,-1,0,0};
        int[] col = {0,0,-1,1};

        for(int i = 0 ; i < row.length ; i++){
            paths(board , current_row + row[i] , current_col + col[i] , ans , step+1);
        }

//        UN-VISIT THE PATH
        board[current_row][current_col] = false;

        ans[current_row][current_col] = 0;

    }

    static void printPath(int[][] board , int r , int c , int step){
//        BASE CONDITION
        if(r == board.length-1 && c == board[0].length-1){
            board[r][c] = step;
            printBoard(board);
            board[r][c] = 0;
            return;
        }

        if(r == board.length || c == board[0].length){
            return;
        }

        board[r][c] = step;

//        MOVE VERTICALLY
        printPath(board , r+1 , c , step+1);

//        MOVE HORIZONTALLY
        printPath(board , r , c+1 , step+1);

        board[r][c] = 0;
    }

    private static void printBoard(int[][] board) {

        for(int i = 0 ; i < board.length ; i++){
            for (int j = 0 ; j < board[0].length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
