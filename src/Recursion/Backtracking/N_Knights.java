package Recursion.Backtracking;


import java.util.Scanner;

public class N_Knights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] board = new boolean[n][m];

        place_N_Knights(board , 0 , 0 , 0);
    }

    static void place_N_Knights(boolean[][] board , int r , int c , int K_nigths_placed_so_far){
//        BASE CONDITION
        if(K_nigths_placed_so_far == board.length){
            print_board(board);
            return;
        }

        if(c == board[0].length){
            r = r+1;
            c = 0;
        }

//        BASE CONDITION
        if(r == board.length){
            return;
        }

        if(isSafe(board , r , c)){
            board[r][c] = true;

            place_N_Knights(board , r , c+1 , K_nigths_placed_so_far + 1);

            board[r][c] = false;
        }

        place_N_Knights(board , r , c+1 , K_nigths_placed_so_far);

    }

    private static void print_board(boolean[][] board) {

        for (int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j]){
                    System.out.print("K ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }

    static boolean isSafe(boolean[][] board , int r , int c){

//        LEFT-UPPER
        if(r-2 >= 0 && c-1 >= 0){
            if(board[r-2][c-1]){
                return false;
            }
        }

//        LEFT-DOWN
        if(r-1 >= 0 && c-2 >= 0){
            if(board[r-1][c-2]){
                return false;
            }
        }

//        RIGHT-UPPER
        if(r-2 >= 0 && c+1 < board[0].length){
            if(board[r-2][c+1]){
                return false;
            }
        }

//        RIGHT-DOWN
        if(r-1 >= 0 && c+2 < board[0].length){
            if(board[r-1][c+2]){
                return false;
            }
        }

        return true;
    }
}
