package LEETCODE;

import java.util.Scanner;

public class NQueensRevision {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        boolean[][] board = new boolean[3][3];
        Place_queens(board ,0,0);
    }
    static void Place_queens(boolean[][] board , int row, int queens_placed_so_far){
        if(queens_placed_so_far==board.length){
            display(board);
            return ;
        }
        for(int c=0 ; c<board[0].length ; c++){
            if(isSafe(board,row,c)){
                board[row][c]=true;
                Place_queens(board,row+1,queens_placed_so_far+1);
                board[row][c]=false;

            }
        }

    }
    private static boolean isSafe(boolean[][] board, int row, int c){
        //upside
        for(int r=row-1 ; r>=0 ; r--){
            if(board[r][c]){
                return false;
            }
        }
//        left diagonal
        for(int r=row-1 , col=c-1 ; r>=0 && col>=0 ; r--,col--){
            if(board[r][col]){
                return false;
            }
        }
        //right diagonal
        for(int r=row-1 , col=c+1 ; r>=0 && col<board[0].length ; r-- , col++){
            if(board[r][col]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board){
        for(int i=0;i<board.length ; i++){
            for(int j=0;j<board[0].length ; j++){
                if(board[i][j]){
                    System.out.print("Q");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
